package testApp;

import dao.*;
import metier.*;

public class DataBase {

	public static void main(String[] args) {
		insertBaguette();
		insertEleve();
		insertProfesseur();
		insertSorcier();
		insertMaison();
		insertQualite();
		insertMatiere();
		insertSort();
	}

	static DaoBaguette daoB = new DaoBaguette();
	static DaoEleve daoE = new DaoEleve();
	static DaoProfesseur daoP = new DaoProfesseur();
	static DaoSorcier daoSorc = new DaoSorcier();
	static DaoMaison daoMai = new DaoMaison();
	static DaoQualite daoQ = new DaoQualite();
	static DaoMatiere daoMat = new DaoMatiere();
	static DaoSort daoSort = new DaoSort();

	public static void insertBaguette() {

		Baguette hG = new Baguette(Bois.VIGNE, Coeur.DRAGON, 27.3);// hermione
		Baguette mM = new Baguette(Bois.SAPIN, Coeur.DRAGON, 23.75);// mcgonagall
		Baguette rL = new Baguette(Bois.CYPRES, Coeur.LICORNE, 26.0);// Lupin
		Baguette sT = new Baguette(Bois.NOISETIER, Coeur.LICORNE, 23.75);// Trelawney
		Baguette aD = new Baguette(Bois.SUREAU, Coeur.SOMBRAL, 38.0);// Dumbledore

		Baguette cD = new Baguette(Bois.FRENE, Coeur.LICORNE, 30.5);// cedric
		Baguette tJ = new Baguette(Bois.IF, Coeur.PHENIX, 33.75);// Tom jedusor
		Baguette nL = new Baguette(Bois.CERISIER, Coeur.LICORNE, 33.02);// Neville
		Baguette dM = new Baguette(Bois.AUBEPINE, Coeur.LICORNE, 25.0);// Drago
		Baguette pP = new Baguette(Bois.CHATAIGNIER, Coeur.DRAGON, 23.0);// pettigrow
		Baguette hP = new Baguette(Bois.HOUX, Coeur.PHENIX, 27.5);// harry
		Baguette rW = new Baguette(Bois.SAULE, Coeur.LICORNE, 35.56);// james
		// Baguette rH = new Baguette(Bois.CHENE, null, 40.0);//hagrid
		// Baguette lP = new Baguette(Bois.SAULE, null, 25.6);//Lily
		// Baguette jP = new Baguette(Bois.ACAJOU, null, 27.5);//james
		// Baguette gW = new Baguette(Bois.IF, null, null);//giny
		// Baguette cW = new Baguette(Bois.FRENE, Coeur.LICORNE, null);//chrlie weasley

		daoB.insert(hG);
		daoB.insert(mM);
		daoB.insert(rL);
		daoB.insert(sT);
		daoB.insert(aD);
		daoB.insert(cD);
		daoB.insert(tJ);
		daoB.insert(nL);
		daoB.insert(dM);
		daoB.insert(pP);
		daoB.insert(hP);
		daoB.insert(rW);
		// daoB.insert(lP);daoB.insert(jP);daoB.insert(gW);daoB.insert(cW);daoB.insert(rH);
	}

	public static void insertEleve() {

		Eleve pW = new Eleve(Civilite.M, "Percy", "Weasley", false);
		Eleve fW = new Eleve(Civilite.M, "Fred", "Weasley", true);
		Eleve gW = new Eleve(Civilite.M, "Georges", "Weasley", true);
		Eleve rW = new Eleve(Civilite.M, "Ron", "Weasley", true);
		Eleve hG = new Eleve(Civilite.MME, "Hermion", "Granger", false);
		Eleve nL = new Eleve(Civilite.M, "Neville", "Londubat", false); // 30/07/1980
		Eleve hP = new Eleve(Civilite.M, "Harry", "Potter", true); // 31/07/1980 cerf
		Eleve giW = new Eleve(Civilite.MME, "Ginevra", "Weasley", true);

		Eleve cC = new Eleve(Civilite.MME, "Cho", "Chang");
		Eleve pP = new Eleve(Civilite.MME, "Padma", "Patil");
		Eleve lL = new Eleve(Civilite.MME, "Luna", "Lovegood");

		Eleve hA = new Eleve(Civilite.MME, "Hannah", "abbott");
		Eleve sB = new Eleve(Civilite.MME, "Susan", "Bones");
		Eleve cD = new Eleve(Civilite.M, "Cedric", "Diggory", true); // 01/10/1977

		Eleve vC = new Eleve(Civilite.M, "Vincent", "Crabbe", true);
		Eleve gG = new Eleve(Civilite.M, "Gregory", "Goyle", true);
		Eleve dM = new Eleve(Civilite.M, "Drago", "Malefoy", true); // 05/06/1980
		Eleve tJ = new Eleve(Civilite.M, "Tom", "Jedusor");

		daoE.insert(pW);
		daoE.insert(fW);
		daoE.insert(gW);
		daoE.insert(rW);
		daoE.insert(hG);
		daoE.insert(nL);
		daoE.insert(hP);
		daoE.insert(giW);

		daoE.insert(cC);
		daoE.insert(pP);
		daoE.insert(lL);

		daoE.insert(hA);
		daoE.insert(sB);
		daoE.insert(cD);

		daoE.insert(vC);
		daoE.insert(gG);
		daoE.insert(dM);
		daoE.insert(tJ);
	}

