package day_1;

import Main.begin;
import java.util.Scanner;

public class Day1ques implements begin {
	@Override
	public void beginn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the question no u want to access: ");
		int qNo = sc.nextInt();
		switch(qNo) {
			case 1:{
				prob1 p1 = new prob1();
				p1.takeInput();
				break;
			}
			case 2:{
				prob2 p2 = new prob2();
				p2.takeInput();
				break;
			}
			case 3:{
				prob3 p3 = new prob3();
				p3.takeInput();
				break;
			}
			case 4:{
				prob4 p4 = new prob4();
				p4.takeInput();
				break;
			}
		
		}
	}
}
	


