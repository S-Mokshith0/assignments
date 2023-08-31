package day_3.Question4;

import Main.begin;

public class except_ion implements begin{
	public void beginn() {
		try {
			throw new MyException("This is a exception");
		}
		catch(MyException e) {
			System.out.println("An exception has come  "+e.getMessage());
		}
	}
	
	
}
