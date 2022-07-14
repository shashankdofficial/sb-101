package useCases;

import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

public class InsertEmployeeDetails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Eid:");
		int id = scan.nextInt();
		
		System.out.println("Enter Name:");
		String name = scan.next();
		
		System.out.println("Enter Address:");
		String address = scan.next();
		
		System.out.println("Enter Salary:");
		int salary = scan.nextInt();
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		String msg= dao.insertEmployeeDetails(id, name, address, salary);
		System.out.println(msg);
	}
	
}
