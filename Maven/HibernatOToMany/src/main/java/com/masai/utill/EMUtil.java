package com.masai.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("EmployeeUnit");
	}
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}
}