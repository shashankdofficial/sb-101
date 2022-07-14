package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import exception.EmployeeException;
import utility.DBUtill;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String insertEmployeeDetails(int eid, String name, String address, int salary) {
		String message = "Not Inserted...!";
		
	try(Connection conn = DBUtill.provideConnection();) {
		PreparedStatement ps = conn.prepareStatement("insert into employee3 values (?,?,?,?)");
		
		ps.setInt(1, eid);
		ps.setString(2, name);
		ps.setString(3, address);
		ps.setInt(4, salary);
		
		int x = ps.executeUpdate();
		
		if(x>0) message = "Inserted....!";

		
	} catch (SQLException e) {
		message = e.getMessage();
	}
		
		return message;
	}

	
	
	
	@Override
	public int getSalaryByEid(int eid) throws EmployeeException{
		int salary = -1;
		
		try(Connection conn = DBUtill.provideConnection()) {
	    PreparedStatement ps = conn.prepareStatement("select salary from employee3 where eid=?");
	    ps.setInt(1,eid);
		
	    ResultSet rs = ps.executeQuery();
	    
	    if(rs.next())
	    	salary = rs.getInt("salary");
	    else {
	    	
	    	EmployeeException emp = new EmployeeException("Employee does not exits with the eid: "+eid);
	    	throw emp;
	    	
	    	
	    }
	    
		} catch (SQLException e) {
		
			throw new EmployeeException(e.getMessage());
			
		}
		
		return salary;
	}




	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		List <Employee> employee= new ArrayList<>();
		
		try (Connection conn = DBUtill.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from employee3");
			
			ResultSet rs=ps.executeQuery();
			while (rs.next())
			{
				int i = rs.getInt("eid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				
				Employee emp = new Employee(i, n, a, s);
				employee.add(emp);
			}
			if(employee.size()<=0)
			{
				throw new EmployeeException("There is no any employee");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		return employee;
	}




	@Override
	public boolean giveBonusToEmployee(int bonus) {
		
		boolean flag = false;
		
		try(Connection conn = DBUtill.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("update employee3 set salary = salary+?");
			
			ps.setInt(1, bonus);
			
			int x = ps.executeUpdate();
			if(x>0) flag = true;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}




	@Override
	public Employee getEmployeebyId(int eid) throws EmployeeException {
		Employee emp = null;
		
		try(Connection conn = DBUtill.provideConnection())
		{
			PreparedStatement ps = conn.prepareStatement("select * from employee3 where eid=?");
			ps.setInt(1, eid);
			
			ResultSet rs= ps.executeQuery();
			if (rs.next())
			{
				int i = rs.getInt("eid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				
		
				emp = new Employee(i, n, a, s);
				
			}
			else
			{
				throw new EmployeeException("Student does not exits....");
			}
			
		} catch (SQLException e) {
			
			throw new EmployeeException(e.getMessage());
		} 
		
		
		
		
		return emp;
	}




	@Override
	public List<Employee> getAllEmployeeWithCondition() throws EmployeeException {
		List <Employee> empl = new ArrayList<>();
		
		try (Connection conn = DBUtill.provideConnection())
		{
			PreparedStatement ps = conn.prepareStatement("select * from employee3 where salary > 80000");
		 	ResultSet rs= ps.executeQuery();
		 	while (rs.next())
		 	{
		 		int i = rs.getInt("eid");
		 		String n = rs.getString("name");
		 		String a = rs.getString("address");
		 		int s = rs.getInt("salary");
		 		
		 		Employee emp = new Employee(i, n, a, s);
		 		empl.add(emp);
		 		
		 		if(empl.size()<=0)
				{
					throw new EmployeeException("There is no any employee");
				}
		 		
		 		
		 	}
			
			
			
		} catch (SQLException e) {
			
			throw new EmployeeException(e.getMessage());
		}
		 
		
		return empl;
	}

}
