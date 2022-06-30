package q1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioPack {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("abc.txt");
		if(Files.exists(p))
		{
			System.out.println("File is present");
		}
		else
		{
			
				Path p2 = Files.createFile(p);
			
		}
		String name = "Anubhav";
		
			Files.write(p, name.getBytes());
		
		
		List<String> ans = Files.readAllLines(p);
		for(String sr:ans)
		{
			System.out.println(sr);
		}
		System.out.println("Done....");
	}
}
