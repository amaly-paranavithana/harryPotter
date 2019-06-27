package dao;

import java.util.List;
import javax.persistence.*;
import application.Context;
import metier.Eleve;

public class DaoEleve implements DaoGeneric<Eleve, Integer> {

	public void insert(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.close();
	}

	public Eleve selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Eleve e = em.find(Eleve.class, id);
		em.close();
		return e;
	}

	public List<Eleve> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Eleve");
		List<Eleve> liste = query.getResultList();
		em.close();
		return liste;
	}

	public void update(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Eleve object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.remove(object);
		em.getTransaction().commit();
		em.close();
	}
}
