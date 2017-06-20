package com.Foxy.FoxyBackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Foxy.FoxyBackend.model.Product;

import com.Foxy.FoxyBackend.model.*;

@Repository("productDAO")
public class ProductDAO 
{
@Autowired
SessionFactory sessionFactory;
public ProductDAO(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
	
}
@Transactional
public void insertUpdateProduct(Product product)
{
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(product);
}


	





}
