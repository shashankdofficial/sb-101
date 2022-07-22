package com.masai.useCases;

import java.util.Scanner;

import Dao.EmploeeDao;
import Dao.EmployeDaoImpl;

public class EmployeeAddress {

	public static void main(String[] args) {
		
		EmploeeDao ed = new EmployeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id :");
		int id = sc.nextInt();
		String address = ed.getAddressOfEmployee(id);
		if(address=="") {
			System.out.println("Employee doesn't exist");
		}else {
			System.out.println("Address of employee -> "+id+" is "+address);
		}
		sc.close();
	}

}
