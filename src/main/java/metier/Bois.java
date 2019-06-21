package metier;

public enum Bois {
acacia("Acacia"), acajou("Acajou"), amourette("Amourette"), aubépine("Aubépine"),
aubépinedesmarais("Aubépine des marais"), aulne("Aulne"), bouleau("Bouleau"), 
cèdre("Cèdre"), cerisier("Cerisier"), charme("Charme"), châtaignier("Châtaignier"), 
chêne("Chêne"), chêneblanc("Chêne blanc"), chênerouge("Chêne rouge"), 
cornouiller("Cornouiller"), cyprès("Cyprès"), ébène("Ebène"), épicéa("Epicéa"), 
érable("Erable"), érableàsucre("Erable à sucre"), frêne("Frêne"), 
frêneépineux("Frêne épineux"), hêtre("Hêtre"), houx("Houx"), boisdeif("If"), 
laurier("Laurier"), lierre("Lierre"), mélèze("Mélèze"), mélèzelaricin("Mélèze Laricin"), 
noisetier("Noisetier"), noyer("Noyer"), noyernoir("Noyr noir"), orme("Orme"), 
peuplier("Peuplier"), pin("Pin"), poirier("Poirier"), pommier("Pommier"), 
prunellier("Prunellier"), rose("Rose"), roseau("Roseau"), sapin("Sapin"), saule("Saule"),
séquoia("Séquoia"), sorbier("Sorbier"), sureau("Sureau"), sycomore("Sycomore"), 
tilleulargenté("Tilleul argenté"), tremble("Tremble"), vigne("Vigne");  

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
