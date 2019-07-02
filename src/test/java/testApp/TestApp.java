package testApp;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		menu();
	}

	static Scanner clavierStr = new Scanner(System.in);
	static Scanner clavierInt = new Scanner(System.in);

	static void menu() {
		System.out.println("Bienvenue à Poudlard sorcier! Quel est ton nom?");
		String nom = clavierStr.nextLine();

		boolean boucler = true;
//faire un try catch pour la saisie d'un int	

		do {
			System.out.println("Quel est le mot de passe?");
		}

		while (boucler != false);
		{
			System.out.println("Erreur de saisie \nQuel est le mot de passe?");
			String motDePasse = "je jure solennellement que mes intentions sont mauvaises";
			String mdp = clavierStr.nextLine();
			if (mdp.equalsIgnoreCase(motDePasse)) {
				boucler = false;
			}
		}

		System.out.println("Messieurs Lunard, Queudver, Patmol et Cornedrue\r\n" + "spécialistes en assistance\r\n"
				+ "aux Maniganceurs de Mauvais Coups\r\n" + "sont fiers de vous présenter\r\n"
				+ "LA CARTE DU MARAUDEUR");

	}

}
