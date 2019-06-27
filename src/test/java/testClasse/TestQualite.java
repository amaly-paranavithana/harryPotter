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

		//Qualite g1 = new Qualite("Courage");
		//Qualite g2 = new Qualite("Hardiesse");
		Qualite p1 = new Qualite ("Equilibre");
		Qualite sd1 = new Qualite ("Sagesse");
		Qualite sp1 = new Qualite ("Malice");
		// Force d'esprit. P = Equilibre, Loyaute, Constance, Patience. S = Sagesse,
		// Discernement, Erudition, Curiosite. Sp = Malice, Adresse, Determination.

		daoQ.insert(p1);
		daoQ.insert(sd1);
		daoQ.insert(sp1);
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

	// A faire
	public static void deleteQualite() {
		daoQ.delete(daoQ.selectById(3));
	}

}
