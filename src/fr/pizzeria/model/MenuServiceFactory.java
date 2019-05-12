package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.PizzaException;

public class MenuServiceFactory {
	int user = 0;
	Scanner choix;
	PizzaMemDaotp4 a;

	public MenuServiceFactory(int user, Scanner choix, PizzaMemDaotp4 PMD) {
		super();
		this.user = user;
		this.choix = choix;
		this.a = PMD;
	}

	public void executeUC() throws PizzaException {
		if (user == 1) {
			ListerPizzasService listerService = new ListerPizzasService();
			listerService.executeUC(a, choix);
		}
		if (user == 2) {
			AjouterPizzaService AjouterPizza = new AjouterPizzaService();
			AjouterPizza.executeUC(a, choix);
		}

		if (user == 3) {
			ModifierPizzaService modifierService = new ModifierPizzaService();
			modifierService.executeUC(a, choix);
		}
		if (user == 4) {
			SupprimerPizzaService supprimerService = new SupprimerPizzaService();
			supprimerService.executeUC(a, choix);
		}
		if (user == 99) {
			System.out.println("Aurevoir");
		}
	}
}