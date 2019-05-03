package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {
	
	
	public static void main(String[] args) {
	
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
	}
		if (user==2) {
			System.out.println("Ajouter une nouvelle pizza");
		}
		if (user==3) {
			System.out.println("Mise à jour d’une pizza");
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
