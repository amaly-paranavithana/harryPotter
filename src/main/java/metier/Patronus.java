package metier;

public enum Patronus {
CYGNE("Cygne"), PHENIX("Phenix"), LOUTRE("Loutre"), LIEVRE("Lievre"), LOUP("Loup"), SANGLIER("Sanglier"),
CHAT("Chat"), CERF("Cerf"), BICHE("Biche"), PIE("Pie"), CHEVAL("Cheval"), CHIEN("Chien");
	
//Attribut
	private String forme;
	
//Construteur
	private Patronus(String f) {
		forme = f;
	}

//Getter
	public String getForme() {
		return forme;
	}
	
}
