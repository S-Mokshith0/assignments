package day_1;

import java.util.Scanner;

public class prob4 {
	private String s1,s2;
	/*public prob4() {
		takeinput();
	}*/
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the First word: ");
		s1= sc.nextLine();
		System.out.print("Give the Second word: ");
		s2 = sc.nextLine();
		sc.close();
		cancomplete();
	}
	public void cancomplete() {
		String [] a1= s1.split("");
		int [] l = new int [a1.length];
		int count = 0;
		for(String s:a1) {
			l[count] = s2.indexOf(s);
			count++;
		}
		int count1=0;
		for(int i=0;i<l.length-1;i++) {
			if(l[i]>l[i+1]){
				count1++;
				break;	
			}	
		}
		if(count1==1) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}
	}
}
