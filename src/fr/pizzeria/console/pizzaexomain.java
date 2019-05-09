package fr.pizzeria.console;

public class pizzaexomain {

	String code;
	String nom;
	int prix;
	
	public static void main(String[] args) {
		
		commandePizzaexoEntrainement commandePizzaexoEntrainement= new commandePizzaexoEntrainement ();
		pizzaentrainement NouvPizza= new pizzaentrainement ();

		
		for (int i=0; i<commandePizzaexoEntrainement.length; i++) {
			
			System.out.println(commandePizzaexoEntrainement[i].code +" "  +  pizzaentrainement[i].nom+ " " + pizzaentrainement[i].prix);
			}
	}

}
