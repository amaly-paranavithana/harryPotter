
package testClasse;

import dao.DaoMatiere;
import metier.Matiere;

public class TestMatiere {

	public static void main(String[] args) {
		// insertMatiere();
		// selectMatiereById();
		// selectAllMatiere();
		// updateMatiere();
		// deleteMatiere();
	}

	static DaoMatiere daoMat = new DaoMatiere();

	// ok
	public static void insertMatiere() {

		Matiere astro = new Matiere("Astronomie");//Aurora Sinistra
		Matiere bota = new Matiere("Botanique");//Chourave
		Matiere def = new Matiere("Defense contre les forces du Mal");//Lupin
		Matiere histoire = new Matiere("Histoire de la magie");//Binns
		Matiere meta = new Matiere("Metamorphose");//McGonagall
		Matiere potion = new Matiere("Potions");//Rogue
		Matiere sortilege = new Matiere("Sortileges");//Flitwick
		Matiere vol = new Matiere("Vol sur balai");//Bibine
		Matiere arit = new Matiere("Arithmancie");//Vector
		Matiere div = new Matiere("Divination");//Trelawney
		Matiere moldu = new Matiere("Etude des Moldus");//burbage
		Matiere rune = new Matiere("Etude des runes");//Babbling
		Matiere soin = new Matiere("Soins aux créatures magiques");//Hagrid
		
		daoMat.insert(astro);
		daoMat.insert(bota);
		daoMat.insert(def);
		daoMat.insert(histoire);
		daoMat.insert(meta);
		daoMat.insert(potion);
		daoMat.insert(sortilege);
		daoMat.insert(vol);
		daoMat.insert(arit);
		daoMat.insert(div);
		daoMat.insert(moldu);
		daoMat.insert(rune);
		daoMat.insert(soin);
		
//		System.out.println(hG);
//		System.out.println(rH);

	}

	// ok
	public static void selectMatiereById() {

		System.out.println(daoMat.selectById(1));
	}

	// ok
	public static void selectAllMatiere() {
		for (Matiere b : daoMat.selectAll()) {
			System.out.println(b);
		}
	}

	// ok
	public static void updateMatiere() {
		Matiere rH = daoMat.selectById(2);
		rH.setCoeur(Coeur.SOMBRAL);
		daoMat.update(rH);
		System.out.println(daoMat.selectById(2));
	}

	//ok
	public static void deleteMatiere() {
		daoMat.delete(daoMat.selectById(3));
	}

}
