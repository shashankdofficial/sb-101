package com.masai.useCases;

import java.util.List;

import com.masai.entity.Employee;

import Dao.EmploeeDao;
import Dao.EmployeDaoImpl;

public class EmployeeDetails {

	public static void main(String[] args) {
		EmploeeDao ed = new EmployeDaoImpl();
		List<Employee> employee = ed.getAllEmployee();
		
		for(Employee e:employee) {
			System.out.println(e);
		}
	}
}
