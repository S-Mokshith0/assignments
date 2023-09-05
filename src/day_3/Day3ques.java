package day_3;

import java.util.Scanner;

import Main.begin;
import day_3.Question2.Day3question2;
import day_3.Question3.Day3question3;
import day_3.Question4.Day3question4;
import day_3.Question5.Day3question5;
import day_3.Questions1.Day3question1;


public class Day3ques implements begin {
	public void beginn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the question no you want to access: ");
		int x = sc.nextInt();
		switch(x) {
		case 1:
			Day3question1 day3question1 = new Day3question1();
			day3question1.beginn();
			break;
		case 2:
			Day3question2 day3question2 = new Day3question2();
			day3question2.beginn();
			break;
		case 3:
			Day3question3 day3question3 = new Day3question3();
			day3question3.beginn();
			break;
		case 4:
			Day3question4 day3question4 = new Day3question4();
			day3question4.beginn();
			break;
		case 5:
			Day3question5 day3question5 = new Day3question5();
			day3question5.beginn();
			break;
		}
		
		
	}

}
