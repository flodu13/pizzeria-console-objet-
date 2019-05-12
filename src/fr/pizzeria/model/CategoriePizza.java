package fr.pizzeria.model;

public enum CategoriePizza {
	VIANDE("Viande"), //
	POISSON("Poisson"), //
	SANS_VIANDE("Sans Viande"),//
	;

	private String libelle;

	private CategoriePizza(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return libelle;
	}

	public boolean isVegetarien() {
		switch (this) {
		case VIANDE:
			return false;
		case POISSON:
		case SANS_VIANDE:
			return true;
		}
		return false;
	}
}
