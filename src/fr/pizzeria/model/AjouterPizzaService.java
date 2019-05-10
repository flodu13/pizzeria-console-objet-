package fr.pizzeria.model;

import java.util.Scanner;

public class AjouterPizzaService extends MenuService {

	
	
	public void executeUC(PizzaMemDaotp4 PMD, Scanner choix) {
		
		System.out.println("Ajouter une nouvelle pizza");
		System.out.println("Veuillez saisir le code :");
		choix.nextLine();
		String codeNewPizz = choix.nextLine();
		
		System.out.println("Veuillez saisir le nom:");
		
		String nomNewPizz = choix.nextLine();
		
		System.out.println("Veuillez saisir le prix");
		double newPrix= choix.nextDouble();
		
		for(int i=0; i<PMD.alist.size(); i++) {
			PMD.alist.add(i, new Pizza(codeNewPizz, nomNewPizz, newPrix));
		
	}
	}
}