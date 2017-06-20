package com.Foxy.FoxyBackend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Foxy.FoxyBackend.model.User;

@Repository
public class UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	public UserDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		
	}
	@Transactional
	public void insertUpdateUser(User user)
	{
		
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
		// TODO Auto-generated method stub
		
	}


	
}

