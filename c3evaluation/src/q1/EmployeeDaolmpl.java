package q1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import q1.bean.Employee;
import q1.dao.EmployeeDao;
import q1.exception.EmployeeException;
import q1.utility.DBUtill;

public class q1 implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
		
		String message = "Not saved...";
		
		try(Connection conn = DBUtill.provideConnection())
		{
			PreparedStatement ps = conn.prepareStatement("insert into Employee values (?,?,?,?)");
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "Inserted.....!";
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
        Employee emp = null;
		
		try(Connection conn = DBUtill.provideConnection())
		{
			PreparedStatement ps = conn.prepareStatement("select * from Employee where empid=?");
			ps.setInt(1, empId);
			
			ResultSet rs= ps.executeQuery();
			if (rs.next())
			{
				int i = rs.getInt("empid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				
		
				emp = new Employee(i, n, a, s);
				
			}
			else
			{
				throw new EmployeeException("Employee does not exits....");
			}
			
		} catch (SQLException e) {
			
			throw new EmployeeException(e.getMessage());
		} 
		
		
		
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		
List <Employee> employee= new ArrayList<>();
		
		try (Connection conn = DBUtill.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from Employee");
			
			ResultSet rs=ps.executeQuery();
			while (rs.next())
			{
				int i = rs.getInt("empid");
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
	public String deleteEmployee(int empId) throws EmployeeException {
		String message = "Not Deleted";
		
		try(Connection conn = DBUtill.provideConnection())
		{
			PreparedStatement ps = conn.prepareStatement("delete from Employee where empid=?");
			ps.setInt(1, empId);
			
			int x=ps.executeUpdate();
			if(x>0) message = "Deleted......";
			
			
			
		} catch (SQLException e) {
		
			throw new EmployeeException("Employee Don't exits......");
		}
		
		
		return message;
	}
	

}
