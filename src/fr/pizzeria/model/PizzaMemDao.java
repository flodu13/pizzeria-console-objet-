package fr.pizzeria.model;

public class PizzaMemDao implements IPizzaDao{

	
	Pizza [] tableauPizz= new Pizza [8];
	
	
	public PizzaMemDao() {
		super();
		tableauPizz [0] =new Pizza("PEP","pépéroni", 12.50d);
		tableauPizz [1] =new Pizza ("MAR", "margherita", 14);
		tableauPizz [2] =new Pizza ("REIN", "la reine", 11.5d);
		tableauPizz [3] =new Pizza ("FRO", "la 4 fromages", 12);
		tableauPizz [4] = new Pizza ("Can", "cannibale", 12.5d);
		tableauPizz [5] = new Pizza ("SAV", "la savoyarde", 13);
		tableauPizz [6] = new Pizza ("ORI", "orientale", 13.5d);
		tableauPizz [7] = new Pizza ("IND", "indienne", 14);
		
	}


	
	


	public Pizza[] findAllPizzas() {
		//retourne le tableau de pizza
		return tableauPizz;
	}


	@Override
	public void saveNewPizza(Pizza pizza) {
		//créer un nouveau tableau de pizza
		Pizza [] tableauMenu2= new Pizza [tableauPizz.length+1];
		//mettre les ancienne pizza dans le tableau
		for(int i=0; i<tableauPizz.length; i++) {
			tableauMenu2[i]= tableauPizz[i];
		}
		//ajouter puis sauvegarder
		tableauMenu2 [tableauPizz.lenght] = pizza; 
		tableauPizz = tableauMenu2;
	}


	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for (int i=0; i<tableauPizz.length; i++) {
			if(tableauPizz[i].code.equals(codePizza)) {
				tableauPizz[i]=pizza;
				
			}
		}
	}


	@Override
	public void deletePizza(String codePizza) {
	}


	@Override
	public Pizza findPizzaByCode(String codePizza) {
		return null;
	}


	@Override
	public boolean pizzaExists(String codePizza) {
		return false;
	}
}
