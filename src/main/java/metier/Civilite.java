package metier;

public enum Civilite {
	m("Monsieur"), mme("Madame"), autre("Autre"), nc("NC");

// Attribut
	private String libelle;

//Constructeur
	private Civilite(String civilite) {
		libelle = civilite;
	}

// Getter
	public String getLibelle() {
		return libelle;
	}

}