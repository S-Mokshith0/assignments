package day2.dq7;

import java.util.Scanner;

import Main.begin;

public class d2q7 implements begin {
	public void beginn(){
		Scanner sc = new Scanner(System.in);
		int a[]=new int[20]; 
		for(int i =0;i<20;i++) {
			a[i] = sc.nextInt();
		}
		printCount pc = new printCount();
		pc.cou(a);
		
	}

}
