package org.tnsindia.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a dept1;
		Department department=new Department();
		department.setId(51);
		department.setName("HR");
		
		//create a dept2;
		
		Department department1=new Department();
		department1.setId(52);
		department1.setName("Finance");
		
		//crete an emp1;
		Employee emp=new Employee();
		emp.setEmp_id(21);
		emp.setEmp_name("Sandip Jadhav");
		emp.setSalary(30000);
		
		//crete an emp1;
		Employee emp1=new Employee();
		emp1.setEmp_id(22);
		emp1.setEmp_name("Rahul Chaudhari");
		emp1.setSalary(35500);
		
		//Inject Department into Employee
		emp.setDepartment(department);
		em.persist(emp);
		
		emp1.setDepartment(department1);
		em.persist(emp1);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();

		
						

	}

}
