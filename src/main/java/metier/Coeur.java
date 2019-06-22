
package metier;

public enum Coeur {
CHEVEUDEVELANE("Cheveu de Velane"), CORAIL("Corail"), BASILIC("Corne de Basilic"),
SERPENT("Corne de Serpent Cornu"), KELPY("Crin de Kelpy"), LICORNE("Crin de Licorne"), 
SOMBRAL("Crin de Sombral"), EPINE("Epine de monstre du Fleuve Blanc"),
FLEREUR("Moustache de Flereur"), OISEAU("Plume d'oiseau-tonnerre"),
PHENIX("Plume de Phenix"), ROUGAROU("Poil de Rougarou"), TROLL ("Moustache de troll"),
WOMATOU ("Poil de womatou"), DICTAME ("Tige de Dictame"), DRAGON("Ventricule de dragon"), 
SNALLYGASTER("Ventricule de Snallygaster");
	
//Attributs
	private String materiau;
	
//Constructeur
	private Coeur(String m) {
		materiau = m;
	}
	
//Getter
	public String getMateriau() {
		return materiau;
	}
}
