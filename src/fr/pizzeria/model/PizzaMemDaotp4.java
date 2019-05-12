package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PizzaMemDaotp4 implements IPizzaDao {
	private ArrayList<Pizza> alist;

	public PizzaMemDaotp4() {
		alist = new ArrayList<Pizza>();
		alist.add(new Pizza(0, "PEP", "pépéroni", 12.50, CategoriePizza.VIANDE));
		alist.add(new Pizza(1, "MAR", "margherita", 14, CategoriePizza.SANS_VIANDE));
		alist.add(new Pizza(2, "REIN", "la reine", 11.5d, CategoriePizza.VIANDE));
		alist.add(new Pizza(3, "FRO", "la 4 fromages", 12, CategoriePizza.SANS_VIANDE));
		alist.add(new Pizza(4, "Can", "cannibale", 12.5d, CategoriePizza.VIANDE));
		alist.add(new Pizza(5, "SAV", "la savoyarde", 13, CategoriePizza.VIANDE));
		alist.add(new Pizza(6, "ORI", "orientale", 13.5d, CategoriePizza.VIANDE));
		alist.add(new Pizza(7, "IND", "indienne", 14, CategoriePizza.VIANDE));
		alist.add(new Pizza (8, "OCE", "oceanne", 20, CategoriePizza.POISSON));
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return alist;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		alist.add(pizza);
	}

	@Override
	public void updatePizza(String codePizzaModif, Pizza pizza) {
		deletePizza(codePizzaModif);
		saveNewPizza(pizza);
	}

	@Override
	public void deletePizza(String codePizza) {
		Iterator<Pizza> it = alist.iterator();
		while (it.hasNext()) {
			Pizza pizza = it.next();
			if (pizza.getCode().equals(codePizza)) {
				it.remove();
				break;
			}
		}
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for (Pizza pizza : alist) {
			if (pizza.getCode().equals(codePizza)) {
				return pizza;
			}
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		for (Pizza pizza : alist) {
			if (pizza.getCode().equals(codePizza)) {
				return true;
			}
		}
		return false;
	}
}
