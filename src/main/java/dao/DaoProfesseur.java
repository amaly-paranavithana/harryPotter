package dao;

import java.util.List;
import javax.persistence.*;
import application.Context;
import metier.Professeur;

public class DaoProfesseur implements DaoGeneric<Professeur, Integer> {

	public void insert(Professeur object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.close();
	}

	public Professeur selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Professeur b = em.find(Professeur.class, id);
		em.close();
		return b;
	}

	public List<Professeur> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Professeur");
		List<Professeur> liste = query.getResultList();
		em.close();
		return liste;
	}

	public void update(Professeur object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Professeur object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.remove(object);
		em.getTransaction().commit();
		em.close();
	}
}
