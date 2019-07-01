package testClasse;

import dao.DaoMaison;
import dao.DaoProfesseur;
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

		Maison g = new Maison ("Gryffondor", "Nick Quasi-Sans-Tete", daoP.selectById(1));
		Maison sd = new Maison ("Serdaigle", "La Dame Grise", daoP.selectById(3));
		Maison p = new Maison ("Poufsouffle", "Le Moine Gras", daoP.selectById(4));
		Maison sp = new Maison ("Serpentard", "Le Baron Sanglant", daoP.selectById(2));
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
