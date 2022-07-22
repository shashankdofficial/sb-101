package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.dbUtil.EmpManager;
import com.masai.entity.Employee;

public class EmployeDaoImpl implements EmploeeDao {

	@Override
	public List<Employee> getAllEmployee() {
		EntityManager em = EmpManager.provideem();
		Query q = em.createQuery("select e from Emp e");
		List<Employee> emp = (List<Employee>)q.getResultList();
		return emp;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String address = "";
		EntityManager em = EmpManager.provideem();
		Employee emp = em.find(Employee.class, empId);
		if(emp==null) {
			address="";
		}else {
			address = emp.getAddress();
		}
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String print = "";
		EntityManager em = EmpManager.provideem();
		Employee emp = em.find(Employee.class, empId);
		if(emp == null) {
			print = "Employee does not exist";
		}else {
			em.getTransaction().begin();
			emp.setSalary(emp.getSalary()+bonus);
			em.getTransaction().commit();
			print = "Employee bonus added";
		}
		return print;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean message = false;
		EntityManager em = EmpManager.provideem();
		Employee emp = em.find(Employee.class, empId);
		if(emp == null) {
			message = false;
		}else {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			message = true;
		}
		return message;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		String [] nameAndAddress = new String[2];
		EntityManager em = EmpManager.provideem();
		Employee emp = em.find(Employee.class, empId);
		if(emp == null) {
			return null;
		}else {
			nameAndAddress[0]= emp.getName();
			nameAndAddress[1]= emp.getAddress();
		}
		return nameAndAddress;
	}

	
}
