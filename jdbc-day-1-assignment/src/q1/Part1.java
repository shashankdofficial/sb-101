package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter ID:");
//		int id = scan.nextInt();
		
//		System.out.println("Enter Name:");
//	    String name = scan.next();
//	    
//	    System.out.println("Enter Address:");
//		String add = scan.next();
//		
//		System.out.println("Enter Salary:");
//		int sal = scan.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Problem with loading the driver main class ");
		}
		
	  String sc = "jdbc:mysql://localhost:3306/db1";
	  
	  try(Connection conn= DriverManager.getConnection(sc, "root", "12345");) {

//part1
	//PreparedStatement ps = conn.prepareStatement("select salary from employee where eid=?");
	//ps.setInt(1, id);
	//  	
	//ResultSet res = ps.executeQuery();
	//	  	
	//if(res.next())
	//	{
	//	System.out.println("Salary is :" + res.getInt("salary"));
	// 	}
	//	else
	// 	{
	//	System.out.println("Employee dosen't exits....");
	//	} 
		  
		  
//part 2
	//		PreparedStatement ps=  conn.prepareStatement("insert into employee values(?,?,?,?)");  	
	//		ps.setInt(1, id);
	//		ps.setString(2, n);
	//		ps.setString(3, add);
	//		ps.setInt(4, s);
	//		
	//		int t = ps.executeUpdate();
	//		if(t > 0)
	//		{
	//			System.out.println("Inserted...");
	//		}
	//		else
	//		{
	//			System.out.println("Not inserted.....");
	//		}		  
	//PreparedStatement ps = conn.prepareStatement("select * from employee");
	//		  
	//ResultSet res = ps.executeQuery();
	//while (res.next())
	//{
	//	System.out.println("Id is :" + res.getInt("eid"));
	//	System.out.println("Name is :" + res.getString("name"));
	//	System.out.println("Address is :" + res.getString("address"));
	//	System.out.println("Salary is :" + res.getInt("salary"));
	//	System.out.println("=====================================");
	//}
		  
		  
//part 3
	//		  PreparedStatement ps = conn.prepareStatement("update employee set salary = salary+500");
	//		  int l = ps.executeUpdate();
	//		  if(l > 0)
	//		  {
	//			  System.out.println("Updated");
	//		  }
	//		  else
	//		  {
	//			  System.out.println("Not Updated");
	//		  }
	//		PreparedStatement ps = conn.prepareStatement("select * from employee");
	//					  
	//			ResultSet res = ps.executeQuery();
	//			while (res.next())
	//			{
	//				System.out.println("Id is :" + res.getInt("eid"));
	//				System.out.println("Name is :" + res.getString("name"));
	//				System.out.println("Address is :" + res.getString("address"));
	//				System.out.println("Salary is :" + res.getInt("salary"));
	//				System.out.println("=====================================");
	//			}
		  

//part 4-
	//			PreparedStatement ps=  conn.prepareStatement("insert into employee values(?,?,?,?)");  	
	//					ps.setInt(1, id);
	//					ps.setString(2, n);
	//					ps.setString(3, null);
	//					ps.setInt(4, s);
	//					
	//					int k = ps.executeUpdate();
	//					if(k > 0)
	//					{
	//						System.out.println("Inserted");
	//					}
	//					else
	//					{
	//						System.out.println("Not inserted");
	//					}
	//					  
	//			PreparedStatement ps = conn.prepareStatement("select * from employee");
	//					  
	//			ResultSet res = ps.executeQuery();
	//			while (res.next())
	//			{
	//				System.out.println("Id is :" + res.getInt("eid"));
	//				System.out.println("Name is :" + res.getString("name"));
	//				System.out.println("Address is :" + res.getString("address"));
	//				System.out.println("Salary is :" + res.getInt("salary"));
	//				System.out.println("=====================================");
	//			}
		  
		  
//part 5-
	//		  PreparedStatement ps = conn.prepareStatement("select * from employee where eid=?");
	//		  ps.setInt(1, id);
	//		  
	//		  ResultSet res=ps.executeQuery();
	//		  if(res.next())
	//		  {
	//			  System.out.println("Id is :" + res.getInt("eid"));
	//			  System.out.println("Name is :" + res.getString("name"));
	//			  System.out.println("Address is :" + res.getString("address"));
	//			  System.out.println("Salary is :" + res.getInt("salary"));
	//		  }
	//		  else
	//		  {
	//			  System.out.println("Employee is not there");
	//		  }
		  
		  
//part 6-
	//		  PreparedStatement ps = conn.prepareStatement("select * from employee where salary > 80000");
	//		  ResultSet res= ps.executeQuery();
	//		  while (res.next())
	//		  {
	//					System.out.println("Id is :" + res.getInt("eid"));
	//					System.out.println("Name is :" + res.getString("name"));
	//					System.out.println("Address is :" + res.getString("address"));
	//					System.out.println("Salary is :" + res.getInt("salary"));
	//					System.out.println("=====================================");
	//		  }
			  
		} catch (SQLException se) {
			
			se.printStackTrace();
		}
	}

}
