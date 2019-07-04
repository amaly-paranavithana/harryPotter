package metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Matiere {

//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String intitule;
	
	@OneToOne 
    @JoinColumn(name="id_professeur") 
	private Professeur professeur;

	@OneToMany
	private List<Sort> sorts = new ArrayList();

	@ManyToMany
	private List<Eleve> eleves;

//Constructeurs
	public Matiere() {
		super();
	}

	public Matiere(String intitule) {
		super();
		this.intitule = intitule;
	}

	public Matiere(Integer id, String intitule, List<Sort> sorts) {
		this.id = id;
		this.intitule = intitule;
		this.sorts = sorts;
	}

//Getters & Setters 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public List<Sort> getSorts() {
		return sorts;
	}

	public void setSorts(List<Sort> sorts) {
		this.sorts = sorts;
	}

//ToString
	public String toString() {
		return "Matiere (id : " + id + ") : NOM : " + intitule + ", SORTS : " + sorts + ".";
	}

//Hashcode & Equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((intitule == null) ? 0 : intitule.hashCode());
		result = prime * result + ((sorts == null) ? 0 : sorts.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matiere other = (Matiere) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intitule == null) {
			if (other.intitule != null)
				return false;
		} else if (!intitule.equals(other.intitule))
			return false;
		if (sorts == null) {
			if (other.sorts != null)
				return false;
		} else if (!sorts.equals(other.sorts))
			return false;
		return true;
	}
}
