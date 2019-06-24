package metier;

import javax.persistence.*;

@Entity
@DiscriminatorValue("eleve")
public class Eleve extends Sorcier {
	
//Attributs
	Maison maison;
	private Boolean quidditch;

//Constructeurs	
	public Eleve() {
		
	}
	

	
	
	
// Getters & Setters 
// ToString
// Hashcode & Equals
}
