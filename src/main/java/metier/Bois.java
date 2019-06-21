package metier;

public enum Bois {
acacia("Acacia"), acajou("Acajou"), amourette("Amourette"), aub�pine("Aub�pine"),
aub�pinedesmarais("Aub�pine des marais"), aulne("Aulne"), bouleau("Bouleau"), 
c�dre("C�dre"), cerisier("Cerisier"), charme("Charme"), ch�taignier("Ch�taignier"), 
ch�ne("Ch�ne"), ch�neblanc("Ch�ne blanc"), ch�nerouge("Ch�ne rouge"), 
cornouiller("Cornouiller"), cypr�s("Cypr�s"), �b�ne("Eb�ne"), �pic�a("Epic�a"), 
�rable("Erable"), �rable�sucre("Erable � sucre"), fr�ne("Fr�ne"), 
fr�ne�pineux("Fr�ne �pineux"), h�tre("H�tre"), houx("Houx"), boisdeif("If"), 
laurier("Laurier"), lierre("Lierre"), m�l�ze("M�l�ze"), m�l�zelaricin("M�l�ze Laricin"), 
noisetier("Noisetier"), noyer("Noyer"), noyernoir("Noyr noir"), orme("Orme"), 
peuplier("Peuplier"), pin("Pin"), poirier("Poirier"), pommier("Pommier"), 
prunellier("Prunellier"), rose("Rose"), roseau("Roseau"), sapin("Sapin"), saule("Saule"),
s�quoia("S�quoia"), sorbier("Sorbier"), sureau("Sureau"), sycomore("Sycomore"), 
tilleulargent�("Tilleul argent�"), tremble("Tremble"), vigne("Vigne");  

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
