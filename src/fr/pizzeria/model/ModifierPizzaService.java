package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.PizzaException;
import fr.pizzeria.exception.UpdatePizzaException;

public class ModifierPizzaService extends MenuService {

	public void executeUC(PizzaMemDaotp4 PMD, Scanner choix) throws PizzaException {
		System.out.println("Mise à jour d’une pizza");
		System.out.println("Veuillez saisir le code de la pizza à mofifier");
		choix.nextLine();
		String codePizzamodif = choix.nextLine();

		if (!PMD.pizzaExists(codePizzamodif)) {
			throw new UpdatePizzaException();
		}

		System.out.println("Veuillez saisir le nom:");
		String nomPizzModif = choix.nextLine();

		System.out.println("Veuillez saisir le prix");
		double nouvPrix = choix.nextDouble();

		System.out.println("choisir catégorie");
		CategoriePizza[] categoriePizzas = CategoriePizza.values();
		for (int i = 0; i < categoriePizzas.length; i++) {
			System.out.print(i + " pour " + categoriePizzas[i] + ", ");
		}
		System.out.println();
		int indexCategorie = choix.nextInt();

		PMD.updatePizza(codePizzamodif, ///
				new Pizza(codePizzamodif, nomPizzModif, nouvPrix, categoriePizzas[indexCategorie]));
	}

}
