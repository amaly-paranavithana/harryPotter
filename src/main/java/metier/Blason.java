package metier;

public enum Blason {
GRYFFONDOR("Lion", "rouge et or"), SERDAIGLE("Aigle", "bleu et bronze"), POUFSOUFFLE("BLaireau", "jaune et noir"), SERPENTARD("Serpent", "vert et argent");

//Attributs
	private String animal;
	private String couleurs;
	
//Constructeur
	private Blason(String a, String c) {
		animal = a;
		couleurs = c;
	}
	
//Getters
	
	public String getAnimal() {
		return animal;
	}
	
	public String getCouleurs() {
		return couleurs;
	}
}
