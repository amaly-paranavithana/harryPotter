package testClasse;

import dao.DaoSort;
import metier.Sort;
import metier.InfoSort;

public class TestSort {

	public static void main(String[] args) {
		 //insertSort();
		 //selectSortById();
		 selectAllSort();
		// updateSort();
		// deleteSort();
	}

	static DaoSort daoS = new DaoSort();

	// ok
	public static void insertSort() {

		Sort eau = new Sort("Sortilege d'eau", InfoSort.EAU, InfoSort.EAU);
		Sort amnesie = new Sort("Sortilege d'amnesie", InfoSort.AMNESIE, InfoSort.AMNESIE);
		Sort attraction = new Sort("Sortilege d'attraction", InfoSort.ATTRACTION, InfoSort.ATTRACTION);
		Sort bouclier = new Sort("Charme du bouclier", InfoSort.BOUCLIER, InfoSort.BOUCLIER);
		Sort chatouillis = new Sort("Sortilege de chatouillis", InfoSort.CHATOUILLIS, InfoSort.CHATOUILLIS);
		Sort limace = new Sort("Sort de crache-limaces", InfoSort.LIMACE, InfoSort.LIMACE);
		Sort desarmement = new Sort("Sortilege de desarmement", InfoSort.DESARMEMENT, InfoSort.DESARMEMENT);
		Sort deverrouillage = new Sort("Sortilege de deverrouillage", InfoSort.DEVERROUILLAGE, InfoSort.DEVERROUILLAGE);
		Sort engorgement = new Sort("Sortilege d'engorgement", InfoSort.ENGORGEMENT, InfoSort.ENGORGEMENT);
		Sort expulsion = new Sort("Sortilege d'expulsion", InfoSort.EXPULSION, InfoSort.EXPULSION);
		Sort levitation = new Sort("Sortilege de levitation", InfoSort.LEVITATION, InfoSort.LEVITATION);
		Sort locomotion = new Sort("Charme de locomotion", InfoSort.LOCOMOTION, InfoSort.LOCOMOTION);
		Sort mutisme = new Sort("Sortilege de mutisme", InfoSort.MUTISME, InfoSort.MUTISME);
		Sort patronus = new Sort("Sortilege du patronus", InfoSort.PATRONUS, InfoSort.PATRONUS);
		Sort recurage = new Sort("Sortilege de recurage", InfoSort.RECURAGE, InfoSort.RECURAGE);
		Sort doloris = new Sort("Sortilege doloris", InfoSort.DOLORIS, InfoSort.DOLORIS);
		Sort furonculose = new Sort("Sortilege de furonculose", InfoSort.FURONCULOSE, InfoSort.FURONCULOSE);
		Sort gemino = new Sort("Malefice de gemino", InfoSort.GEMINO, InfoSort.GEMINO);
		Sort imperium = new Sort("Sortilege de l'imperium", InfoSort.IMPERIUM, InfoSort.IMPERIUM);
		Sort languedeplomb = new Sort("Sortilege de langue de plomb", InfoSort.LANGUEDEPLOMB, InfoSort.LANGUEDEPLOMB);
		Sort mort = new Sort("Sortilege de la Mort", InfoSort.MORT, InfoSort.MORT);
		Sort reduction = new Sort("Sortilege de reduction", InfoSort.REDUCTION, InfoSort.REDUCTION);
		Sort saucisson = new Sort("Malefice du saucisson", InfoSort.SAUCISSON, InfoSort.SAUCISSON);
		Sort prince = new Sort("Sortilege du Prince de Sang-Mêlé", InfoSort.PRINCE, InfoSort.PRINCE);
		Sort potdecolle = new Sort("Malefice du pot de colle", InfoSort.POTDECOLLE, InfoSort.POTDECOLLE);
		Sort bloquejambes = new Sort("Malefice du bloque-jambes", InfoSort.BLOQUEJAMBES, InfoSort.BLOQUEJAMBES);
		Sort explosif = new Sort("Malefice explosif", InfoSort.EXPLOSIF, InfoSort.EXPLOSIF);
		Sort entrave = new Sort("Malefice d'entrave", InfoSort.ENTRAVE, InfoSort.ENTRAVE);
	
		daoS.insert(eau);
		daoS.insert(amnesie);
		daoS.insert(attraction);
		daoS.insert(bouclier);
		daoS.insert(chatouillis);
		daoS.insert(limace);
		daoS.insert(desarmement);
		daoS.insert(deverrouillage);
		daoS.insert(engorgement);
		daoS.insert(expulsion);
		daoS.insert(levitation);
		daoS.insert(locomotion);
		daoS.insert(mutisme);
		daoS.insert(patronus);
		daoS.insert(recurage);
		daoS.insert(doloris);
		daoS.insert(furonculose);
		daoS.insert(gemino);
		daoS.insert(imperium);
		daoS.insert(languedeplomb);
		daoS.insert(mort);
		daoS.insert(reduction);
		daoS.insert(saucisson);
		daoS.insert(prince);
		daoS.insert(potdecolle);
		daoS.insert(bloquejambes);
		daoS.insert(explosif);
		daoS.insert(entrave);

	}

	//ok
	public static void selectSortById() {

		System.out.println(daoS.selectById(1));
		System.out.println(daoS.selectById(1).getNom() +" " + daoS.selectById(1).getInfoSort().getFormule() + " " + daoS.selectById(1).getInfoSort().getType());
	}

	// ok
	public static void selectAllSort() {
		for (Sort s : daoS.selectAll()) {
			System.out.println(s);
		}
	}

	//ok
	public static void updateSort() {
		Sort accio = daoS.selectById(1);
		accio.setNom("accio");
		daoS.update(accio);
		System.out.println(daoS.selectById(1));
	}

	//ok
	public static void deleteSort() {
		daoS.delete(daoS.selectById(3));
	}
}
