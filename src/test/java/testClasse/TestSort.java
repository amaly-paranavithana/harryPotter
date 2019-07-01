package testClasse;

import dao.DaoSort;
import metier.Sort;
import metier.InfoSort;

public class TestSort {

	public static void main(String[] args) {
		 //insertSort();
		 selectSortById();
		// selectAllSort();
		// updateSort();
		// deleteSort();
	}

	static DaoSort daoS = new DaoSort();

	// ok
	public static void insertSort() {

		Sort eau = new Sort("Sortilege d'eau", InfoSort.EAU, InfoSort.EAU);
		Sort amnesie = new Sort("Sortilege d'amnesie", InfoSort.AMNESIE, InfoSort.AMNESIE);

		daoS.insert(eau);
		daoS.insert(amnesie);
		System.out.println(eau);
		System.out.println(amnesie);

	}

	// affiche null à la place de la formule et du type
	public static void selectSortById() {

		System.out.println(daoS.selectById(1));
			//	"NOM : " + daoS.selectById(1).getNom() + ", FORMULE : " + daoS.selectById(1).getFormule().getFormule() + ", TYPE : " + daoS.selectById(1).getType().getType());
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
