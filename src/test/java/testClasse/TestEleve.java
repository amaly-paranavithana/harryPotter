package testClasse;

import dao.DaoEleve;
import dao.DaoMaison;
import metier.Civilite;
import metier.Coeur;
import metier.Eleve;
import metier.Patronus;

public class TestEleve {

	public static void main(String[] args) {
		// insertEleve();
		// selectEleveById();
		// selectAllEleve();
		// updateEleve();
		// deleteEleve();
	}

	static DaoEleve daoE = new DaoEleve();
	static DaoMaison daoM = new DaoMaison();

	// ok
	public static void insertEleve() {

		
		Eleve pW = new Eleve (Civilite.M, "Percy", "Weasley",daoM.selectById(1), false);
		Eleve fW = new Eleve (Civilite.M, "Fred", "Weasley",daoM.selectById(1), true);
		Eleve gW = new Eleve (Civilite.M, "Georges", "Weasley",daoM.selectById(1), true);
		Eleve rW = new Eleve (Civilite.M, "Ron", "Weasley",daoM.selectById(1), true);
		Eleve hG = new Eleve (Civilite.MME, "Hermion", "Granger",daoM.selectById(1), false);
		Eleve nL = new Eleve (Civilite.M, "Neville", "Londubat",daoM.selectById(1), false); //30/07/1980
		Eleve hP = new Eleve (Civilite.M, "Harry", "Potter",daoM.selectById(1), true); //31/07/1980 cerf
		Eleve giW = new Eleve (Civilite.MME, "Ginevra", "Weasley",daoM.selectById(1), true);
		
		Eleve cC = new Eleve (Civilite.MME, "Cho", "Chang",daoM.selectById(2));
		Eleve pP = new Eleve (Civilite.MME, "Padma", "Patil",daoM.selectById(2));
		Eleve lL = new Eleve (Civilite.MME, "Luna", "Lovegood",daoM.selectById(2));
		
		Eleve hA = new Eleve (Civilite.MME, "Hannah", "abbott",daoM.selectById(3));
		Eleve sB = new Eleve (Civilite.MME, "Susan", "Bones",daoM.selectById(3));
		Eleve cD = new Eleve (Civilite.M, "Cedric", "Diggory",daoM.selectById(3), true); //01/10/1977
		
		Eleve vC = new Eleve (Civilite.M, "Vincent", "Crabbe",daoM.selectById(4),true);
		Eleve gG = new Eleve (Civilite.M, "Gregory", "Goyle",daoM.selectById(4),true);
		Eleve dM = new Eleve (Civilite.M, "Drago", "Malefoy",daoM.selectById(4),true); //05/06/1980
		Eleve tJ = new Eleve (Civilite.M, "Tom", "Jedusor",daoM.selectById(4));
		
		
		daoE.insert(pW);
		daoE.insert(fW);
		daoE.insert(gW);
		daoE.insert(rW);
		daoE.insert(hG);
		daoE.insert(nL);
		daoE.insert(hP);
		daoE.insert(giW);
		
		daoE.insert(cC);
		daoE.insert(pP);
		daoE.insert(lL);
		
		daoE.insert(hA);
		daoE.insert(sB);
		daoE.insert(cD);
		
		daoE.insert(vC);
		daoE.insert(gG);
		daoE.insert(dM);
		daoE.insert(tJ);

	}

	// ok
	public static void selectEleveById() {

		System.out.println(daoE.selectById(1));
	}

	// ok
	public static void selectAllEleve() {
		for (Eleve e : daoE.selectAll()) {
			System.out.println(e);
		}
	}

	//ok
	public static void updateEleve() {
		Eleve hP = daoE.selectById(7);
		hP.setPatronus(Patronus.CERF);
		daoE.update(hP);
		System.out.println(daoE.selectById(2));
	}

	//ok
	public static void deleteEleve() {
		daoE.delete(daoE.selectById(3));
	}

}
