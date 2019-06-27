package testClasse;

import dao.DaoBaguette;
import metier.Baguette;
import metier.Bois;
import metier.Coeur;

public class TestBaguette {

	public static void main(String[] args) {
		// insertBaguette();
		// selectBaguetteById();
		// selectAllBaguette();
		// updateBaguette();
		// deleteBaguette();
	}

	static DaoBaguette daoB = new DaoBaguette();

	// ok
	public static void insertBaguette() {

		Baguette hG = new Baguette(Bois.VIGNE, Coeur.DRAGON, 27.3);
		Baguette rH = new Baguette(Bois.CHENE, Coeur.DRAGON, 40.0);

		daoB.insert(hG);
		daoB.insert(rH);
		System.out.println(hG);
		System.out.println(rH);

	}

	// ok
	public static void selectBaguetteById() {

		System.out.println("BOIS : " + daoB.selectById(1).getBois().getType() + ", COEUR : "
				+ daoB.selectById(1).getCoeur().getMateriau() + ", TAILLE : " + daoB.selectById(1).getTaille());
		System.out.println("BOIS : " + daoB.selectById(2).getBois().getType() + ", COEUR : "
				+ daoB.selectById(2).getCoeur().getMateriau() + ", TAILLE : " + daoB.selectById(2).getTaille());
	}

	// ok
	public static void selectAllBaguette() {
		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
	}

	//ok
	public static void updateBaguette() {
		Baguette rH = daoB.selectById(2);
		rH.setCoeur(Coeur.SOMBRAL);
		daoB.update(rH);
		System.out.println(daoB.selectById(2));
	}

	// A faire
	public static void deleteBaguette() {
		daoB.delete(daoB.selectById(3));
	}

}
