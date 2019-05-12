package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.PizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		PizzaMemDaotp4 daotp4 = new PizzaMemDaotp4();

		Scanner choix = new Scanner(System.in);
		int user = 0;

		while (user < 99) {

			System.out.println("***** Pizzeria Administration ***** \r\n" + "1. Lister les pizzas \r\n"
					+ "2. Ajouter une nouvelle pizza \r\n" + "3. Mettre à jour une pizza \r\n"
					+ "4. Supprimer une pizza \r\n" + "99. Sortir  ");
			user = choix.nextInt();

			try {
				new MenuServiceFactory(user, choix, daotp4).executeUC();
		} catch (SavePizzaException e) {
			System.out.println("Duplication du code");
			} catch (UpdatePizzaException | DeletePizzaException e) {
				System.out.println("Code inexistant");
			} catch (PizzaException e) {
			}
		}
	}
}
