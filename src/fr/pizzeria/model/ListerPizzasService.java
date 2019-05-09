package fr.pizzeria.model;

public class ListerPizzasService extends MenuService{

	@Override
	public void executeUC(PizzaMemDao FR) {
	Pizza[] a = FR.tableauPizz;
	
	for (int i=0; i<a.length; i++) {
System.out.println(a[i]);
	}
	}
}
