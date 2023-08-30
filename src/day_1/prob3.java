package day_1;

import java.util.Scanner;

public class prob3 {
	private char ch [];
	private int a;
	/*public prob3() {
		takeinput();
	}*/
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the no of letter u r giving: ");
		a =sc.nextInt();
		ch = new char[a];
		System.out.print("Give the letter in increasing order: ");
		for(int i=0;i<a;i++) {
			ch[i]=sc.next().charAt(0);
		}
		 find();
	}
	public void find() {
		int a = ((int)(ch[0]))-1;
		int d = (int)(ch[ch.length-1]);
		int a1=((a)*(a+1)/2);
		int d1 = (d)*(d+1)/2;
		int n=d1-a1;
		
		int c=0;
		for(int i=0;i<ch.length;i++){
			c=c+(int)ch[i];
		}
		System.out.println((char)(n-c));
	}
}
