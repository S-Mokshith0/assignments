package day_3.Question4;

public class MyException extends Exception{
	private String S;
	
	public MyException(String msg) {
		this.S = S;
	}
	public void Print() {
		System.out.println(S);
	}
}
