package com.niit.DAO;

import java.util.List;

import com.niit.Sections.Product;

public interface ProductDAO 
{
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public List<Product> getProducts();
    public Product getProduct(int productId);
}
