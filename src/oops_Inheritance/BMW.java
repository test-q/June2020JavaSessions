package oops_Inheritance;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW....start");
	}
	
	public void autoParking() {
		System.out.println("BMW....parking");
	}
	
	public static void horn() {
		System.out.println("BMW.....Horn");
	}

}
