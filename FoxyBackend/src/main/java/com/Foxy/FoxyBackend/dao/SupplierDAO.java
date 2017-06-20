package com.Foxy.FoxyBackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Foxy.FoxyBackend.model.Category;
import com.Foxy.FoxyBackend.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAO 
{
@Autowired
SessionFactory sessionFactory;
public SupplierDAO(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
	
}
@Transactional
public void insertUpdateSupplier(Supplier supplier)
{
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(supplier);
}
}
