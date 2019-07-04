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
	@Column(name = "InfosSort")
	@Enumerated(EnumType.STRING)
	private InfoSort infoSort;

//Constructeur	
	public Sort() {
	}

	public Sort(String nom, InfoSort infoSort) {
		super();
		this.nom = nom;
		this.infoSort = infoSort;
	}

	public Sort(Integer id, String nom, InfoSort infoSort) {
		super();
		this.id = id;
		this.nom = nom;
		this.infoSort = infoSort;
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

	public InfoSort getInfoSort() {
		return infoSort;
	}

	public void setInfoSort(InfoSort infoSort) {
		this.infoSort = infoSort;
	}

//ToString
	public String toString() {
		return "Sort num. " + id + " : NOM : " + nom + ", FORMULE : " + infoSort.getFormule() + ", TYPE DE SORT : " + infoSort.getType();
	}

//HashCode & Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((infoSort == null) ? 0 : infoSort.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((infoSort == null) ? 0 : infoSort.hashCode());
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
		if (infoSort != other.infoSort)
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
		if (infoSort != other.infoSort)
			return false;
		return true;
	}
}
