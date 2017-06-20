package com.Foxy.FoxyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.Foxy.FoxyBackend.dao.ProductDAO;
import com.Foxy.FoxyBackend.model.Product;


public class ProductTestCase {
	public static void main(String[] args)
	{
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.Foxy.FoxyBackend");
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		Product product=new Product();
		product.setProdName("Lakme");
		product.setProdDesc("Best product");
		
		productDAO.insertUpdateProduct(product);
		

			
		System.out.println("Product Inserted");
		
		//Retrieval TestCase
		
		/*Category category=categoryDAO.getCategory(2);
		System.out.println("Category Name:"+category.getCatname());
		System.out.println("Category Description:"+category.getCatdesc());*/
		
		//Deletion TestCase
		/*Category category=categoryDAO.getCategory(2);
		categoryDAO.deleteCategory(category);
		System.out.println("The Category Deleted");*/
		
		//Retrieving the Data
		
		/*List<Category> list=categoryDAO.getCategoryDetails();
		
		for(Category category:list)
		{
			System.out.println(category.getCatid()+":"+category.getCatname()+":"+category.getCatdesc());
		}*/
		
		//Update the Category
		/*Category category=categoryDAO.getCategory(3);
		category.setCatname("WifiEnMobile");
		categoryDAO.insertUpdateCategory(category);
		System.out.println("The Category Updated");*/
		
	}
}
	


