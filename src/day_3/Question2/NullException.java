package day_3.Question2;

import Main.begin;



public class NullException {
	public void nullexception() {
		Sample sample = new Sample();
		sample=null;
		try {
			sample.SampleMethod();
		}catch(NullPointerException exception) {
			System.out.println("this is the null exception   "+exception);
		}
	}
	
	
}
