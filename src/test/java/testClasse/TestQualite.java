package testClasse;

import dao.DaoMaison;
import dao.DaoQualite;
import metier.Maison;
import metier.Qualite;

public class TestQualite {

	public static void main(String[] args) {
		 //insertQualite();
		// selectQualiteById();
		// selectAllQualite();
		 updateQualite();
		// deleteQualite();
	}

	static DaoQualite daoQ = new DaoQualite();
	static DaoMaison daoM = new DaoMaison();

	// ok
	public static void insertQualite() {

		Qualite g1 = new Qualite("Courage");
		Qualite g2 = new Qualite("Hardiesse");
		Qualite g3 = new Qualite("Force d'esprit");
		
		Qualite p1 = new Qualite ("Equilibre");
		Qualite p2 = new Qualite("Loyaute");
		Qualite p3 = new Qualite("Constance");
		Qualite p4 = new Qualite("Patience");
				
		Qualite sd1 = new Qualite ("Sagesse");
		Qualite sd2 = new Qualite("Discernement");
		Qualite sd3 = new Qualite("Erudition");
		Qualite sd4 = new Qualite("Curiosite");
		
		Qualite sp1 = new Qualite ("Malice");
		Qualite sp2 = new Qualite("Adresse");
		Qualite sp3 = new Qualite("Determination");

		daoQ.insert(g1); daoQ.insert(g2); daoQ.insert(g3); daoQ.insert(p1); daoQ.insert(p2);
		daoQ.insert(p3); daoQ.insert(p4); daoQ.insert(sd1); daoQ.insert(sd2); daoQ.insert(sd3);
		daoQ.insert(sd4); daoQ.insert(sp1); daoQ.insert(sp2); daoQ.insert(sp3); 
		
		//System.out.println(g1);
		//System.out.println(g2);

	}

	// ok
	public static void selectQualiteById() {

		System.out.println("Gryffondor : " + daoQ.selectById(1).getNom() + ", " + daoQ.selectById(2).getNom());

	}

	// ok
	public static void selectAllQualite() {
		for (Qualite q : daoQ.selectAll()) {
			System.out.println(q);
		}
	}

	//ok mais ne gère pas encore l'affichage des listes
	public static void updateQualite() {
		Qualite g1 = daoQ.selectById(1);
		Maison g = daoM.selectById(1);
		g1.setMaison(g);
		daoQ.update(g1);
		System.out.println(daoQ.selectById(1));
	}

	//ok
	public static void deleteQualite() {
		daoQ.delete(daoQ.selectById(3));
	}

}
