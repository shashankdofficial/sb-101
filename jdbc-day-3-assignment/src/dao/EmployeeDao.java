package dao;

import java.util.List;

import bean.Employee;
import exception.EmployeeException;

public interface EmployeeDao {

	public String insertEmployeeDetails(int eid,String name,String address,int salary);
	
	public int getSalaryByEid(int eid) throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	
	public boolean giveBonusToEmployee(int bonus);
	
	public Employee getEmployeebyId(int eid) throws EmployeeException;
	
	public List<Employee> getAllEmployeeWithCondition() throws EmployeeException;
}
