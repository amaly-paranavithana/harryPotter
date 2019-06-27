package testApp;

import java.util.Set;

import javax.persistence.*;

import dao.*;
import metier.*;

public class TestApp {

	public static void main(String[] args) {
		//insertBaguette();
		 //selectBaguetteById();
		 //selectAllBaguette();
		//deleteBaguette();
		
		//insertSort();
		//selectSortById();
		//selectAllSort();
		//deleteSort();
		
		//insertQualite();
		 //selectQualiteById();
		 //selectAllQualite();
		//deleteQualite();
	}

	static DaoBaguette daoB = new DaoBaguette();
	static DaoSort daoS = new DaoSort();
	static DaoQualite daoQ = new DaoQualite();
	
//BAGUETTE
	//ok
	public static void insertBaguette() {
		
		Baguette hG = new Baguette(Bois.VIGNE, Coeur.DRAGON, 27.3);
		Baguette rH = new Baguette(Bois.CHENE, Coeur.DRAGON, 40.0);

		daoB.insert(hG);
		daoB.insert(rH);
		System.out.println(hG);
		System.out.println(rH);
		
	}

	//ok
	public static void selectBaguetteById() {

		System.out.println("BOIS : " + daoB.selectById(1).getBois().getType () + ", COEUR : " + daoB.selectById(1).getCoeur().getMateriau()
				+ ", TAILLE : " + daoB.selectById(1).getTaille());
		System.out.println("BOIS : " + daoB.selectById(2).getBois().getType () + ", COEUR : " + daoB.selectById(2).getCoeur().getMateriau()
				+ ", TAILLE : " + daoB.selectById(2).getTaille());
	}
	
	//ok
	public static void selectAllBaguette() {
		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
	}

//A faire
	public static void deleteBaguette() {
		daoB.delete(daoB.selectById(3));
	}
	
//SORT
	//ok
	public static void insertSort() {
		
		Sort accio = new Sort("accio", TypeSort.ENCHANTEMENT);
		Sort avada = new Sort("avada kedavra", TypeSort.MALEDICTION);

		daoS.insert(accio);
		daoS.insert(avada);
		System.out.println(accio);
		System.out.println(avada);
		
	}

	//ok
	public static void selectSortById() {

		System.out.println("NOM : " + daoS.selectById(1).getNom() + ", TYPE : " + daoS.selectById(1).getTypeSort().getType());
		System.out.println("NOM : " + daoS.selectById(2).getNom() + ", TYPE : " + daoS.selectById(2).getTypeSort().getType());
	
	}
	
	//ok
	public static void selectAllSort() {
		for (Sort b : daoS.selectAll()) {
			System.out.println(b);
		}
	}

//A faire
	public static void deleteSort() {
		daoB.delete(daoB.selectById(3));
	}
	

}
