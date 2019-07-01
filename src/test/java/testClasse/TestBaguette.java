package testClasse;

import dao.DaoBaguette;
import metier.Baguette;
import metier.Bois;
import metier.Coeur;

public class TestBaguette {

	public static void main(String[] args) {
		insertBaguette();
		// selectBaguetteById();
		// selectAllBaguette();
		// updateBaguette();
		 //deleteBaguette();
	}

	static DaoBaguette daoB = new DaoBaguette();

	// ok
	public static void insertBaguette() {

		Baguette hG = new Baguette(Bois.VIGNE, Coeur.DRAGON, 27.3);//hermione
		Baguette rH = new Baguette(Bois.CHENE, null, 40.0);//hagrid
		Baguette mM = new Baguette(Bois.SAPIN, Coeur.DRAGON, 23.75);//mcgonagall
		Baguette rL = new Baguette(Bois.CYPRES, Coeur.LICORNE, 26.0);//Lupin
		Baguette sT = new Baguette(Bois.NOISETIER, Coeur.LICORNE, 23.75);//Trelawney
		Baguette aD = new Baguette(Bois.SUREAU, Coeur.SOMBRAL, 38.0);//Dumbledore
		
		Baguette cD = new Baguette(Bois.FRENE, Coeur.LICORNE, 30.5);//cedric
		Baguette tJ = new Baguette(Bois.IF, Coeur.PHENIX, 33.75);//Tom jedusor
		Baguette nL = new Baguette(Bois.CERISIER, Coeur.LICORNE, 33.02);//Neville
		Baguette dM = new Baguette(Bois.AUBEPINE, Coeur.LICORNE, 25.0);//Drago
		Baguette pP = new Baguette(Bois.CHATAIGNIER, Coeur.DRAGON, 23.0);//pettigrow
		Baguette lP = new Baguette(Bois.SAULE, null, 25.6);//Lily
		Baguette jP = new Baguette(Bois.ACAJOU, null, 27.5);//james
		Baguette gW = new Baguette(Bois.IF, null, null);//giny
		Baguette hP = new Baguette(Bois.HOUX, Coeur.PHENIX, 27.5);// harry
		Baguette cW = new Baguette(Bois.FRENE, Coeur.LICORNE, null);//chrlie weasley
		Baguette rW = new Baguette(Bois.SAULE, Coeur.LICORNE, 35.56);//james
		

		daoB.insert(hG);daoB.insert(rH); daoB.insert(mM);daoB.insert(rL); daoB.insert(sT);daoB.insert(aD);
		daoB.insert(cD);daoB.insert(tJ); daoB.insert(nL);daoB.insert(dM); daoB.insert(pP);daoB.insert(lP);
		daoB.insert(jP);daoB.insert(gW); daoB.insert(hP);daoB.insert(cW); daoB.insert(rW);
		
		//System.out.println(hG);

	}

	// ok
	public static void selectBaguetteById() {
	
		System.out.println(daoB.selectById(1));
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

	//ok
	public static void deleteBaguette() {
		daoB.delete(daoB.selectById(1));
	}

}