	public static void insertProfesseur() {

		Professeur mM = new Professeur(Civilite.MME, "Minerva", "McGonagall");// 4/10/1935 Metamorphose chat
		Professeur sR = new Professeur(Civilite.M, "Severus", "Rogue");// 09/01/1960 Potion biche
		Professeur fF = new Professeur(Civilite.M, "Filius", "Flitwick");// Sortileges
		Professeur pC = new Professeur(Civilite.MME, "Pomora", "Chourave");// 15/05/1941 Botanique
		Professeur chaB = new Professeur(Civilite.MME, "Charity", "Burbage");// Etude des Moldus
		Professeur cB = new Professeur(Civilite.M, "Cuthbert", "Binns");// Histoire de la magie
		Professeur rB = new Professeur(Civilite.MME, "Renee", "Bibine");// Vol
		Professeur bB = new Professeur(Civilite.MME, "Bathsheda", "Babbling");// Etude des Runes
		Professeur rL = new Professeur(Civilite.M, "Remus", "Lupin");// 10/03/1960 . Défense contre les
																		// forces du Mal loup
		Professeur aD = new Professeur(Civilite.M, "Albus", "Dumbledore");// 07/1881 phenix
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
	}

	public static void insertSorcier() {
		Sorcier lP = new Sorcier(Civilite.MME, "Lily", "Potter");
		Sorcier jP = new Sorcier(Civilite.M, "James", "Potter");

		daoSorc.insert(lP);
		daoSorc.insert(jP);
	}

	public static void insertMaison() {

		Maison g = new Maison("Gryffondor", Blason.GRYFFONDOR, "Nick Quasi-Sans-Tete");
		Maison sd = new Maison("Serdaigle", Blason.SERDAIGLE, "La Dame Grise");
		Maison p = new Maison("Poufsouffle", Blason.POUFSOUFFLE, "Le Moine Gras");
		Maison sp = new Maison("Serpentard", Blason.SERPENTARD, "Le Baron Sanglant");
		daoMai.insert(g);
		daoMai.insert(sd);
		daoMai.insert(p);
		daoMai.insert(sp);
	}

	public static void insertQualite() {

		Qualite g1 = new Qualite("Courage");
		Qualite g2 = new Qualite("Hardiesse");
		Qualite g3 = new Qualite("Force d'esprit");

		Qualite p1 = new Qualite("Equilibre");
		Qualite p2 = new Qualite("Loyaute");
		Qualite p3 = new Qualite("Constance");
		Qualite p4 = new Qualite("Patience");

		Qualite sd1 = new Qualite("Sagesse");
		Qualite sd2 = new Qualite("Discernement");
		Qualite sd3 = new Qualite("Erudition");
		Qualite sd4 = new Qualite("Curiosite");

		Qualite sp1 = new Qualite("Malice");
		Qualite sp2 = new Qualite("Adresse");
		Qualite sp3 = new Qualite("Determination");

		daoQ.insert(g1);
		daoQ.insert(g2);
		daoQ.insert(g3);
		daoQ.insert(p1);
		daoQ.insert(p2);
		daoQ.insert(p3);
		daoQ.insert(p4);
		daoQ.insert(sd1);
		daoQ.insert(sd2);
		daoQ.insert(sd3);
		daoQ.insert(sd4);
		daoQ.insert(sp1);
		daoQ.insert(sp2);
		daoQ.insert(sp3);
	}

