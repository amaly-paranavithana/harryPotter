package metier;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "sort")
public class Sort {

//Attributs

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "formule")
	@Enumerated(EnumType.STRING)
	private InfoSort formule;
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private InfoSort type;

	@ManyToOne
	private Matiere matiere;

//Constructeur	
	public Sort() {
	}

	public Sort(String nom, InfoSort formule, InfoSort type) {
		super();
		this.nom = nom;
		this.formule = formule;
		this.type = type;
	}

	public Sort(Integer id, String nom, InfoSort formule, InfoSort type, Matiere matiere) {
		super();
		this.id = id;
		this.nom = nom;
		this.formule = formule;
		this.type = type;
		this.matiere = matiere;
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

	public InfoSort getFormule() {
		return formule;
	}

	public void setFormule(InfoSort formule) {
		this.formule = formule;
	}

	public InfoSort getType() {
		return type;
	}

	public void setType(InfoSort type) {
		this.type = type;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

//ToString
	public String toString() {
		return "Sort num. " + id + " : nom : " + nom + ", formule : " + formule + ", type de sort : " + type;
	}

//HashCode & Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formule == null) ? 0 : formule.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matiere == null) ? 0 : matiere.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sort other = (Sort) obj;
		if (formule != other.formule)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matiere == null) {
			if (other.matiere != null)
				return false;
		} else if (!matiere.equals(other.matiere))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
}
	