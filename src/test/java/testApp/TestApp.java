package testApp;

import javax.persistence.*;

import dao.DaoBaguette;
import metier.*;

public class TestApp {

	public static void main(String[] args) {
		insertBaguette();
		// selectBaguetteById();
		// selectAllBaguette();
		//deleteBaguette();
	}

	static DaoBaguette daoB = new DaoBaguette();

//N'affiche pas la valeur d l'enum
	public static void insertBaguette() {
		Baguette hG = new Baguette(Bois.valueOf("Vigne"), Coeur.valueOf("Dragon"), 27.3);
		Baguette rH = new Baguette(Bois.valueOf("Chene"), Coeur.valueOf("Dragon"), 40.0);

		daoB.insert(hG);
		daoB.insert(rH);
		System.out.println(hG);
		System.out.println(rH);
	}

//N'affiche pas la valeur de l'enum
	public static void selectBaguetteById() {

		System.out.println("BOIS : " + daoB.selectById(1).getBois() + ", COEUR : " + daoB.selectById(1).getCoeur()
				+ ", TAILLE : " + daoB.selectById(1).getTaille());
	}

	public static void selectAllBaguette() {
		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
	}

	public static void deleteBaguette() {
		daoB.delete(daoB.selectById(1));
	}
}
