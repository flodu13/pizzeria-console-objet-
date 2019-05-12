package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.PizzaException;

public class SupprimerPizzaService extends MenuService {

	public void executeUC(PizzaMemDaotp4 PMD, Scanner choix) throws PizzaException {
		System.out.println("Suppression d’une pizza");
		System.out.println("Veuillez saisir le code de la pizza à mofifier");
		choix.nextLine();
		String codePizzamodif = choix.nextLine();

		if (!PMD.pizzaExists(codePizzamodif) ) {
			throw new DeletePizzaException();
		}

		PMD.deletePizza(codePizzamodif);
	}
}
