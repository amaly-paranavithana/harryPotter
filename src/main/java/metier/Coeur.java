package metier;

public enum Coeur {
cheveu("Cheveu de Vélane"), corail("Corail"), basilic("Corne de Basilic"), 
serpent("Corne de Serpent cornu"), kelpy("Crin d Kelpy"), licorne("Crin de Kelpy"), 
sombral("Crin de Sombral"), épine("Epine de monstre du Fleuve Blanc"), 
fléreur("Moustache de Fléreur"),oiseau("Plume d'oiseau-tonnerre"), 
phénix("Plume de phénix"), rougarou ("Poil de rougarou"), troll ("Moustache de troll"), 
womatou ("Poil de womatou"), dictame ("Tige de Dictame"), dragon("Ventricule de dragon"), 
snallygaster("Ventricule de Snallygaster");
	
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
