package day2.dq4;

public class TV implements TVremote {

	@Override
	public void turnOn() {
		System.out.print("TV turned On!");

	}

	@Override
	public void turnOff() {
		System.out.print("TV turned off!");

	}
}