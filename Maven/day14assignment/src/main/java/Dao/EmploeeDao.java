package Dao;

import java.util.List;

import com.masai.entity.Employee;

public interface EmploeeDao {

	public List<Employee> getAllEmployee();

	public String getAddressOfEmployee(int empId);

	public String giveBonusToEmployee(int empId, int bonus);

	public boolean deleteEmployee(int empId);

	public String[] getNameAndAddress(int empId);
}
