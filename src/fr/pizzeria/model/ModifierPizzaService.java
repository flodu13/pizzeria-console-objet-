package fr.pizzeria.model;

import java.util.Scanner;

public class ModifierPizzaService extends MenuService{


	public void executeUC(PizzaMemDaotp4 PMD, Scanner choix) {
	
		System.out.println("Mise à jour d’une pizza");
		System.out.println("Veuillez saisir le code de la pizza à mofifier");
		choix.nextLine();
		String codePizzamodif = choix.nextLine();
		
		
		System.out.println("Veuillez saisir le code :");
		choix.nextLine();
		String codePizzModif = choix.nextLine();
		
		System.out.println("Veuillez saisir le nom:");
		
		String nomPizzModif = choix.nextLine();
		
		System.out.println("Veuillez saisir le prix");
		double nouvPrix = choix.nextDouble();
	}
		

}
