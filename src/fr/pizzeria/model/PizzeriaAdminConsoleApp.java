package fr.pizzeria.model;

import java.util.List;
import java.util.Scanner;
import fr.pizzeria.model.*;

public class PizzeriaAdminConsoleApp {
	
	
	public static void main(String[] args) {
		
		PizzaMemDaotp4 a = new PizzaMemDaotp4();
		List<Pizza> alist = a.findAllPizzas();
		
		Scanner choix = new Scanner (System.in);
		int user =0;
		
		while ( user<99) {
			
		
		System.out.println("***** Pizzeria Administration ***** \r\n" + 
				"1. Lister les pizzas \r\n" + 
				"2. Ajouter une nouvelle pizza \r\n" + 
				"3. Mettre à jour une pizza \r\n" + 
				"4. Supprimer une pizza \r\n" + 
				"99. Sortir  ");
user = choix.nextInt();


MenuServiceFactory a = new MenuServiceFactory(user, choix);
	


