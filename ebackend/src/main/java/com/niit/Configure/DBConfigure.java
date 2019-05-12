package com.niit.Configure;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.DAO.CartDAO;
import com.niit.DAO.CartDAOimpl;
import com.niit.DAO.CategoryDAO;
import com.niit.DAO.CategoryDAOimpl;
import com.niit.DAO.OrderDetailDAO;
import com.niit.DAO.OrderDetailDAOimpl;
import com.niit.DAO.ProductDAO;
import com.niit.DAO.ProductDAOimpl;
import com.niit.DAO.SupplierDAO;
import com.niit.DAO.SupplierDAOimpl;
import com.niit.DAO.UserDAO;
import com.niit.DAO.UserDAOimpl;
import com.niit.Sections.Cart;
import com.niit.Sections.Category;
import com.niit.Sections.OrderDetail;
import com.niit.Sections.Product;
import com.niit.Sections.Supplier;
import com.niit.Sections.User;



 	
@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit.*")
  

public class DBConfigure {    
 	
	@Bean(name = "dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/ecommdb");
		datasource.setUsername("lol");
		datasource.setPassword("lol");
		System.out.println(">>>>>>Datasource object created<<<<<<");
		return datasource;
	}

	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateprop=new Properties();
		
		hibernateprop.put("hibernate.hbm2ddl.auto","update");
		hibernateprop.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getH2DataSource());

		factory.addProperties(hibernateprop);
		
		factory.addAnnotatedClass(Category.class);
		factory.addAnnotatedClass(Supplier.class);
		factory.addAnnotatedClass(Product.class);
		factory.addAnnotatedClass(Cart.class);
		factory.addAnnotatedClass(User.class);
		factory.addAnnotatedClass(OrderDetail.class);
		System.out.println(">>>>>>SessionFactory Object created<<<<<<");

		return factory.buildSessionFactory();
		
	}
	@Bean(name="TransactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println(">>>>>TransactionManager Object created<<<<<<");
		return new HibernateTransactionManager(sessionFactory);
	}
	@Bean(name="categoryDAO") 
			public CategoryDAO getCategoryDAO() {
		System.out.println("Category DAO Implementation");
				return new CategoryDAOimpl();
			}
	@Bean(name="supplierDAO") 
	public SupplierDAO getSupplierDAO() {
		System.out.println("Supplier DAO Implementation");
		return new SupplierDAOimpl();
	}
	@Bean(name="productDAO") 
	public ProductDAO getProductDAO() {
		System.out.println("Product DAO Implementation");
		return new ProductDAOimpl();
	}
	@Bean(name="cartDAO") 
	public CartDAO getCartDAO() {
		System.out.println("Cart DAO Implementation");
		return new CartDAOimpl();
	}
	@Bean(name="userDAO") 
	public UserDAO getUserDAO() {
		System.out.println("User DAO Implementation");
		return new UserDAOimpl();
	}
	@Bean(name="orderDetailDAO") 
	public OrderDetailDAO getOrderDetailDAO() {
		System.out.println("OrderDetail DAO Implementation");
		return new OrderDetailDAOimpl();
	}
	}