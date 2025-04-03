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
	
	public produit(String nom, String description, int quantite, double prixUnitaireHTC) {
		super();
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.prixUnitaireHTC = prixUnitaireHTC;
		
	}
public produit() {}
	
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

	public double getPrixTotalTTC() {
		return prixTotalTTC;
	}

	public void setPrixTotalTTC(double prixTotalTTC) {
		this.prixTotalTTC = prixTotalTTC;
	}
	
	
	

}
