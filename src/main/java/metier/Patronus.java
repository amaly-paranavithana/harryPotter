package metier;

public enum Patronus {
Cygne("Cygne"), Phenix("Phénix"), Loutre("Loutre"), Lievre("Lièvre"), Loup("Loup"), Sanglier("Sanglier"),
Chat("Chat"), Cerf("Cerf"), Biche("Biche"), Pie("Pie"), Cheval("Cheval"), Chien("Chien");
	
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
