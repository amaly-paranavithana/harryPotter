package metier;

public enum Civilite {
	M("Monsieur"), MME("Madame"), AUTRE("Autre"), NC("NC");

// Attribut
	private String libelle;

//Constructeur
	private Civilite(String l) {
		libelle = l;
	}

// Getter
	public String getLibelle() {
		return libelle;
	}

}