package q2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		Address ad = new Address("Telangana", "Hyderabad", "500015");
		Employee emp = new Employee(2134, "Brijesh", ad, "Brijeshrai98@gmail.com", "1234");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));
		oos.writeObject(emp);
		oos.close();
		System.out.println("done...");
	}
}
