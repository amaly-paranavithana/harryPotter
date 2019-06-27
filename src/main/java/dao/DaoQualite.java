package dao;

import java.util.List;
import javax.persistence.*;
import application.Context;
import metier.Qualite;

public class DaoQualite implements DaoGeneric<Qualite, Integer> {

	public void insert(Qualite object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.close();
	}

	public Qualite selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Qualite b = em.find(Qualite.class, id);
		em.close();
		return b;
	}

	public List<Qualite> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Qualite");
		List<Qualite> liste = query.getResultList();
		em.close();
		return liste;
	}

	public void update(Qualite object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Qualite object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.remove(object);
		em.getTransaction().commit();
		em.close();
	}
}
