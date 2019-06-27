package testClasse;

import dao.DaoSort;
import metier.Sort;
import metier.TypeSort;

public class TestSort {

	public static void main(String[] args) {
		// insertSort();
		// selectSortById();
		// selectAllSort();
		// updateSort();
		// deleteSort();
	}

	static DaoSort daoS = new DaoSort();

	// ok
	public static void insertSort() {

		Sort accio = new Sort("accio", TypeSort.ENCHANTEMENT);
		Sort avada = new Sort("avada kedavra", TypeSort.MALEDICTION);

		daoS.insert(accio);
		daoS.insert(avada);
		System.out.println(accio);
		System.out.println(avada);

	}

	// ok
	public static void selectSortById() {

		System.out.println(
				"NOM : " + daoS.selectById(1).getNom() + ", TYPE : " + daoS.selectById(1).getTypeSort().getType());
		System.out.println(
				"NOM : " + daoS.selectById(2).getNom() + ", TYPE : " + daoS.selectById(2).getTypeSort().getType());

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

	// A faire
	public static void deleteSort() {
		daoS.delete(daoS.selectById(3));
	}
}
