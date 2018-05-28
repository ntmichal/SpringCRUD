package com.emprateapp2.service;

import java.util.List;

import com.emprateapp2.entity.Pracodawcy;

public interface PracodawcyService {
	
	public List<Pracodawcy> getPracodawcy();

	public Pracodawcy getPracodawca(int theId);
}
