package com.masai.dbUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpManager {

	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("employeeUnit");
	}
	public static EntityManager provideem() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
