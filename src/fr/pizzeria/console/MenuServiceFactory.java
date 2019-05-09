package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.AjouterPizzaService;
import fr.pizzeria.model.ListerPizzasService;
import fr.pizzeria.model.ModifierPizzaService;
import fr.pizzeria.model.SupprimerPizzaService;

public class MenuServiceFactory {

	public static void main(String[] args) {
		
	Scanner questionUser = new Scanner (System.in);
	int a = questionUser.nextInt();
	PizzaMemDao PMD= new PizzaMemDAO();
	
	if (a==1) {
		ListerPizzasService b = new ListerPizzasService().executeUC(PMD);
	}if else (a==2){
		AjouterPizzaService b= new AjouterPizzaService ().executeUC(PMD);
	}if else (a==3){
		ModifierPizzaService b = new ModifierPizzaService().executeUC(PMD);
	}else (a==4){
		SupprimerPizzaService b= new SupprimerPizzaService ().executeUC(PMD);
	}
	}
}
