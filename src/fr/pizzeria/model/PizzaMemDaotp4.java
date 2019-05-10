package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class PizzaMemDaotp4 implements IPizzaDao {
	ArrayList<Pizza> alist;


	public PizzaMemDaotp4() {
		alist = new ArrayList<Pizza>();
		alist.add(new Pizza(0,"PEP","pépéroni",12.50));
		alist.add(new Pizza(1,"MAR", "margherita", 14));
		alist.add(new Pizza (2,"REIN", "la reine", 11.5d));
		alist.add(new Pizza (3,"FRO", "la 4 fromages", 12));
		alist.add(new Pizza(4 ,"Can", "cannibale", 12.5d));
		alist.add(new Pizza (5,"SAV", "la savoyarde", 13));
		alist.add(new Pizza(6, "ORI", "orientale", 13.5d));
		alist.add(new Pizza (7, "IND", "indienne", 14));
	}
	
	@Override
	public List<Pizza> findAllPizzas() {
		
		return alist;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		
	
	}

	@Override
	public void updatePizza(String codePizzaModif,Pizza pizza) {
	
		//for (Pizza pizza: alist) {
			if (codePizzaModif.equals(pizza.code)) {
			
		}

	@Override
	public void deletePizza(String codePizza) {
		for (Pizza pizza: alist) {
			if (pizza.code.equals(codePizza) {
				
		alist.remove(pizza);
	} }
	}
	}
	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for (Pizza pizza: alist) {
			if (pizza.code.equals(codePizza) {
				findPizzaByCode(codePizza);
			}
		}
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		return false;
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		
	}



	}



