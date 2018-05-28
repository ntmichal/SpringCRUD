package com.emprateapp2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pracodawcy")
public class Pracodawcy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
	
	@Column(name="Nazwa")
	private String Nazwa;
	
	@Column(name="Opis")
	private String Opis;
//	public Pracodawcy() {};
	
	@OneToMany(/*targetEntity = Oceny.class,*/ fetch = FetchType.EAGER, mappedBy="Pracodawca",cascade = {
			CascadeType.PERSIST, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	private List<Oceny> ocenyList;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNazwa() {
		return Nazwa;
	}

	public void setNazwa(String nazwa) {
		Nazwa = nazwa;
	}

	public String getOpis() {
		return Opis;
	}

	public void setOpis(String opis) {
		Opis = opis;
	}

	public List<Oceny> getOcenyList() {
		return ocenyList;
	}

	public void setOcenyList(List<Oceny> ocenyList) {
		this.ocenyList = ocenyList;
	}
	

}
