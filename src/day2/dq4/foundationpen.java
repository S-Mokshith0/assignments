package day2.dq4;

public class foundationpen extends pen {

	@Override
	void write() {
		System.out.print("Writing with Fountain Pen!");

	}

	@Override
	void refill() {
		System.out.print("Refilling a fountain Pen!");
	}
	
	public void changeNib() {
		System.out.print("Changing Nib of Pen");
	}
}
