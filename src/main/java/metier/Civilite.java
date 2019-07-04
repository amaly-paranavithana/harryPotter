package metier;

public enum Civilite {
	M("Monsieur"), MME("Madame"), NC("NC");

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