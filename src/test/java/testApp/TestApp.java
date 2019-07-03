package testApp;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		menu();
	}

	static Scanner clavierStr = new Scanner(System.in);
	static Scanner clavierInt = new Scanner(System.in);

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

	private static void menuBaguette() {
		System.out.println(
				"1. Créer une baguette \n2. Modifier une baguette \n3. Detruire une baguette \n4. Carte de gestion d'un sorcier \n5. Revenir a la premiere carte \6. Méfait accompli");
		switch (clavierInt.nextInt()) {
		case 1:
			creerBaguette();
			menuBaguette();
			break;
		case 2:
			modifierBaguette();
			menuBaguette();
			break;
		case 3:
			detruireBaguette();
			menuBaguette();
			break;
		case 4:
			menuSorcier();
			break;
		case 5:
			menu();
			break;
		case 6:
			// Terminer
		}

	}

	private static void creerBaguette() {
		// TODO Auto-generated method stub

	}

	private static void modifierBaguette() {
		// TODO Auto-generated method stub

	}

	private static void detruireBaguette() {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	public static void menuMatiere() {
		// TODO Auto-generated method stub

	}

}
