package dao;

import java.util.List;
import javax.persistence.*;
import application.Context;
import metier.Sorcier;

public class DaoSorcier implements DaoGeneric<Sorcier, Integer> {

	public void insert(Sorcier object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.close();
	}

	public Sorcier selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Sorcier s = em.find(Sorcier.class, id);
		em.close();
		return s;
	}

	public List<Sorcier> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Sorcier");
		List<Sorcier> liste = query.getResultList();
		em.close();
		return liste;
	}

	public void update(Sorcier object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Sorcier object) {
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
