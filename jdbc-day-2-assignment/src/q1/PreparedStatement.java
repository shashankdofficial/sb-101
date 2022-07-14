package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

public class PreparedStatement {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter ID :");
//		int id = scan.nextInt();
		
//		System.out.println("Enter Name :");
//		String n = scan.next();
//		
//		System.out.println("Enter Address :");
//		String add = scan.next();
//		
//		System.out.println("Enter Salary :");
//		int sa = scan.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String s = "jdbc:mysql://localhost:3306/db2";
		
		try(Connection conn=DriverManager.getConnection(s, "root", "omanubhav123")) {
			
//part1-		
			//		  PreparedStatement ps = conn.prepareStatement("insert into employee2 values(?,?,?,?)");
			//			ps.setInt(1, id);
			//			ps.setString(2, n);
			//			ps.setString(3, add);
			//			ps.setInt(4, sa);
			//			
			//			int x = ps.executeUpdate();
			//			if(x>0) {
			//				System.out.println("Inserted...");
			//			}
			//			else
			//			{
			//				System.out.println("Not Inserted...");
			//			}
						
			//			PreparedStatement ps = conn.prepareStatement("select salary from employee2 where eid=?");
			//			ps.setInt(1, id);
			//			
			//			ResultSet rs = ps.executeQuery();
			//			if(rs.next())
			//			{
			//				System.out.println("Id id : " +rs.getInt("eid"));
			//				System.out.println("Name is : "+rs.getString("name"));
			//				System.out.println("Address is : "+rs.getString("address"));
			//				System.out.println("Salary is : "+rs.getInt("salary"));
			//			}
			//			else
			//			{
			//				System.out.println("Envalid Employee ID....");
			//			}
			//			
			

//part 2-
			//PreparedStatement ps = conn.prepareStatement("select * from employee");
			//		  
			//ResultSet rs = ps.executeQuery();
			//while (rs.next())
			//{
			//	System.out.println("Id is :" + rs.getInt("eid"));
			//	System.out.println("Name is :" + rs.getString("name"));
			//	System.out.println("Address is :" + rs.getString("address"));
			//	System.out.println("Salary is :" + rs.getInt("salary"));
			//	System.out.println("=====================================");
			//}
			
			
			
//part 3-
			//PreparedStatement ps = conn.prepareStatement("update employee2 set salary = salary+500");
			//		  int x=ps.executeUpdate();
			//		  if(x>0)
			//		  {
			//			  System.out.println("Updated...");
			//		  }
			//		  else
			//		  {
			//			  System.out.println("Not Updated.....");
			//		  }
			//		PreparedStatement s = conn.prepareStatement("select * from employee2");
			//					  
			//			ResultSet rs = s.executeQuery();
			//			while (rs.next())
			//			{
			//				System.out.println("Id is :" + rs.getInt("eid"));
			//				System.out.println("Name is :" + rs.getString("name"));
			//				System.out.println("Address is :" + rs.getString("address"));
			//				System.out.println("Salary is :" + rs.getInt("salary"));
			//				System.out.println("=====================================");
			//			}	
			
			
			
//part 4
			//		PreparedStatement ps=  conn.prepareStatement("insert into employee2 values(?,?,?,?)");  	
			//					ps.setInt(1, id);
			//					ps.setString(2, n);
			//					ps.setString(3, null);
			//					ps.setInt(4, s);
			//					
			//					int x=ps.executeUpdate();
			//					if(x>0)
			//					{
			//						System.out.println("Inserted...");
			//					}
			//					else
			//					{
			//						System.out.println("Not inserted.....");
			//					}
			//					  
			//			PreparedStatement p = conn.prepareStatement("select * from employee2");
			//					  
			//			ResultSet rs = p.executeQuery();
			//			while (rs.next())
			//			{
			//				System.out.println("Id is :" + rs.getInt("eid"));
			//				System.out.println("Name is :" + rs.getString("name"));
			//				System.out.println("Address is :" + rs.getString("address"));
			//				System.out.println("Salary is :" + rs.getInt("salary"));
			//				System.out.println("=====================================");
			//			}	
			
			
//part 5-
			//		  PreparedStatement ps = conn.prepareStatement("select * from employee where eid=?");
			//		  ps.setInt(1, id);
			//		  
			//		  ResultSet rs=ps.executeQuery();
			//		  if(rs.next())
			//		  {
			//			  System.out.println("Id is :" + rs.getInt("eid"));
			//			  System.out.println("Name is :" + rs.getString("name"));
			//			  System.out.println("Address is :" + rs.getString("address"));
			//			  System.out.println("Salary is :" + rs.getInt("salary"));
			//		  }
			//		  else
			//		  {
			//			  System.out.println("Employee is not there...");
			//		  }
				  
				  
			
			
//part 6-
			//		  PreparedStatement ps = conn.prepareStatement("select * from employee where salary > 80000");
			//		  ResultSet rs= ps.executeQuery();
			//		  while (rs.next())
			//		  {
			//					System.out.println("Id is :" + rs.getInt("eid"));
			//					System.out.println("Name is :" + rs.getString("name"));
			//					System.out.println("Address is :" + rs.getString("address"));
			//					System.out.println("Salary is :" + rs.getInt("salary"));
			//					System.out.println("=====================================");
			//		  }			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
