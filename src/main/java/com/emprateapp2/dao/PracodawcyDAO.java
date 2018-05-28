package com.emprateapp2.dao;

import java.util.List;

import com.emprateapp2.entity.Pracodawcy;

public interface PracodawcyDAO {

	public List<Pracodawcy> getPracodawcy();

	public Pracodawcy getPracodawca(int theId);
}
