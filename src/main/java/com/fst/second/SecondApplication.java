package com.fst.second;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fst.second.entities.produit;

@SpringBootApplication
public class SecondApplication {
public static List<produit> produits= new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);
		produit p1= new produit (1, "produit1" , "desc1" , 45, 23.4);
		produit p2= new produit (2, "produit2" , "desc2" , 55, 20);
		produit p3= new produit (1, "produit1" , "desc3" , 65, 40);
		produits.add(p1);
		produits.add(p2);
		produits.add(p3);
	}

}
