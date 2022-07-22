package com.masai.dbUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountManager {

	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("accountUnit");
	}
	public static EntityManager provideem() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
