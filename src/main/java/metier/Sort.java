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
	@Column(name = "typeSort")
	@Enumerated(EnumType.STRING)
	private TypeSort typeSort;
	
	@ManyToOne
	private Matiere matiere;

//Constructeur	
	public Sort() {
	}

	public Sort(String nom, TypeSort typeSort) {
		super();
		this.nom = nom;
		this.typeSort = typeSort;
	}

	public Sort(Integer id, String nom, TypeSort typeSort) {
		super();
		this.id = id;
		this.nom = nom;
		this.typeSort = typeSort;
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

	public TypeSort getTypeSort() {
		return typeSort;
	}

	public void setTypeSort(TypeSort typeSort) {
		this.typeSort = typeSort;
	}

//ToString
	public String toString() {
		return "Sort num. " + id + " : nom : " + nom + ", type de sort : " + typeSort;
	}

//HashCode & Equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((typeSort == null) ? 0 : typeSort.hashCode());
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
		if (typeSort == null) {
			if (other.typeSort != null)
				return false;
		} else if (!typeSort.equals(other.typeSort))
			return false;
		return true;
	}

}
