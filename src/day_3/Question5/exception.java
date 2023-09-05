package day_3.Question5;

import Main.begin;
import java.util.Scanner;
public class exception implements begin{
	public void beginn() {
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		
		try {
			if (input == 1) {
				throw new Exception1("Exception 1");
			} else if(input == 2) {
				throw new Exception2("Exception 2");
			} else {
				throw new Exception3("Exception 2");
			}
		}
		catch(Exception e) {
			System.out.println("An exception has come  "+ e);
		}
	}
	
	
}
