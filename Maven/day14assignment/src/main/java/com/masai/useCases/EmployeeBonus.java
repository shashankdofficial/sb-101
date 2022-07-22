package com.masai.useCases;

import java.util.Scanner;

import Dao.EmploeeDao;
import Dao.EmployeDaoImpl;

public class EmployeeBonus {

	public static void main(String[] args) {
		EmploeeDao ed = new EmployeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter bonus amount");
		int bonus = sc.nextInt();
		String message = ed.giveBonusToEmployee(id, bonus);
		System.out.println(message);

	}

}
