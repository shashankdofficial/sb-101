package q1;

import java.util.List;

import q1.bean.Employee;
import q1.exception.EmployeeException;

public class EmployeeDao {

	public String saveEmployeeDetails(Employee employee);
	public Employee getEmployeeById(int empId) throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	public String deleteEmployee(int empId)throws EmployeeException;
}
