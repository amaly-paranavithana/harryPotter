package testApp;

import javax.persistence.*;

import dao.DaoBaguette;
import metier.*;

public class TestApp {

	public static void main(String[] args) {
		//insertBaguette();
		 //selectBaguetteById();
		 //selectAllBaguette();
		deleteBaguette();
	}

	static DaoBaguette daoB = new DaoBaguette();

//OK
	public static void insertBaguette() {
		
		Baguette hG = new Baguette(Bois.VIGNE, Coeur.DRAGON, 27.3);
		Baguette rH = new Baguette(Bois.CHENE, Coeur.DRAGON, 40.0);

		daoB.insert(hG);
		daoB.insert(rH);
		System.out.println(hG);
		System.out.println(rH);
		
	}

//OK
	public static void selectBaguetteById() {

		System.out.println("BOIS : " + daoB.selectById(1).getBois().getType () + ", COEUR : " + daoB.selectById(1).getCoeur().getMateriau()
				+ ", TAILLE : " + daoB.selectById(1).getTaille());
		System.out.println("BOIS : " + daoB.selectById(2).getBois().getType () + ", COEUR : " + daoB.selectById(2).getCoeur().getMateriau()
				+ ", TAILLE : " + daoB.selectById(2).getTaille());
	}
//OK
	public static void selectAllBaguette() {
		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
	}

//OK
	public static void deleteBaguette() {
		daoB.delete(daoB.selectById(3));
	}
}
