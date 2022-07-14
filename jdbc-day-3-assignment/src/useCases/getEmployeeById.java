package useCases;

import java.util.Scanner;

import bean.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;

public class getEmployeeById {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Eid:");
		int eid = scan.nextInt();
		
		EmployeeDao empdao = new EmployeeDaoImpl();
		
		try {
			Employee emp = empdao.getEmployeebyId(eid);
			System.out.println(emp);
		}catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
