package myjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import myjpa.entities.Staff;

public class MyJPA {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("myJPA");
		EntityManager em = emf.createEntityManager();

		// System.out.println("Is opened connection :: "+
		// factory.createEntityManager().isOpen());

		em.getTransaction().begin();

		Staff staff = new Staff();
		staff.setAge(51);
		staff.setName("John Doe");
		staff.setGender("M");
		staff.setSalary(25000);

		em.persist(staff);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
