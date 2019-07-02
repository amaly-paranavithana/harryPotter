package testClasse;

import dao.DaoMaison;
import dao.DaoProfesseur;
import metier.Blason;
import metier.Maison;

public class TestMaison {

	public static void main(String[] args) {
		//insertMaison();
		 //selectMaisonById();
		//selectAllMaison();
		 updateMaison();
		// deleteMaison();
	}

	static DaoMaison daoM = new DaoMaison();
	static DaoProfesseur daoP = new DaoProfesseur();

	// ok
	public static void insertMaison() {

		Maison g = new Maison ("Gryffondor", Blason.GRYFFONDOR, daoP.selectById(1),  "Nick Quasi-Sans-Tete");
		Maison sd = new Maison ("Serdaigle", Blason.SERDAIGLE, daoP.selectById(3), "La Dame Grise");
		Maison p = new Maison ("Poufsouffle", Blason.POUFSOUFFLE, daoP.selectById(4), "Le Moine Gras");
		Maison sp = new Maison ("Serpentard", Blason.SERPENTARD, daoP.selectById(2), "Le Baron Sanglant");
		daoM.insert(g);
		daoM.insert(sd);
		daoM.insert(p);
		daoM.insert(sp);
	
	}

	// ok
	public static void selectMaisonById() {

		System.out.println(daoM.selectById(1));

	}

	// ok sans liste élèves et qualités
	public static void selectAllMaison() {
		for (Maison m : daoM.selectAll()) {
			System.out.println(m);
		}
	}

	// ok
	public static void updateMaison() {
		Maison g = daoM.selectById(1);
		g.setDirecteur(daoP.selectById(1));
		daoM.update(g);
		System.out.println(daoM.selectById(1));
	}

	//ok
	public static void deleteMaison() {
		daoM.delete(daoM.selectById(3));
	}

}
