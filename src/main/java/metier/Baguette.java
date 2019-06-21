package metier;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="baguette")
public class Baguette {

//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="Bois")
	@Enumerated(EnumType.STRING)
	private Bois bois;
	@Column(name="Coeur")
	@Enumerated(EnumType.STRING)
	private Coeur coeur;
	@Column(name="Taille")
	private Double taille;

//Constructeur
	
	public Baguette() {
	}

	public Baguette(Bois bois, Coeur coeur, Double taille) {
		this.bois = bois;
		this.coeur = coeur;
		this.taille = taille;
	}

	public Baguette(Integer id, Bois bois, Coeur coeur, Double taille) {
		this.id = id;
		this.bois = bois;
		this.coeur = coeur;
		this.taille = taille;
	}

//Getters & Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Bois getBois() {
		return bois;
	}

	public void setBois(Bois bois) {
		this.bois = bois;
	}

	public Coeur getCoeur() {
		return coeur;
	}

	public void setCoeur(Coeur coeur) {
		this.coeur = coeur;
	}

	public Double getTaille() {
		return taille;
	}

	public void setTaille(Double taille) {
		this.taille = taille;
	}

//ToString
	
	public String toString() {
		return "Baguette n°" + id + " : BOIS : " + bois + ", COEUR : " + coeur + ", TAILLE : " + taille;
	}

//Hashcode & Egals
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bois == null) ? 0 : bois.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((coeur == null) ? 0 : coeur.hashCode());
		result = prime * result + ((taille == null) ? 0 : taille.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Baguette other = (Baguette) obj;
		if (bois == null) {
			if (other.bois != null)
				return false;
		} else if (!bois.equals(other.bois))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (coeur == null) {
			if (other.coeur != null)
				return false;
		} else if (!coeur.equals(other.coeur))
			return false;
		if (taille == null) {
			if (other.taille != null)
				return false;
		} else if (!taille.equals(other.taille))
			return false;
		return true;
	}
}