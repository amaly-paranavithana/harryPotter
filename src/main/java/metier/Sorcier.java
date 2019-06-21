package metier;

public class Sorcier {

//Attributs 
	private Integer id;
	private String prenom;
	private String nom;
	private Civilite civilite;
	private Patronus patronus;
	private Baguette baguette;
	
	public Sorcier() {
	}

	public Sorcier(String prenom, String nom, Civilite civilite, Patronus patronus, Baguette baguette) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.civilite = civilite;
		this.patronus = patronus;
		this.baguette = baguette;
	}

	public Sorcier(Integer id, String prenom, String nom, Civilite civilite, Patronus patronus, Baguette baguette) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.civilite = civilite;
		this.patronus = patronus;
		this.baguette = baguette;
	}
	
	//Getters & Setters
	//ToString
	
	//Hashcode & Egals
}
