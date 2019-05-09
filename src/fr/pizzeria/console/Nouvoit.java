package fr.pizzeria.console;

public class Nouvoit {
	
	int kmParcouru;
	int KmParcouruTotaux2;
	
	public static void main(String[] args) {

		Voiture a = new Voiture();
		int kmParcouru = a.getKmParcouruTotaux();
		System.out.println(kmParcouru);
		a.getKmParcouruTotaux();

		a.getkmParcouruTotaux2(42);
		
		int kmParcouruTotaux2 = a.getKmParcouruTotaux();

		System.out.println(kmParcouruTotaux2);
	}
		
		/*
		Voiture a = new Voiture ();
		a.kmParcouru=1;
		
		// 
		
		int valeurfinale = 42;
		int kmParcouruTotaux = a.getKmParcouruTotaux ();
		System.out.println(kmParcouruTotaux);

		int kmParcouruTotaux2= a.getKmParcouruTotaux();
		
		int kmParcouruTotaux2 = a.getKmParcouruTotaux ();
		System.out.println(kmParcouruTotaux2);
		
		*/
}