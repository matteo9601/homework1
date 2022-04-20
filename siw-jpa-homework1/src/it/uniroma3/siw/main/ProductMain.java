package it.uniroma3.siw.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductMain {
	
	//commenti sul file di testo e sul file README
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("homework1");
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
}
