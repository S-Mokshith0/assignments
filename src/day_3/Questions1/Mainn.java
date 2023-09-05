package day_3.Questions1;

import Main.begin;

public class Mainn{
	public void main() {
		String s = "this is exception thrown by THROWN";
		try {
			throw new Exception(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am in the finally clause");
		}
	}

}
