package testApp;

import java.util.Date;
import java.util.EnumSet;
import java.util.Scanner;

import dao.DaoBaguette;
import dao.DaoEleve;
import dao.DaoSorcier;
import metier.Baguette;
import metier.Bois;
import metier.Civilite;
import metier.Coeur;
import metier.Eleve;
import metier.Patronus;
import metier.Sorcier;

public class TestApp {

	public static void main(String[] args) {
		ajoutEleve();
	}

	static DaoBaguette daoB = new DaoBaguette();
	static DaoSorcier daoSorc = new DaoSorcier();
	static DaoEleve daoE = new DaoEleve();

	static Scanner clavierStr = new Scanner(System.in);
	static Scanner clavierInt = new Scanner(System.in);
	static Scanner clavierDb = new Scanner(System.in);
	static Scanner clavierDate = new Scanner(System.in);

//faire un try catch pour la saisie d'un int

	public static void accueil() {
		String nom, mdp, motDePasse;
		boolean boucler;

		System.out.println("Bienvenue à Poudlard sorcier! Quel est ton prenom?");
		nom = clavierStr.nextLine();

		do {
			System.out.println("Quel est le mot de passe?");
			mdp = clavierStr.nextLine();
			motDePasse = "je jure solennellement que mes intentions sont mauvaises";
			if (mdp.equalsIgnoreCase(motDePasse)) {
				boucler = false;
				System.out.println("Messieurs Lunard, Queudver, Patmol et Cornedrue\n" + "spécialistes en assistance\n"
						+ "aux Maniganceurs de Mauvais Coups\n" + "sont fiers de vous présenter\n"
						+ "LA CARTE DU MARAUDEUR");
				menu();
			} else {
				System.out.println("Mr. Lunard présente ses respects à " + nom
						+ " et lui demande de bien vouloir cesser de mettre son nez dans les affaires d'autrui. \nMr. Cornedrue approuve Mr. Lunard et voudrait ajouter que "
						+ nom + " est un(e) horrible cretin(e). \nMr. Queudver souhaite le bonjour à " + nom
						+ " et lui conseille de se laver les cheveux, s'il(elle) veut arrêter de ressembler à un tas d'ordures.\nMessieurs Lunard, Cornedrue, Patmol et Queudver");
				boucler = true;
			}
		} while (boucler != false);
	}

	public static void menu() {
		System.out.println(
				"Quelle carte servirait le mieux ton prochain mauvais coup?\n1. Carte de gestion d'un sorcier \n2. Carte de gestion des maisons \n3. Carte de gestion des matieres \n4. Méfait accompli ");
		switch (clavierInt.nextInt()) {
		case 1:
			menuSorcier();
			break;
		case 2:
			menuMaison();
			break;
		case 3:
			menuMatiere();
			break;
		case 4:
			// terminer;
			break;
		}
	}

	public static void menuSorcier() {
		System.out.println(
				"1. Gestion des baguettes \n2. Gestion des eleves \n3. Gestion des professeurs \n4. Gestion d'un autre sorcier \n5. Revenir a la premiere carte \6. Méfait accompli");
		switch (clavierInt.nextInt()) {
		case 1:
			menuBaguette();
			break;
		case 2:
			menuEleve();
			break;
		case 3:
			menuProfesseur();
			break;
		case 4:
			menuAutreSorcier();
			break;
		case 5:
			menu();
			break;
		case 6:
			// Terminer
			break;
		}
	}

//Fini!!!!
	private static void menuBaguette() {
		System.out.println(
				"\n1. Consulter la carte recensant toutes les baguettes existantes \n2. Créer une baguette \n3. Modifier une baguette \n4. Laisser une baguette choisir son sorcier \n5. Detruire une baguette \n6. Carte de gestion d'un sorcier \n7. Revenir a la premiere carte \n8. Méfait accompli");
		switch (clavierInt.nextInt()) {
		case 1:
			annuaireBaguette();
			menuBaguette();
			break;
		case 2:
			creerBaguette();
			menuBaguette();
			break;
		case 3:
			choisirBaguette();
			menuBaguette();
			break;
		case 4:
			assignerBaguette();
			menuBaguette();
			break;
		case 5:
			detruireBaguette();
			menuBaguette();
			break;
		case 6:
			menuSorcier();
			break;
		case 7:
			menu();
			break;
		case 8:
			// Terminer
		}
	}

	private static void annuaireBaguette() {
		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
		System.out.println("\n");
	}

