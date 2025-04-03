package com.fst.second.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.fst.second.SecondApplication.produits;
import com.fst.second.entities.produit;
@Controller
@RequestMapping("produits")
public class produitController {
@RequestMapping("liste")
public String ListeProduits(Model model) {
	model.addAttribute("produits" , produits);
	return "afficher";
    }
@PostMapping("add")
public String ajouter( @RequestParam ("nom")String nom, @RequestParam("description")String description, @RequestParam("quantite")int quantite, @RequestParam("prixUnitaireHTC")double prixUnitaireHTC, @RequestParam("prixTotalTTC")double prixTotalTTC)
{
int id= produits.size();
id++;
produit p= new produit(nom,description,quantite,prixUnitaireHTC,prixTotalTTC);
p.setId(id);
produits.add(p);
return"redirect:liste";
}

@GetMapping ("add")
public String add()
{
	return "ajouter";
}
@GetMapping("supprimer/{id}")
public String supprimer(@PathVariable ("id")int id) {
	for (produit p: produits) {
		if(id==p.getId()) {
			produits.remove(p);
			break;
		}
	}
	return"redirect:../liste";
}
@GetMapping("modifier/{id}")
public String maj(@PathVariable("id")int id, Model model) {
	for(produit p: produits) {
		if(p.getId()==id) {
			model.addAttribute(p);
		}
	}
		return "modifier";
	
}
	@PostMapping("modifier")
	public String modifier(@ModelAttribute("produit")produit produit) {
		for(produit p: produits) {
			if(p.getId()==produit.getId()) {
				p.setNom(produit.getNom());
				p.setDescription(produit.getDescription());
				p.setQuantite(produit.getQuantite());
				p.setPrixUnitaireHTC(produit.getPrixUnitaireHTC());
		
				
			}
		}
		return "redirect:liste";
	
}
}

