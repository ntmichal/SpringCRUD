package com.emprateapp2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emprateapp2.entity.Oceny;

@Repository
public class OcenyDAOimpl implements OcenyDAO {

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public void saveOceny(Oceny theOceny) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theOceny);
		
	}

}
