package com.masai.user;

import javax.persistence.EntityManager;

import com.masai.entity.Department;
import com.masai.entity.Employee;
import com.masai.utill.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Department dept = new Department();
		dept.setdName("Hr");
		dept.setLocation("Banglore");
		
		Employee emp1 = new Employee();
		emp1.setAddress("Lucknow");
		emp1.seteName("Shashank Dubey");
		emp1.setSalary(41666);
		emp1.setDept(dept);
		
		Employee emp2 = new Employee();
		emp2.setAddress("Lucknow");
		emp2.seteName("Vaishnavi");
		emp2.setSalary(35000);
		emp2.setDept(dept);
		
		Employee emp3 = new Employee();
		emp3.setAddress("Faizabaad");
		emp3.setDept(dept);
		emp3.seteName("Gautam");
		emp3.setSalary(32110);
		
		
		dept.getEmp().add(emp1);
		dept.getEmp().add(emp3);
		dept.getEmp().add(emp2);
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		
		System.out.println("Employee's Added...");
	}
}

