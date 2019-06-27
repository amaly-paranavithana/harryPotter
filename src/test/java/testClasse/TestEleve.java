package testClasse;

import dao.DaoEleve;
import metier.Eleve;
import metier.Bois;
import metier.Coeur;

public class TestEleve {

	public static void main(String[] args) {
		// insertEleve();
		// selectEleveById();
		// selectAllEleve();
		// updateEleve();
		// deleteEleve();
	}

	static DaoEleve daoE = new DaoEleve();

	// ok
	public static void insertEleve() {

		Eleve hG = new Eleve(Bois.VIGNE, Coeur.DRAGON, 27.3);//hermione
		Eleve rH = new Eleve(Bois.CHENE, null, 40.0);//hagrid
		
		
//		Cedric Diggory : 01/10/1977. P, Q
//		Tom Jedusor : 31/12/1926 S
//		Neville Londubat : 30/07/1980 G
//		Drago MAlefoy : 05/06/1980 S Q
//		Harry Potter : 31/07/1980 G Q cerf
//		Giny weasley : 

		daoE.insert(hG);
		daoE.insert(rH);
		System.out.println(hG);
		System.out.println(rH);

	}

	// ok
	public static void selectEleveById() {

		System.out.println("BOIS : " + daoE.selectById(1).getBois().getType() + ", COEUR : "
				+ daoE.selectById(1).getCoeur().getMateriau() + ", TAILLE : " + daoE.selectById(1).getTaille());
		System.out.println("BOIS : " + daoE.selectById(2).getBois().getType() + ", COEUR : "
				+ daoE.selectById(2).getCoeur().getMateriau() + ", TAILLE : " + daoE.selectById(2).getTaille());
	}

	// ok
	public static void selectAllEleve() {
		for (Eleve e : daoE.selectAll()) {
			System.out.println(e);
		}
	}

	//ok
	public static void updateEleve() {
		Eleve rH = daoE.selectById(2);
		rH.setCoeur(Coeur.SOMBRAL);
		daoE.update(rH);
		System.out.println(daoE.selectById(2));
	}

	// A faire
	public static void deleteEleve() {
		daoE.delete(daoE.selectById(3));
	}

}
