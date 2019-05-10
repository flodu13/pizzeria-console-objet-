package fr.pizzeria.model;

import java.util.Scanner;

public class SupprimerPizzaService extends MenuService{

	
	public void executeUC(PizzaMemDaotp4 PMD, Scanner choix) {
		for (Pizza pizza: PMD.alist) {
				
		PMD.alist.remove(pizza);
	}
		System.out.println("Suppression d’une pizza");
		
	}
		
	}
