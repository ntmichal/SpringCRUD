package com.emprateapp2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emprateapp2.dao.OcenyDAO;
import com.emprateapp2.entity.Oceny;

@Service
public class OcenyServiceImpl implements OcenyService {

	@Autowired
	private OcenyDAO ocenyDAO;
	
	@Override
	@Transactional
	public void saveOceny(Oceny theOceny) {
		ocenyDAO.saveOceny(theOceny);

	}

}
