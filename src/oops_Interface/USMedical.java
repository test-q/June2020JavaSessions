package oops_Interface;

public interface USMedical extends WHO{
	
	public void ambulanceService();
	
	public void cardioService();
	
	public void emergencyService();
	
	public void orthoService();
	
	int min_fees = 10;
	
	//Java 1.8
	
	public static void covidTest() {
		System.out.println("Static Method Calling, JAVA 1.8, USMedical.....covidTest");
	}
	
	default void billing() {
		System.out.println("DefaultMethod...USMedical.....billing");
	}

}