	private static void creerBaguette() {

		System.out.println("Fabricant de baguette en herbe, choisis le type de bois que tu veux utiliser : \n"
				+ EnumSet.allOf(Bois.class));
		String type = clavierStr.nextLine().toUpperCase();

		System.out.println("Choisis le materiau du coeur que tu veux utiliser : \n" + EnumSet.allOf(Coeur.class));
		String materiau = clavierStr.nextLine().toUpperCase();

		System.out.println("Quelle taille veux-tu donner à cette baguette? (Format a utiliser : 30,0) ");
		Double taille = clavierDb.nextDouble();

		Baguette b = new Baguette(Bois.valueOf(type), Coeur.valueOf(materiau), taille);
		daoB.insert(b);
		System.out.println("\nFélicitations !!! Tu as créés la baguette suivante : \n" + b.toString() + "\n");

	}

	private static void choisirBaguette() {

		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
		System.out.println("\nChoisis l'id de la baguette à modifier : ");
		Integer choix1 = clavierInt.nextInt();

		Baguette b = daoB.selectById(choix1);
		System.out.println("\nCette baguette est en bois de " + b.getBois().getType() + " avec un coeur en "
				+ b.getCoeur().getMateriau() + ". Elle mesure " + b.getTaille() + " cm.");
		modifierBaguette(b);
		System.out.println("Tu as réussi !!! Voici la baguette obtenue : \n" + b.toString() + "\n");

	}

	private static Baguette modifierBaguette(Baguette b) {
		System.out.println(
				"Sur quelle modification veux-tu travailler?? \n1. Son bois \n2. Son coeur \n3. Sa taille \n4. J'ai fini, voir les caracteristiques de la nouvelle baguette");

		switch (clavierInt.nextInt()) {
		case 1:
			modifierBois(b);
			modifierBaguette(b);
			break;
		case 2:
			modifierCoeur(b);
			modifierBaguette(b);

			break;
		case 3:
			modifierTaille(b);
			modifierBaguette(b);
			break;
		case 4:
			return b;
		}
		return null;

	}

	private static Baguette modifierBois(Baguette b) {
		System.out.println("Choisis le type de bois a utiliser : \n" + EnumSet.allOf(Bois.class));
		String type = clavierStr.nextLine().toUpperCase();
		b.setBois(Bois.valueOf(type));
		daoB.update(b);
		return b;
	}

	private static Baguette modifierCoeur(Baguette b) {
		System.out.println("Choisis le materiau de coeur a utiliser : \n" + EnumSet.allOf(Coeur.class));
		String materiau = clavierStr.nextLine().toUpperCase();
		b.setCoeur(Coeur.valueOf(materiau));
		daoB.update(b);
		return b;
	}

	private static Baguette modifierTaille(Baguette b) {
		System.out.println("Quelle taille veux-tu lui donner?");
		Double taille = clavierDb.nextDouble();
		b.setTaille(taille);
		daoB.update(b);
		return b;

	}

	private static void assignerBaguette() {
		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
		System.out.println("\nChoisis l'id d'une baguette à la recherche d'un sorcier : ");
		Integer choixB = clavierInt.nextInt();

		Baguette b = daoB.selectById(choixB);

		for (Sorcier s : daoSorc.selectAll()) {
			System.out.println("Sorcier (id : " + s.getId() + ") : " + s.getCivilite().getLibelle() + " "
					+ s.getPrenom() + " " + s.getNom());
		}
		System.out.println("\nChoisis l'id dur sorcier recherché : \n");
		Integer choixS = clavierInt.nextInt();

		Sorcier s = daoSorc.selectById(choixS);

		s.setBaguette(b);
		daoSorc.update(s);
		System.out.println("\nSorcier (id : " + s.getId() + ") : " + s.getCivilite().getLibelle() + " " + s.getPrenom()
				+ " " + s.getNom() + ".\n" + s.getBaguette());

	}

	private static void detruireBaguette() {
		for (Baguette b : daoB.selectAll()) {
			System.out.println(b);
		}
		System.out.println("\nChoisis l'id de la baguette a detruire : ");
		Integer choixB = clavierInt.nextInt();
		Baguette b = daoB.selectById(choixB);
		daoB.delete(b);
		System.out.println("\nBaguette supprimée!");
	}

	private static void menuEleve() {
		System.out.println(
				"1. Ajouter un eleve \n2. Modifier un eleve \n3. Carte de gestion d'un sorcier \n4. Revenir a la premiere carte \5. Méfait accompli");
		switch (clavierInt.nextInt()) {
		case 1:
			ajoutEleve();
			menuEleve();
			break;
		case 2:
			modifierEleve();
			menuEleve();
			break;
		case 3:
			menuSorcier();
			break;
		case 4:
			menu();
			break;
		case 5:
			// Terminer
			break;
		}
	}

