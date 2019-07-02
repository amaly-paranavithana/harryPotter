package metier;

import java.util.*;

import javax.persistence.*;

@Entity
public class Maison {

//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;

	@Enumerated(EnumType.STRING)
	private Blason blason;

	@OneToOne
	private Sorcier fondateur;

	@OneToOne
	private Professeur directeur;

	private String fantome;
	private Integer points;

	@OneToMany(mappedBy = "maison")
	private List<Qualite> qualites = new ArrayList();

	@OneToMany(mappedBy = "maison")
	private List<Eleve> eleves = new ArrayList();

//Constructeur	
	public Maison() {

	}

	public Maison(String nom, Blason animal, Blason couleurs, String fantome) {
		super();
		this.nom = nom;
		this.blason = animal;
		this.blason = couleurs;
		this.fantome = fantome;
	}

	public Maison(String nom, Blason blason, Professeur directeur, String fantome) {
		super();
		this.nom = nom;
		this.blason = blason;
		this.directeur = directeur;
		this.fantome = fantome;
	}

	public Maison(Integer id, String nom, Blason animal, Blason couleurs, Sorcier fondateur, Professeur directeur, String fantome,
			Integer points, List<Qualite> qualites, List<Eleve> eleves) {
		super();
		this.id = id;
		this.nom = nom;
		this.blason = animal;
		this.blason = couleurs;
		this.fondateur = fondateur;
		this.directeur = directeur;
		this.fantome = fantome;
		this.points = points;
		this.qualites = qualites;
		this.eleves = eleves;
	}

// Getters & Setters

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

	public Blason getBlason() {
		return blason;
	}

	public void setBlason(Blason blason) {
		this.blason = blason;
	}

	public Sorcier getFondateur() {
		return fondateur;
	}

	public void setFondateur(Sorcier fondateur) {
		this.fondateur = fondateur;
	}

	public Professeur getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Professeur directeur) {
		this.directeur = directeur;
	}

	public String getFantome() {
		return fantome;
	}

	public void setFantome(String fantome) {
		this.fantome = fantome;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public List<Qualite> getQualites() {
		return qualites;
	}

	public void setQualites(List<Qualite> qualites) {
		this.qualites = qualites;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

//ToString
	
	public String toString() {
		return "Maison " + nom + " : \nblason : " + blason.getCouleurs() + " avec " + blason.getAnimal() + ", fondateur : " + fondateur + ", directeur : "
				+ directeur + ", fantome : " + fantome + ", points : " + points + ", qualites : " + qualites + ", eleves : "
				+ eleves + ".";
	}
	
//HashCode & Equals

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((blason == null) ? 0 : blason.hashCode());
		result = prime * result + ((directeur == null) ? 0 : directeur.hashCode());
		result = prime * result + ((eleves == null) ? 0 : eleves.hashCode());
		result = prime * result + ((fantome == null) ? 0 : fantome.hashCode());
		result = prime * result + ((fondateur == null) ? 0 : fondateur.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((points == null) ? 0 : points.hashCode());
		result = prime * result + ((qualites == null) ? 0 : qualites.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maison other = (Maison) obj;
		if (blason != other.blason)
			return false;
		if (directeur == null) {
			if (other.directeur != null)
				return false;
		} else if (!directeur.equals(other.directeur))
			return false;
		if (eleves == null) {
			if (other.eleves != null)
				return false;
		} else if (!eleves.equals(other.eleves))
			return false;
		if (fantome == null) {
			if (other.fantome != null)
				return false;
		} else if (!fantome.equals(other.fantome))
			return false;
		if (fondateur == null) {
			if (other.fondateur != null)
				return false;
		} else if (!fondateur.equals(other.fondateur))
			return false;
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
		if (points == null) {
			if (other.points != null)
				return false;
		} else if (!points.equals(other.points))
			return false;
		if (qualites == null) {
			if (other.qualites != null)
				return false;
		} else if (!qualites.equals(other.qualites))
			return false;
		return true;
	}
}
