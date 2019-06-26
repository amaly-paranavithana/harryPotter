package metier;

import java.util.Date;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_SORCIER",discriminatorType=DiscriminatorType.STRING)
@Table(name="sorciers")
public class Sorcier {

//Attributs 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="civilite")
	@Enumerated(EnumType.STRING)
	private Civilite civilite;
	@Column(name="Prenom")
	private String prenom;
	@Column(name="Nom")
	private String nom;
	@Column(name="naissance")
	@Temporal(TemporalType.DATE)
	private Date naissance;
	@Enumerated(EnumType.STRING)
	@Column(name="Patronus")
	private Patronus patronus;
	
	@OneToOne
	@JoinColumn(name="baguette_id")
	private Baguette baguette;

//Constructeur		
	public Sorcier() {
	}

	public Sorcier(Civilite civilite, String prenom, String nom, Date anniversaire, Patronus patronus) {
		this.civilite = civilite;
		this.prenom = prenom;
		this.nom = nom;
		this.naissance = naissance;
		this.patronus = patronus;
	}

	public Sorcier(Integer id, Civilite civilite, String prenom, String nom, Date anniversaire, Patronus patronus,
			Baguette baguette) {
		this.id = id;
		this.civilite = civilite;
		this.prenom = prenom;
		this.nom = nom;
		this.naissance = naissance;
		this.patronus = patronus;
		this.baguette = baguette;
	}

//Getters & Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getNaissance() {
		return naissance;
	}

	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}

	public Patronus getPatronus() {
		return patronus;
	}

	public void setPatronus(Patronus patronus) {
		this.patronus = patronus;
	}

	public Baguette getBaguette() {
		return baguette;
	}

	public void setBaguette(Baguette baguette) {
		this.baguette = baguette;
	}
	
//ToString
	public String toString() {
		return "Sorcier (id : " + id + ") : " + civilite.getLibelle() + " " + prenom + " " + nom
				+ ". Né(e) le : " + naissance + ". Patronus : " + patronus.getForme() + ". Baguette : " + baguette + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naissance == null) ? 0 : naissance.hashCode());
		result = prime * result + ((baguette == null) ? 0 : baguette.hashCode());
		result = prime * result + ((civilite == null) ? 0 : civilite.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((patronus == null) ? 0 : patronus.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

//Hashcode & Egals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sorcier other = (Sorcier) obj;
		if (naissance == null) {
			if (other.naissance != null)
				return false;
		} else if (!naissance.equals(other.naissance))
			return false;
		if (baguette == null) {
			if (other.baguette != null)
				return false;
		} else if (!baguette.equals(other.baguette))
			return false;
		if (civilite != other.civilite)
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
		if (patronus != other.patronus)
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}	
}
