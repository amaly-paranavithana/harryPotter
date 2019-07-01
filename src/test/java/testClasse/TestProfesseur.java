package testClasse;

import java.util.Set;

import javax.persistence.*;

import dao.*;
import metier.*;

public class TestProfesseur {

	public static void main(String[] args) {
		 insertProfesseur();
		// selectProfesseurById();
		// selectAllProfesseur();
		//updateProfesseur();
		// deleteProfesseur();
	}

	static DaoProfesseur daoP = new DaoProfesseur();

	// ok
	public static void insertProfesseur() {

		Professeur mM = new Professeur(Civilite.MME, "Minerva", "McGonagall", Patronus.CHAT);// 4/10/1935 Metamorphose
		Professeur sR = new Professeur(Civilite.M, "Severus", "Rogue", Patronus.BICHE);// 09/01/1960 Potion
		Professeur fF = new Professeur(Civilite.M, "Filius", "Flitwick");// Sortileges
		Professeur pC = new Professeur(Civilite.MME, "Pomora", "Chourave");// 15/05/1941 Botanique
		Professeur chaB = new Professeur(Civilite.MME, "Charity", "Burbage");// Etude des Moldus
		Professeur cB = new Professeur(Civilite.M, "Cuthbert", "Binns");// Histoire de la magie
		Professeur rB = new Professeur(Civilite.MME, "Renee", "Bibine");// Vol
		Professeur bB = new Professeur(Civilite.MME, "Bathsheda", "Babbling");// Etude des Runes
		Professeur rL = new Professeur(Civilite.M, "Remus", "Lupin", Patronus.LOUP);// 10/03/1960 . Défense contre les
																					// forces du Mal
		Professeur aD = new Professeur(Civilite.M, "Albus", "Dumbledore", Patronus.PHENIX);// 07/1881
		Professeur aS = new Professeur(Civilite.MME, "Aurora", "Sinistra");// Astronomie
		Professeur sT = new Professeur(Civilite.MME, "Sibylle", "Trelawney");// Divination
		Professeur rH = new Professeur(Civilite.M, "Rubeus", "Hagrid");// Soins aux creatures magiques
		Professeur sV = new Professeur(Civilite.MME, "Septima", "Vector");// Arithmancie

		daoP.insert(mM);
		daoP.insert(sR);
		daoP.insert(fF);
		daoP.insert(pC);
		daoP.insert(chaB);
		daoP.insert(cB);
		daoP.insert(rB);
		daoP.insert(bB);
		daoP.insert(rL);
		daoP.insert(aD);
		daoP.insert(aS);
		daoP.insert(sT);
		daoP.insert(rH);
		daoP.insert(sV);

		// System.out.println("Directeurs des maisons : " + daoP.selectById(1).getNom()
		// + " " + daoP.selectById(2).getNom()
		// + " " + daoP.selectById(3).getNom() + " " + daoP.selectById(4).getNom() + "
		// ");

	}

	// ok
	public static void selectProfesseurById() {

		System.out.println(
				"Directeur de Gryffondor : " + daoP.selectById(1).getNom() + " " + daoP.selectById(1).getPrenom());

	}

	// ok
	public static void selectAllProfesseur() {
		for (Professeur p : daoP.selectAll()) {
			System.out.println(p.getNom());
		}
	}

	// ok
	public static void updateProfesseur() {
		Professeur p1 = daoP.selectById(1);
		p1.setNom("McGonagall");
		daoP.update(p1);
		System.out.println(daoP.selectById(1).getNom());
	}

	//ok
	public static void deleteProfesseur() {
		daoP.delete(daoP.selectById(3));
	}

}
