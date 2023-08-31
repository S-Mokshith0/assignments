package day2;

import java.util.Scanner;

import Main.begin;
import day2.dq1.d2q1;
import day2.dq10.d2q10;
import day2.dq2.d2q2;
import day2.dq3.d2q3;
import day2.dq4.d2q4;
import day2.dq5.d2q5;
import day2.dq6.d2q6;
import day2.dq7.d2q7;

import day2.dq9.d2q9;




public class day2ques implements begin {
	@Override
	public void beginn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the question no u want to access: ");
		int qNo = sc.nextInt();
		switch(qNo) {
			case 1:
				d2q1 dp1 = new d2q1();
				dp1.beginn();
				break;
			case 2:
				d2q2 dp2 = new d2q2();
				dp2.beginn();
				break;
			case 3:
				d2q3 dp3 = new d2q3();
				dp3.beginn();
				break;
			case 4:
				d2q4 dp4 = new d2q4();
				dp4.beginn();
				break;

			case 5:
				d2q5 dp5 = new d2q5();
				dp5.beginn();
				break;
			case 6:
				d2q6 dp6 = new d2q6();
				dp6.beginn();
				break;
			case 7:
				d2q7 dp7 = new d2q7();
				dp7.beginn();
				break;
			case 9:
				d2q9 dp9 = new d2q9();
				dp9.beginn();
				break;
			case 10:
				d2q10 dp10 = new d2q10();
				dp10.beginn();
				break;
				
				
		}
	}

}
