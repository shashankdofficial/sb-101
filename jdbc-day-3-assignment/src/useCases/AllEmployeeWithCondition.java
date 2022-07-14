package useCases;

import java.util.List;

import bean.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;

public class AllEmployeeWithCondition {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
		List <Employee> emp = dao.getAllEmployeeWithCondition();
		emp.forEach(e ->{
			System.out.println("Eid Is : "+e.getEid());
			System.out.println("Name is : "+e.getName());
			System.out.println("Address is : "+e.getAddress());
			System.out.println("Salary is : "+e.getSalary());
			System.out.println("=============================");
		});
		
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
