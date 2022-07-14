package useCases;

import java.util.List;

import bean.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;

public class GetAllEmployee {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List <Employee> emp = dao.getAllEmployees();
			emp.forEach(e->{
				System.out.println("Eid is: "+e.getEid());
				System.out.println("Name is: "+e.getName());
				System.out.println("Address is: "+e.getAddress());
				System.out.println("salary is: "+e.getSalary());
				System.out.println("===================================");
			});
			
		}catch (EmployeeException e) {
			// TODO: handle exception
		}
	}
}
