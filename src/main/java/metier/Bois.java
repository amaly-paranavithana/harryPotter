package metier;

public enum Bois {
Acacia("Acacia"), Acajou("Acajou"), Amourette("Amourette"), Aubepine("Aubépine"),
Aubepinedesmarais("Aubépine des marais"), Aulne("Aulne"),Bouleau("Bouleau"),
Cedre("Cèdre"), Cerisier("Cerisier"), Charme("Charme"), Chataignier("Châtaignier"),
Chene("Chêne"), Cheneblanc("Chêne blanc"), Chenerouge("Chêne rouge"),
Cornouiller("Cornouiller"), Cypres("Cyprès"), Ebene("Ebène"), Epicea("Epicéa"),
Erable("Erable"), Erableasucre("Erable à sucre"), Frene("Frêne"),
Freneepineux("Frêne épineux"), Hetre("Hêtre"), Houx("Houx"), Boisdeif("If"),
Laurier("Laurier"), Lierre("Lierre"), Meleze("Mélèze"), Melezelaricin("Mélèze Laricin"),
Noisetier("Noisetier"), Noyer("Noyer"), Noyernoir("Noyer noir"), Orme("Orme"),
Peuplier("Peuplier"), Pin("Pin"), Poirier("Poirier"), Pommier("Pommier"),
Prunellier("Prunellier"), Rose("Rose"), Roseau("Roseau"), Sapin("Sapin"), Saule("Saule"),
Sequoia("Séquoia"), Sorbier("Sorbier"), Sureau("Sureau"), Sycomore("Sycomore"),
Tilleulargente("Tilleul argenté"), Tremble("Tremble"), Vigne("Vigne");  

//Attribut
	private String type;
	
//Constructeur
	private Bois(String bois) {
		type = bois;
	}
	
//Getter
	public String getBois() {
		return type;
	}
}
