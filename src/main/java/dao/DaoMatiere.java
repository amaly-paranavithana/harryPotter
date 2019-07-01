package dao;

import java.util.List;
import javax.persistence.*;
import application.Context;
import metier.Baguette;
import metier.Matiere;

public class DaoMatiere implements DaoGeneric<Matiere, Integer> {

	public void insert(Matiere object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.close();
	}

	public Matiere selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Matiere m = em.find(Matiere.class, id);
		em.close();
		return m;
	}

	public List<Matiere> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Matiere");
		List<Matiere> liste = query.getResultList();
		em.close();
		return liste;
	}

	public void update(Matiere object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Matiere object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		if (em.contains(object)) {
			em.remove(object);
		} else {
			em.remove(em.merge(object));
		}

		em.getTransaction().commit();
		em.close();
	}
}
