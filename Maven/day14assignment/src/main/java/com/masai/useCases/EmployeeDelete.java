package com.masai.useCases;

import java.util.Scanner;

import Dao.EmploeeDao;
import Dao.EmployeDaoImpl;

public class EmployeeDelete {

	public static void main(String[] args) {
		EmploeeDao ed = new EmployeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id to remove");
		int id = sc.nextInt();
		boolean ans = ed.deleteEmployee(id);
		if(ans) {
			System.out.println("Employee deleted");
		}else {
			System.out.println("Employee does not exist !");
		}
	}
}
