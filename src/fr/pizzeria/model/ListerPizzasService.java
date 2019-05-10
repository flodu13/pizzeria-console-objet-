package fr.pizzeria.model;

import java.util.List;
import java.util.Scanner;

public class ListerPizzasService extends MenuService{

	@Override
	public void executeUC(PizzaMemDaotp4 FR, Scanner choix) {
		
		List<Pizza> alist= FR.findAllPizzas();

		System.out.println("Liste des pizzas");
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i).code +" "+  alist.get(i).libelle+ " " + alist.get(i).prix);
		}

	}
}
