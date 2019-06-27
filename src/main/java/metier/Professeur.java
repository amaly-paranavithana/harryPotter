package metier;

import java.util.Date;

import javax.persistence.*;

@Entity
@DiscriminatorValue("professeur")
public class Professeur extends Sorcier {
	
//Attributs	
	@OneToOne(mappedBy="professeur")
	private Matiere matiere;

//Constructeurs
	
	public Professeur() {
		super();
	}
	
	public Professeur(Civilite civilite, String prenom, String nom) {
	super(civilite, prenom, nom);
}

	public Professeur(Civilite civilite, String prenom, String nom, Patronus patronus) {
		super(civilite, prenom, nom, patronus);
	}

	public Professeur(Civilite civilite, String prenom, String nom, Date anniversaire, Patronus patronus) {
	super(civilite, prenom, nom, anniversaire, patronus);
}

	public Professeur(Integer id, Civilite civilite, String prenom, String nom, Date anniversaire, Patronus patronus,
			Baguette baguette, Matiere matiere) {
		super(id, civilite, prenom, nom, anniversaire, patronus, baguette);
		this.matiere = matiere;
	}

	//Getters & Setters
	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
//ToString
	public String toString() {
		return "Professeur [matiere=" + matiere + "]";
	}
	
//Hashcode & Equals
	
	

	
	

}
