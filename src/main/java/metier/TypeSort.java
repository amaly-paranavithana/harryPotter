package metier;

public enum TypeSort {
	ENCHANTEMENT("Enchantement"), MALEDICTION("Malediction"), MALEFICE("Malefice"), SORTILEGE("Sortilege");

//Attribut
	private String type;
	
//Constructeur
	private TypeSort(String t) {
		type = t;
	}
	
//Getter
	public String getType() {
		return type;
	}
}
