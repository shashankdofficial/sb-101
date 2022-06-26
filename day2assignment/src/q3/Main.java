package q3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name:");
		String fname = sc.next();
		
		FileReader fr=new FileReader("d://"+fname);
		
		System.out.println("Enter Character to be counted:");
		char ch1 = sc.next().charAt(0);
		int i=fr.read();
		char ch = (char)i;
		
		int count = 0;
		while( i != -1) {
			
			if(ch == ch1 || ch == ch1) {
				count++;
			}
//			System.out.print((char) i);
			i = fr.read();
		}
		System.out.println(count);
	}
}
