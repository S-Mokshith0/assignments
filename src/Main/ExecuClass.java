package Main;

import java.util.Scanner;

import day2.day2ques;
import day_1.Day1ques;
import day_3.Day3ques;

public class ExecuClass implements begin {

	@Override
	public void beginn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the day no you want to access the questions: ");
		int DayNo = sc.nextInt();
		switch (DayNo) {
		case 1:
			Day1ques dq1 = new Day1ques();
			dq1.beginn();
			break;
		case 2:
			day2ques dq2 = new day2ques();
			dq2.beginn();
			break;
		case 3:
			Day3ques dq3 = new Day3ques();
			dq3.beginn();
			break;
		}
	}

}
