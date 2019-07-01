package metier;

public enum InfoSort {
	EAU("Aguamenti", "Enchantement"), AMNESIE("Oubliettes", "Enchantement"), ATTRACTION("Accio", "Enchantement"),
	BOUCLIER("Protego", "Enchantement"), CHATOUILLIS("Rictusempra", "Enchantement"), LIMACE("Limacius Eructo", "Enchantement"),
	DESARMEMENT("Expelliarmus", "Enchantement"), DEVERROUILLAGE("Alohomora", "ENchantement"), ENGORGEMENT("Amplificatum","Enchantement"),
	EXPULSION("Repulso", "Enchantement"), LEVITATION("Wingardium Leviosa", "Enchantement"), LOCOMOTION("Locomotor", "Enchantement"),
	MUTISME("Silencio","Enchantement"), PATRONUS("Spero Patronum", "Enchantement"), RECURAGE("Recurvite", "Enchantement"),
	
	DOLORIS("Endoloris", "Malediciton"), FURONCULOSE("Furunculus", "Malediction"), GEMINO("Gemino", "Malediction"), IMPERIUM("Impero", "Malediction"),
	LANGUEDEPLOMB("Mutismus","Malediciton"), MORT("Avada Kedavra", "Malediction"), REDUCTION("Reducto", "Malediction"), SAUCISSON("Petrificus Totalus", "Malediction"),
	PRINCE("Sectumsempra", "Malediction"),
	
	POTDECOLLE("Colloshoo", "Malefice"), BLOQUEJAMBES("Locomotor Mortis","Malefice"), EXPLOSIF("Confringo","Malefice"), ENTRAVE("Impedimenta", "Malefice");
		

//Attribut
	private String formule;
	private String type;
	
//Constructeur
	private InfoSort(String f, String t) {
		formule = f;
		type = t;
	}
	
//Getters
	
	public String getFormule() {
		return formule;
	}
	
	public String getType() {
		return type;
	}
}
