package fr.pizzeria.model;

import java.util.Scanner;

import fr.pizzeria.exception.PizzaException;

public abstract class MenuService {
	
	public abstract void executeUC(PizzaMemDaotp4 PMD, Scanner choix) throws PizzaException;
	

}
