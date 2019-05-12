package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.PizzaException;
import fr.pizzeria.exception.SavePizzaException;

public class AjouterPizzaService extends MenuService {

	public void executeUC(PizzaMemDaotp4 PMD, Scanner choix) throws PizzaException {
		System.out.println("Ajouter une nouvelle pizza");
		System.out.println("Veuillez saisir le code :");
		choix.nextLine();
		String codeNewPizz = choix.nextLine();

		if (PMD.pizzaExists(codeNewPizz)) {
			throw new SavePizzaException();
		}

		System.out.println("Veuillez saisir le nom:");

		String nomNewPizz = choix.nextLine();

		System.out.println("Veuillez saisir le prix");
		double newPrix = choix.nextDouble();

		System.out.println("choisir catégorie");
		CategoriePizza[] categoriePizzas = CategoriePizza.values();
		for (CategoriePizza categorie : categoriePizzas) {
			System.out.print(categorie.ordinal() + " pour " + categorie + ", ");
		}
		System.out.println();
		int indexCategorie = choix.nextInt();

		PMD.saveNewPizza(new Pizza(codeNewPizz, nomNewPizz, newPrix, categoriePizzas[indexCategorie]));
	}
}