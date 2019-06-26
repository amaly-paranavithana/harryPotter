package metier;

import java.util.*;

import javax.persistence.*;

@Entity
public class Maison {
	
//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String fantome;
	
	@OneToMany(mappedBy="maison")
	private List<Qualite> qualites = new ArrayList();
	
	@OneToOne
	private Professeur directeur;
	
	@OneToMany(mappedBy="maison")
	private List<Eleve> eleves = new ArrayList();
	
	
	
	
//Constructeur	
	public Maison() {
		
	}
	
	public Maison(Integer id, String nom, String fantome, List<Qualite> qualites, Professeur directeur,
			List<Eleve> eleves) {
		super();
		this.id = id;
		this.nom = nom;
		this.fantome = fantome;
		this.qualites = qualites;
		this.directeur = directeur;
		this.eleves = eleves;
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
	public String getFantome() {
		return fantome;
	}
	public void setFantome(String fantome) {
		this.fantome = fantome;
	}
	public List<Qualite> getQualites() {
		return qualites;
	}
	public void setQualites(List<Qualite> qualites) {
		this.qualites = qualites;
	}
	public Professeur getDirecteur() {
		return directeur;
	}
	public void setDirecteur(Professeur directeur) {
		this.directeur = directeur;
	}
	public List<Eleve> getEleves() {
		return eleves;
	}
	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}
	
//ToString
	public String toString() {
		return "Maison [id=" + id + ", nom=" + nom + ", fantome=" + fantome + ", qualites=" + qualites + ", directeur="
				+ directeur + ", eleves=" + eleves + "]";
	}

//Hashcode & Egals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directeur == null) ? 0 : directeur.hashCode());
		result = prime * result + ((eleves == null) ? 0 : eleves.hashCode());
		result = prime * result + ((fantome == null) ? 0 : fantome.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		if (qualites == null) {
			if (other.qualites != null)
				return false;
		} else if (!qualites.equals(other.qualites))
			return false;
		return true;
	}
}
