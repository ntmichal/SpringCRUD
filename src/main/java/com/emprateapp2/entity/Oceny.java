package com.emprateapp2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="oceny")
public class Oceny {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
	
	//rewrite to OneToMany
	@ManyToOne(/*targetEntity = Pracodawcy.class,*/ cascade = {
			CascadeType.PERSIST, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="PracodawcaID")
	private Pracodawcy Pracodawca;
	
	@Column(name="Komentarz")
	private String Komentarz;
	
	@Column(name="kat1")
	private int kat1;
	
	@Column(name="kat2")
	private int kat2;
	
	@Column(name="kat3")
	private int kat3;
	
	@Column(name="kat4")
	private int kat4;
	
	@Column(name="kat5")
	private int kat5;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}



	public String getKomentarz() {
		return Komentarz;
	}

	public void setKomentarz(String komentarz) {
		Komentarz = komentarz;
	}

	public int getKat1() {
		return kat1;
	}

	public void setKat1(int kat1) {
		this.kat1 = kat1;
	}

	public int getKat2() {
		return kat2;
	}

	public void setKat2(int kat2) {
		this.kat2 = kat2;
	}

	public int getKat3() {
		return kat3;
	}

	public void setKat3(int kat3) {
		this.kat3 = kat3;
	}

	public int getKat4() {
		return kat4;
	}

	public void setKat4(int kat4) {
		this.kat4 = kat4;
	}

	public int getKat5() {
		return kat5;
	}

	public void setKat5(int kat5) {
		this.kat5 = kat5;
	}
	
	public Pracodawcy getPracodawca() {
		return Pracodawca;
	}

	public void setPracodawca(Pracodawcy pracodawca) {
		Pracodawca = pracodawca;
	}
}
