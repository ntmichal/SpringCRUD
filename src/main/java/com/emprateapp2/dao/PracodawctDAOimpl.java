package com.emprateapp2.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emprateapp2.entity.Pracodawcy;

@Repository
public class PracodawctDAOimpl implements PracodawcyDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Pracodawcy> getPracodawcy() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Pracodawcy> newQuery = 
				currentSession.createQuery("from Pracodawcy",Pracodawcy.class);
		
		List<Pracodawcy> pracodawcy = newQuery.getResultList();
		return pracodawcy;
	}

	@Override
	public Pracodawcy getPracodawca(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Pracodawcy pracodawca = currentSession.get(Pracodawcy.class,theId);
		
		return pracodawca;
	}

}
