package com.niit.DAOTest;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UserDAO;
import com.niit.Sections.User;

public class UserDAOTest {
	static UserDAO userDAO;

	@SuppressWarnings("resource")
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setMobileNo("987654321");
		user.setPassword("lol");
		user.setUsername("Gowsi");
		user.setRole("ROLE_ADMIN");
		user.setEmail("gowsi@google.com");
		assertTrue("Problem in User Insertion",userDAO.addUser(user));
	}
    @Ignore
	@Test
	public void updateUserTest()
	{
		User user=userDAO.getUser(115);
	    user.setUsername("gowsi");
	    user.setRole("ROLE_ADMIN");
		assertTrue("Problem in Updation",userDAO.updateUser(user));
	}
    @Ignore
    @Test
	public void listUserTest()
	{
		List<User> listUser=userDAO.getUser();
		assertNotNull("No User",listUser);
		
		for(User user:listUser)
		{
			System.out.print(user.getUsername()+" ");
			System.out.print(user.getEmail()+" ");
			
		}
}
}