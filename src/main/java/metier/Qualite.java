package metier;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "qualite")
public class Qualite {

//Attributs

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;

	@ManyToOne
	private Maison maison;

// Constructeur
	public Qualite() {
	}

	public Qualite(String nom) {
		super();
		this.nom = nom;
	}

	public Qualite(String nom, Maison maison) {
		super();
		this.nom = nom;
		this.maison = maison;
	}

	public Qualite(Integer id, String nom, Maison maison) {
		super();
		this.id = id;
		this.nom = nom;
		this.maison = maison;
	}

//Getters & Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Maison getMaison() {
		return maison;
	}

	public void setMaison(Maison maison) {
		this.maison = maison;
	}

	// ToString
	public String toString() {
		return maison.getNom() + " : " + nom;
	}

//Hashcode & Equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Qualite other = (Qualite) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

}