	public static void insertMatiere() {

		Matiere astro = new Matiere("Astronomie");// Aurora Sinistra
		Matiere bota = new Matiere("Botanique");// Chourave
		Matiere def = new Matiere("Defense contre les forces du Mal");// Lupin
		Matiere histoire = new Matiere("Histoire de la magie");// Binns
		Matiere meta = new Matiere("Metamorphose");// McGonagall
		Matiere potion = new Matiere("Potions");// Rogue
		Matiere sortilege = new Matiere("Sortileges");// Flitwick
		Matiere vol = new Matiere("Vol sur balai");// Bibine
		Matiere arit = new Matiere("Arithmancie");// Vector
		Matiere div = new Matiere("Divination");// Trelawney
		Matiere moldu = new Matiere("Etude des Moldus");// burbage
		Matiere rune = new Matiere("Etude des runes");// Babbling
		Matiere soin = new Matiere("Soins aux créatures magiques");// Hagrid

		daoMat.insert(astro);
		daoMat.insert(bota);
		daoMat.insert(def);
		daoMat.insert(histoire);
		daoMat.insert(meta);
		daoMat.insert(potion);
		daoMat.insert(sortilege);
		daoMat.insert(vol);
		daoMat.insert(arit);
		daoMat.insert(div);
		daoMat.insert(moldu);
		daoMat.insert(rune);
		daoMat.insert(soin);
	}

	public static void insertSort() {
		Sort eau = new Sort("Sortilege d'eau", InfoSort.EAU);
		Sort amnesie = new Sort("Sortilege d'amnesie", InfoSort.AMNESIE);
		Sort attraction = new Sort("Sortilege d'attraction", InfoSort.ATTRACTION);
		Sort bouclier = new Sort("Charme du bouclier", InfoSort.BOUCLIER);
		Sort chatouillis = new Sort("Sortilege de chatouillis", InfoSort.CHATOUILLIS);
		Sort limace = new Sort("Sort de crache-limaces", InfoSort.LIMACE);
		Sort desarmement = new Sort("Sortilege de desarmement", InfoSort.DESARMEMENT);
		Sort deverrouillage = new Sort("Sortilege de deverrouillage", InfoSort.DEVERROUILLAGE);
		Sort engorgement = new Sort("Sortilege d'engorgement", InfoSort.ENGORGEMENT);
		Sort expulsion = new Sort("Sortilege d'expulsion", InfoSort.EXPULSION);
		Sort levitation = new Sort("Sortilege de levitation", InfoSort.LEVITATION);
		Sort locomotion = new Sort("Charme de locomotion", InfoSort.LOCOMOTION);
		Sort mutisme = new Sort("Sortilege de mutisme", InfoSort.MUTISME);
		Sort patronus = new Sort("Sortilege du patronus", InfoSort.PATRONUS);
		Sort recurage = new Sort("Sortilege de recurage", InfoSort.RECURAGE);
		Sort doloris = new Sort("Sortilege doloris", InfoSort.DOLORIS);
		Sort furonculose = new Sort("Sortilege de furonculose", InfoSort.FURONCULOSE);
		Sort gemino = new Sort("Malefice de gemino", InfoSort.GEMINO);
		Sort imperium = new Sort("Sortilege de l'imperium", InfoSort.IMPERIUM);
		Sort languedeplomb = new Sort("Sortilege de langue de plomb", InfoSort.LANGUEDEPLOMB);
		Sort mort = new Sort("Sortilege de la Mort", InfoSort.MORT);
		Sort reduction = new Sort("Sortilege de reduction", InfoSort.REDUCTION);
		Sort saucisson = new Sort("Malefice du saucisson", InfoSort.SAUCISSON);
		Sort prince = new Sort("Sortilege du Prince de Sang-Mêlé", InfoSort.PRINCE);
		Sort potdecolle = new Sort("Malefice du pot de colle", InfoSort.POTDECOLLE);
		Sort bloquejambes = new Sort("Malefice du bloque-jambes", InfoSort.BLOQUEJAMBES);
		Sort explosif = new Sort("Malefice explosif", InfoSort.EXPLOSIF);
		Sort entrave = new Sort("Malefice d'entrave", InfoSort.ENTRAVE);

		daoSort.insert(eau);
		daoSort.insert(amnesie);
		daoSort.insert(attraction);
		daoSort.insert(bouclier);
		daoSort.insert(chatouillis);
		daoSort.insert(limace);
		daoSort.insert(desarmement);
		daoSort.insert(deverrouillage);
		daoSort.insert(engorgement);
		daoSort.insert(expulsion);
		daoSort.insert(levitation);
		daoSort.insert(locomotion);
		daoSort.insert(mutisme);
		daoSort.insert(patronus);
		daoSort.insert(recurage);
		daoSort.insert(doloris);
		daoSort.insert(furonculose);
		daoSort.insert(gemino);
		daoSort.insert(imperium);
		daoSort.insert(languedeplomb);
		daoSort.insert(mort);
		daoSort.insert(reduction);
		daoSort.insert(saucisson);
		daoSort.insert(prince);
		daoSort.insert(potdecolle);
		daoSort.insert(bloquejambes);
		daoSort.insert(explosif);
		daoSort.insert(entrave);
	}
}
