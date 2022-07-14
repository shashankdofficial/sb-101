package useCases;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

public class UpdateSalary {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			
			
			boolean up = dao.giveBonusToEmployee(500);
			if(up)
			{
				System.out.println("Updated....");
			}
			else
			{
				System.out.println("Not updated.....!");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
