package com.Foxy.FoxyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Foxy.FoxyBackend.dao.CategoryDAO;
import com.Foxy.FoxyBackend.dao.SupplierDAO;
import com.Foxy.FoxyBackend.model.Category;
import com.Foxy.FoxyBackend.model.Supplier;

public class SupplierTestCase
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.Foxy.FoxyBackend");
		context.refresh();
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");

	Supplier supplier=new Supplier(); 		
supplier.setAddress("Chennai");
supplier.setSuppName("Fathima");
		
supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("Supplier inserted");
	}

}
