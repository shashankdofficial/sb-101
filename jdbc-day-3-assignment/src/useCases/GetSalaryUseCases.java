package useCases;

import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;

public class GetSalaryUseCases {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Eid :");
		int eid = scan.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			int salary = dao.getSalaryByEid(eid);
			
			System.out.println("Employee salary is : "+salary);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
