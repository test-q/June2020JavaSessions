package oops_AbstractConcept;

public class HomePage extends Page{

	//To access abstract class, u must be inherit from another class. Method body provide in child class
	@Override
	public void title() {
		System.out.println("HomePage.....Title");
		
	}

	@Override
	public void header() {
		System.out.println("HomePage.....Header");
		
	}
	
	public void showAccountDetails() {
		System.out.println("HomePage......showAccountDetails");
	}

	@Override
	public void display() {
		System.out.println("HomePage.....Display");
	}
}
