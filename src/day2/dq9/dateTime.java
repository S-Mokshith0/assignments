package day2.dq9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class dateTime {
	public void dt() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formaDate = dateTime.format(forma); 
	    System.out.println(formaDate); 
	}

}
