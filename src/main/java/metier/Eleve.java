package metier;

import java.util.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("eleve")
public class Eleve extends Sorcier {

//Attributs

	@ManyToOne
	Maison maison;
	private Boolean quidditch;

	@ManyToMany(mappedBy = "eleves")
	private List<Matiere> matieres = new ArrayList();

//Constructeurs	
	public Eleve() {

	}
	
	public Eleve(Civilite civilite, String prenom, String nom) {
		super(civilite, prenom, nom);
	}

	public Eleve(Civilite civilite, String prenom, String nom, Boolean quidditch) {
		super(civilite, prenom, nom);
		this.quidditch = quidditch;
	}
	
	public Eleve(Civilite civilite, String prenom, String nom, Patronus patronus, Boolean quidditch) {
		super(civilite, prenom, nom, patronus);
		this.quidditch = quidditch;
	}

	public Eleve(Civilite civilite, String prenom, String nom, Patronus patronus, Baguette baguette,
			Boolean quidditch) {
		super(civilite, prenom, nom, patronus, baguette);
		this.quidditch = quidditch;
	}	

	public Eleve(Integer id, Civilite civilite, String prenom, String nom, Date anniversaire, Patronus patronus,
			Baguette baguette, Maison maison, Boolean quidditch, List<Matiere> matieres) {
		super(id, civilite, prenom, nom, anniversaire, patronus, baguette);
		this.maison = maison;
		this.quidditch = quidditch;
		this.matieres = matieres;
	}

// Getters & Setters 
	public Maison getMaison() {
		return maison;
	}

	public void setMaison(Maison maison) {
		this.maison = maison;
	}

	public Boolean getQuidditch() {
		return quidditch;
	}

	public void setQuidditch(Boolean quidditch) {
		this.quidditch = quidditch;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

// ToString	@

		public String toString() {
			return "Eleve (id de sorcier: " + getId() + ") : " + getCivilite().getLibelle() + " " + getPrenom().toLowerCase() + " "
					+ getNom().toUpperCase() + ". NE(E) LE : " + getNaissance() + ". PATRONUS : " + getPatronus().getForme()
					+ ". \n\tBAGUETTE : " + getBaguette().toString() + ".\nDE LA MAISON : " + maison.getNom() + ". JOUE AU QUIDDITCH : " + quidditch;
		}

// Hashcode & Equals
	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((maison == null) ? 0 : maison.hashCode());
		result = prime * result + ((matieres == null) ? 0 : matieres.hashCode());
		result = prime * result + ((quidditch == null) ? 0 : quidditch.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eleve other = (Eleve) obj;
		if (maison == null) {
			if (other.maison != null)
				return false;
		} else if (!maison.equals(other.maison))
			return false;
		if (matieres == null) {
			if (other.matieres != null)
				return false;
		} else if (!matieres.equals(other.matieres))
			return false;
		if (quidditch == null) {
			if (other.quidditch != null)
				return false;
		} else if (!quidditch.equals(other.quidditch))
			return false;
		return true;
	}
}
