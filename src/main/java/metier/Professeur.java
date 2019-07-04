package metier;

import java.util.Date;

import javax.persistence.*;

@Entity
@DiscriminatorValue("professeur")
public class Professeur extends Sorcier {

//Attributs	
	@OneToOne(mappedBy = "professeur")
	private Matiere matiere;

//Constructeurs

	public Professeur() {
		super();
	}

	public Professeur(Civilite civilite, String prenom, String nom) {
		super(civilite, prenom, nom);
	}

	public Professeur(Integer id, Civilite civilite, String prenom, String nom, Date anniversaire, Patronus patronus,
			Baguette baguette, Matiere matiere) {
		super(id, civilite, prenom, nom, anniversaire, patronus, baguette);
		this.matiere = matiere;
	}

	// Getters & Setters
	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

//ToString
	public String toString() {
		return "Professeur (id de sorcier: " + getId() + ") : " + getCivilite().getLibelle() + " " + getPrenom() + " "
				+ getNom() + ". Né(e) le : " + getNaissance() + ". Patronus : " + getPatronus().getForme()
				+ ". \n\tBaguette : " + getBaguette().toString() + ".\nEnseigne : " + matiere.getIntitule();
	}

//Hashcode & Equals

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((matiere == null) ? 0 : matiere.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professeur other = (Professeur) obj;
		if (matiere == null) {
			if (other.matiere != null)
				return false;
		} else if (!matiere.equals(other.matiere))
			return false;
		return true;
	}
}
