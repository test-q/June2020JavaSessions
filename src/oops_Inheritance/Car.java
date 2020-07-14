package oops_Inheritance;

public class Car extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Car....start");
	}
	
	public void stop() {
		System.out.println("Car....stop");
	}
	
	public void refuel() {
		System.out.println("Car....refuel");
	}

}
