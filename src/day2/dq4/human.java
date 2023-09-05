package day2.dq4;

public class human extends monkey implements basic_animal {

	@Override
	public void eat() {
		System.out.print("Human is eating!");

	}

	@Override
	public void sleep() {
		System.out.print("Human is Sleeping!");

	}

}


