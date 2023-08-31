package day2.dq10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class fileWrite {
	public void writ(String s1) {
		 
		try {
		     
		      FileWriter writ = new FileWriter("C:\\Users\\senku.mokshith\\eclipse-workspace\\assessments\\src\\day2\\dq10\\hello_file", false); 		     
		      BufferedWriter output = new BufferedWriter(writ);
		      LocalDateTime dateTime = LocalDateTime.now();
		      DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			  String formaDate = dateTime.format(forma); 
		      
		      output.write(s1);
		      output.write("   ");
		      output.write(formaDate);
		      output.close();
		      System.out.println("successful.");
		    } catch (Exception e) {
		    	 e.printStackTrace();
		    }
		
	}
}
