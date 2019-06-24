package dao;

import java.util.List;
import javax.persistence.*;
import application.Context;
import metier.Baguette;
import metier.Eleve;

public class DaoBaguette implements DaoGeneric<Baguette, Integer> {

	public void insert(Baguette object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.close();
	}

	public Baguette selectById(Integer id) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Baguette b = em.find(Baguette.class, id);
		em.close();
		return b;
	}

	public List<Baguette> selectAll() {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("from Baguette");
		List<Baguette> liste = query.getResultList();
		em.close();
		return liste;
	}

	public void update(Baguette object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Baguette object) {
		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.remove(object);
		em.getTransaction().commit();
		em.close();
	}

//SelectByBois	
	public Baguette selectWithBois(Integer id) {

		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em =emf.createEntityManager();
		
		Query query = em.createNamedQuery("Baguette.findWithBois", Baguette.class);
		query.setParameter("id", id);
		Baguette b = (Baguette) query.getSingleResult();
		em.close();
		return b;
	}

//SelectByCoeur	
	public Baguette selectWithCoeur(Integer id) {

		EntityManagerFactory emf = Context.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNamedQuery("Baguette.findWithCoeur", Baguette.class);
		query.setParameter("id", id);
		Baguette b = (Baguette) query.getSingleResult();
		em.close();
		return b;
	}
}
