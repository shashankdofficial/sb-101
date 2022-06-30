package q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("emp.txt"));
		
		Employee em = (Employee)oos.readObject();
		
		System.out.println(em);
		
		oos.close();

	}

}
