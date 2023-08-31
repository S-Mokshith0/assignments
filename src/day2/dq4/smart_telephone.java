package day2.dq4;

public class smart_telephone extends telephone {

	@Override
	void lift() {
		System.out.print("Smartphone Lifted!");
	}

	@Override
	void disconnected() {
		System.out.print("Smartphone Disconnected!");
	}

}