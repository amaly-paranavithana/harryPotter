
package metier;

public enum Coeur {
Cheveu("Cheveu de Vélane"), Corail("Corail"), Basilic("Corne de Basilic"),
Serpent("Corne de Serpent Cornu"), Kelpy("Crin de Kelpy"), Licorne("Crin de Licorne"), 
Sombral("Crin de Sombral"), Epine("Epine de monstre du Fleuve Blanc"),
Flereur("Moustache de Fléreur"), Oiseau("Plume d'oiseau-tonnerre"),
Phenix("Plume de Phénix"), Rougarou("Poil de Rougarou"), Troll ("Moustache de troll"),
Womatou ("Poil de womatou"), Dictame ("Tige de Dictame"), Dragon("Ventricule de dragon"), 
Snallygaster("Ventricule de Snallygaster");
	
//Attributs
	private String materiau;
	
//Constructeur
	private Coeur(String coeur) {
		materiau = coeur;
	}
	
//Getter
	public String getCoeur() {
		return materiau;
	}
}
