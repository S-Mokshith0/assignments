package day_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class prob2 {
	private String s;
	/*public prob2() {
		takeInput();
	}*/
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the Sentence: ");
		s = sc.nextLine();
		sc.close();
		arr();
	}
	public void arr() {
		String [] a1= s.split(" ");
		Arrays.sort(a1,Comparator.comparing(String::length).thenComparing(String::compareTo));
		String a2 = String.join(" ", a1);
		System.out.println(a2);
	}
	
}
