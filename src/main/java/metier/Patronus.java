package metier;

public enum Patronus {
cygne("Cygne"), ph�nix("Ph�nix"), loutre("Loutre"), li�vre("Li�vre"), loup("Loup"), sanglier("Sanglier"),
chat("Chat"), cerf("Cerf"), biche("Biche"), pie("Pie"), cheval("Cheval"), chien("Chien");
	
//Attribut
	private String genre;
	
//Construteur
	private Patronus(String patronus) {
		genre = patronus;
	}

//Getter
	public String getPatronus() {
		return genre;
	}
	
}
