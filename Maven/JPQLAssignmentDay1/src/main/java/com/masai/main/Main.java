package com.masai.main;

import javax.persistence.EntityManager;

import com.masai.entity.Address;
import com.masai.entity.Employee;
import com.masai.util.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = new Employee();
		emp.setGender("Male");
		emp.setName("Shashank");
		emp.setSalary(41666);
		
		Address homeadr = new Address("Uttar Pradesh", "Lucknow", "226001", "Home");
		Address offaddr = new Address("Lar Road", "Babhaniao","pata nahi", "Office");
		
//		emp.setGender("Male");
//		emp.setName("Gautam");
//		emp.setSalary(41666);
//		
//		Address homeadr = new Address("Uttar Pradesh", "Varanasi", "555555", "Home");
//		Address offaddr = new Address("Faizabad", "Faizabad","55555", "Office");
		
//		emp.setGender("Female");
//		emp.setName("Srishti");
//		emp.setSalary(200000);
//		
//		Address homeadr = new Address("Uttar Pradesh", "Bareli", "83931", "Home");
//		Address offaddr = new Address("West Bengal", "Kolkata","6753", "Office");
		
		
//		emp.setGender("Female");
//		emp.setName("Vaishnavi");
//		emp.setSalary(35000);
//		
//		Address homeadr = new Address("Uttar Pradesh", "Lucknow", "2226002", "Home");
//		Address offaddr = new Address("Uttar Pradesh", "Lucknow","226001", "Office");
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Done...");
		em.close();

	}

}