	private static void ajoutEleve() {

		System.out.print("Civilite ? " + EnumSet.allOf(Civilite.class));
		String civilite = clavierStr.nextLine().toUpperCase();

		System.out.print("Prenom ? ");
		String prenom = clavierStr.nextLine().toLowerCase();

		System.out.print("Nom ? ");
		String nom = clavierStr.next();

		//System.out.print("Date de naissance ? ");
		// Date naissance = clavierDate.next

		System.out.print("Patronus ? " + EnumSet.allOf(Patronus.class));
		String patronus = clavierStr.nextLine().toUpperCase();

		System.out.println("A-t-il une baguette définie ? oui/non");
		String choix = clavierStr.nextLine();
		Baguette baguette = new Baguette();
		if (choix.equalsIgnoreCase("oui")) {
			for (Baguette b : daoB.selectAll()) {
				System.out.println(b);
			}

			System.out.println("\nQuelle est sa baguette (selectionner l'id d'une baguette)? ");
			Integer choixB = clavierInt.nextInt();
			 baguette = daoB.selectById(choixB);
		}
		System.out.println("\nFais-il (elle) partie de l'équipde de quidditch? oui/non");
		String choixQ = clavierStr.nextLine();
		boolean quidditch = (choixQ.equalsIgnoreCase("oui")) ? true : false;

		Eleve e = new Eleve(Civilite.valueOf(civilite), prenom, nom, Patronus.valueOf(patronus), baguette, quidditch);

		daoE.insert(e);
		System.out.println(e.getCivilite().getLibelle() + " " + e.getPrenom() + " " + e.getNom()
				+ " a bien ete insere dans la liste d'eleves");

	}

	private static void modifierEleve() {
		// TODO Auto-generated method stub

	}

	private static void menuProfesseur() {
		System.out.println(
				"1. Ajouter un professeur \n2. Modifier un professeur \n3. Carte de gestion d'un sorcier \n4. Revenir a la premiere carte \n5.Méfait accompli");
		switch (clavierInt.nextInt()) {
		case 1:
			ajoutProf();
			menuProfesseur();
			break;
		case 2:
			modifierProf();
			menuProfesseur();
			break;
		case 3:
			menuSorcier();
			break;
		case 4:
			menu();
			break;
		case 5:
			// Terminer
		}
	}

	private static void ajoutProf() {
		// TODO Auto-generated method stub

	}

	private static void modifierProf() {
		// TODO Auto-generated method stub

	}

	private static void menuAutreSorcier() {
		System.out.println(
				"1. Ajouter un sorcier (ni eleve, ni professeur) \n2. Modifier un sorcier (ni eleve, ni professeur)\n3. Supprimer un sorcier (ni eleve, ni professeur)\n4. Carte de gestion d'un sorcier \n5. Revenir a la premiere carte \n6.Méfait accompli");
		switch (clavierInt.nextInt()) {
		case 1:
			ajoutSorcier();
			menuAutreSorcier();
			break;
		case 2:
			modifierSorcier();
			menuAutreSorcier();
			break;
		case 3:
			supprimerSorcier();
			menuAutreSorcier();
			break;
		case 4:
			menuSorcier();
			break;
		case 5:
			menu();
		case 6:
			// Terminer
		}

	}

	private static void ajoutSorcier() {
		// TODO Auto-generated method stub

	}

	private static void modifierSorcier() {
		// TODO Auto-generated method stub

	}

	private static void supprimerSorcier() {
		// TODO Auto-generated method stub

	}

	public static void menuMaison() {
		System.out.println(
				"1. Ajouter une maison \n2. Conculter une maison \n3. Modifier une maison \n4. Revenir a la premiere carte\n5. Mefait accompli");
		switch (clavierInt.nextInt()) {
		case 1:
			ajoutMaison();
			menuMaison();
			break;
		case 2:
			consulterMaison();
			menuMaison();
			break;
		case 3:
			modifierMaison();
			menuMaison();
			break;
		case 4:
			menu();
			break;
		case 5:
			// Terminer
			break;
		}
	}

	private static void ajoutMaison() {
		// TODO Auto-generated method stub

	}

	private static void consulterMaison() {
		// TODO Auto-generated method stub

	}

	private static void modifierMaison() {
		// TODO Auto-generated method stub

	}

	private static void menuMatiere() {
		// TODO Auto-generated method stub

	}

}
