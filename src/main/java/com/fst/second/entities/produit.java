package com.fst.second.entities;

public class produit {
	private int id;
	private String nom;
	private String description;
	private int quantite;
	private double prixUnitaireHTC;
	private double prixTotalTTC;
	public produit(int id, String nom, String description, int quantite, double prixUnitaireHTC) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.prixUnitaireHTC = prixUnitaireHTC;
	}
	
	public produit(String nom, String description, int quantite, double prixUnitaireHTC, double prixTotalTTC) {
		super();
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.prixUnitaireHTC = prixUnitaireHTC;
		this.prixTotalTTC = prixTotalTTC;
	}

	public produit(double prixTotalTTC) {
		super();
		this.prixTotalTTC = prixUnitaireHTC * 1.19 ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrixUnitaireHTC() {
		return prixUnitaireHTC;
	}
	public void setPrixUnitaireHTC(double prixUnitaireHTC) {
		this.prixUnitaireHTC = prixUnitaireHTC;
	}
	public void setPrixTotalTTC(double prixTotalTTC) {
		this.prixTotalTTC = prixTotalTTC;
	}
	
	

}
