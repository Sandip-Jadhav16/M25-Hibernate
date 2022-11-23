package org.tnsindia.onetooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class OnetooneunidirectionalDemo {


	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//Student created
		Students s=new Students();
		s.setID(200);
		s.setName("Sandip");
		
		Students s1=new Students();
		s1.setID(300);
		s1.setName("Mohan");
		
		//Address created
		Address a= new Address();
		a.setStreetNo(30);
		a.setArea("Nagar Road");
		a.setCity("Pune");
		
		Address a1=new Address();
		a1.setStreetNo(31);
		a1.setArea("FC Road");
		a1.setCity("Pune");
		
		//inject address into student
		s.setAddress(a);
		em.persist(s);
		
		s1.setAddress(a1);
		em.persist(s1);
		
		em.getTransaction().commit();
		System.out.println("The data added Successfully");
		em.close();
		f.close();
		

	}

}
