package oops_AbstractConcept;

public class LoginPage extends Page{
	
	//To access abstract class, u must be inherit from another class. Method body provide in child class

	@Override
	public void title() {
		System.out.println("LoginPage.....Title");
		
	}

	@Override
	public void header() {
		System.out.println("LoginPage.....Header");
		
	}
	
	public void doLogin() {
		System.out.println("LoginPage.....doLogin....0Parameter");
	}
	
	public void doLogin(String userName, String password) {
		System.out.println("LoginPage.....doLogin....2Parameters" +userName +" " + password);
	}

}
