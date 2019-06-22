package metier;

public enum Bois {
ACACIA("Acacia"), ACAJOU("Acajou"), AMOURETTE("Amourette"), AUBEPINE("Aubépine"),
AUBEPINEDESMARAIS("Aubepine des marais"), AULNE("Aulne"),BOULEAU("Bouleau"),
CEDRE("Cedre"), CERISIER("Cerisier"), CHARME("Charme"), CHATAIGNIER("Chataignier"),
CHENE("Chene"), CHENEBLANC("Chene blanc"), CHENEROUGE("Chene rouge"),
CORNOUILLER("Cornouiller"), CYPRES("Cypres"), EBENE("Ebene"), EPICEA("Epicea"),
ERABLE("Erable"), ERABLEASUCRE("Erable a sucre"), FRENE("Frene"),
FRENEEPINEUX("Frene epineux"), HETRE("Hetre"), HOUX("Houx"), IF("If"),
LAURIER("Laurier"), LIERRE("Lierre"), MELEZE("Meleze"), MELEZELARICIN("Meleze Laricin"),
NOISETIER("Noisetier"), NOYER("Noyer"), NOYERNOIR("Noyer noir"), ORME("Orme"),
PEUPLIER("Peuplier"), PIN("Pin"), POIRIER("Poirier"), POMMIER("Pommier"),
PRUNELLIER("Prunellier"), ROSE("Rose"), ROSEAU("Roseau"), SAPIN("Sapin"), SAULE("Saule"),
SEQUOIA("Sequoia"), SORBIER("Sorbier"), SUREAU("Sureau"), SYCOMORE("Sycomore"),
TILLEULARGENTE("Tilleul argente"), TREMBLE("Tremble"), VIGNE("Vigne");  

//Attribut
	private String type;
	
//Constructeur
	private Bois(String t) {
		type = t;
	}
	
//Getter
	public String getType() {
		return type;
	}
}
