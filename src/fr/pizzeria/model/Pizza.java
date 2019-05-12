package fr.pizzeria.model;

public class Pizza {
	private static int idPizz = 0;

	private int id;
	private String code;
	private String libelle;
	private double prix;
	private CategoriePizza categorie;

	public Pizza(String code, String libelle, double prix, CategoriePizza categorie) {
		this.id = idPizz++;
		this.categorie = categorie;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;

	}

	public Pizza(int id, String code, String libelle, double prix, CategoriePizza categorie) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "id=" + id + ", code=" + getCode() + ", libelle=" + libelle + ", prix=" + prix + ", categorie="
				+ categorie;
	}

	public String getCode() {
		return code;
	}
}