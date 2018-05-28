package com.emprateapp2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emprateapp2.dao.PracodawcyDAO;
import com.emprateapp2.entity.Pracodawcy;

@Service
public class PracodawcyServiceImpl implements PracodawcyService {

	@Autowired
	private PracodawcyDAO pracodawcyDAO;
	
	@Override
	@Transactional
	public List<Pracodawcy> getPracodawcy() {
		return pracodawcyDAO.getPracodawcy();
	}

	@Override
	@Transactional
	public Pracodawcy getPracodawca(int theId) {
		return pracodawcyDAO.getPracodawca(theId);
	}

}
