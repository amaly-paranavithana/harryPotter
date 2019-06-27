package testClasse;

import java.util.Set;

import javax.persistence.*;

import dao.*;
import metier.*;

public class TestProfesseur {

	public static void main(String[] args) {
		// insertProfesseur();
		// selectProfesseurById();
		// selectAllProfesseur();
		updateProfesseur();
		// deleteProfesseur();
	}

	static DaoProfesseur daoP = new DaoProfesseur();

	// ok
	public static void insertProfesseur() {

		Professeur mM = new Professeur(Civilite.MME, "Minerva", "McGonagall", Patronus.CHAT);
		Professeur sR = new Professeur(Civilite.M, "Severus", "Rogue", Patronus.BICHE);
		Professeur fF = new Professeur(Civilite.M, "Filius", "Flitwick");
		Professeur pC = new Professeur(Civilite.MME, "Pomora", "Chourave");

		daoP.insert(mM);
		daoP.insert(sR);
		daoP.insert(fF);
		daoP.insert(pC);
		System.out.println("Directeurs des maisons : " + daoP.selectById(1).getNom() + " " + daoP.selectById(2).getNom()
				+ " " + daoP.selectById(3).getNom() + " " + daoP.selectById(4).getNom() + " ");

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

	//ok
	public static void updateProfesseur() {
		Professeur p1 = daoP.selectById(1);
		p1.setNom("McGonagall");
		daoP.update(p1);
		System.out.println(daoP.selectById(1).getNom());
	}

	// A faire
	public static void deleteProfesseur() {
		daoP.delete(daoP.selectById(3));
	}

}
