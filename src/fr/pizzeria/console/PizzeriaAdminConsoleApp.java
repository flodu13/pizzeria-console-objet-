package fr.pizzeria.console;

import java.util.Scanner;
import fr.pizzeria.model.*;

public class PizzeriaAdminConsoleApp {
	
	
	public static void main(String[] args) {
		
		ListerPizzasService service = new ListerPizzasService();
		
		MenuService service2 = new ListerPizzasService();
		MenuService service3 = new AjouterPizzaService();
		MenuService service4 = new SupprimerPizzaService();
		MenuService service5 = new ModifierPizzaService();
		
		service.executeUC();
		
		service2.executeUC();
		service3.executeUC();
		service4.executeUC();
		service5.executeUC();
		
		
		
		Pizza [] tableauPizz= new Pizza [8];
		tableauPizz [0] =new Pizza("PEP","pépéroni", 12.50d);
		tableauPizz [1] =new Pizza ("MAR", "margherita", 14);
		tableauPizz [2] =new Pizza ("REIN", "la reine", 11.5d);
		tableauPizz [3] =new Pizza ("FRO", "la 4 fromages", 12);
		tableauPizz [4] = new Pizza ("Can", "cannibale", 12.5d);
		tableauPizz [5] = new Pizza ("SAV", "la savoyarde", 13);
		tableauPizz [6] = new Pizza ("ORI", "orientale", 13.5d);
		tableauPizz [7] = new Pizza ("IND", "indienne", 14);
	
	
		
		
		Scanner choix = new Scanner (System.in);
		int user =0;
		
		while ( user<99) {
			
		
		System.out.println("***** Pizzeria Administration ***** \r\n" + 
				"1. Lister les pizzas \r\n" + 
				"2. Ajouter une nouvelle pizza \r\n" + 
				"3. Mettre à jour une pizza \r\n" + 
				"4. Supprimer une pizza \r\n" + 
				"99. Sortir  ");
user = choix.nextInt();

		if (user==1) {
			System.out.println("Liste des pizzas");
		
			
			for(int i=0; i<tableauPizz.length; i++) {
				System.out.println(tableauPizz[i].code + " > " + tableauPizz[i].libelle + " (" + tableauPizz[i].prix + " €)");
			}
	}
		if (user==2) {
			System.out.println("Ajouter une nouvelle pizza");
			System.out.println("Veuillez saisir le code :");
			choix.nextLine();
			String codeNewPizz = choix.nextLine();
			
			System.out.println("Veuillez saisir le nom:");
			
			String nomNewPizz = choix.nextLine();
			
			System.out.println("Veuillez saisir le prix");
			
			double prixNewPizz = choix.nextDouble();
			
			Pizza pizza = new Pizza(codeNewPizz, nomNewPizz, prixNewPizz);
			
			Pizza [] tableauMenu2= new Pizza [tableauPizz.length+1];
			
			for(int i=0; i<tableauPizz.length; i++) {
				tableauMenu2[i]= tableauPizz[i];
			}
			tableauMenu2 [tableauPizz.length] =  new Pizza(codeNewPizz, nomNewPizz, prixNewPizz);
			tableauPizz = tableauMenu2;
		}
		if (user==3) {
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
			
			double prixPizzModif = choix.nextDouble();
			
			for (int i=0; i<tableauPizz.length; i++) {
				if(tableauPizz[i].code.equals(codePizzamodif)) {
					tableauPizz[i].code=codePizzModif;
					
				}
				
			}
			
			
		}
		if (user==4) {
			System.out.println("Suppression d’une pizza");
		}
		if (user==99) {
			System.out.println("Aurevoir");
		}
	}
	}
}
