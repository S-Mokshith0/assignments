package day2.dq10;

import java.io.BufferedReader;
import java.io.FileReader;

public class fileRead {
	public void read() {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\senku.mokshith\\eclipse-workspace\\assessments\\src\\day2\\dq10\\hello_file"))){
			String s;
			while ((s = br.readLine()) != null) {
			     // print the line
			     System.out.println(s);
			}
		}catch (Exception e) {
			   // handle the exception
			   e.printStackTrace();
	}
		}
	

}
