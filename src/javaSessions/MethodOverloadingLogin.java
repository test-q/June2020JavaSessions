package javaSessions;

public class MethodOverloadingLogin {

	public static void main(String[] args) {
		
		System.out.println("--------------METHOD OVERLOADING------------");
		MethodOverloadingLogin obj = new MethodOverloadingLogin();
		obj.login();
		obj.login(123456);
		obj.login("rupalik", "rup123");
		obj.login("rupalik", 1234567890);
		obj.login(1234567890, "rupalik");
		obj.login("rupalik", "rup123", 456123);
		obj.login("rupalik", "rup123", "rupali@gmail.com");
		
		
	}
	
	
		// Method Overloading: within the class, when we have more than one methods:
		// with the same name
		// with different number of params
		// with different sequence of params
		// with type of parameter
		// and this is called -- overloaded method

	public void login() {//0 parameter
		System.out.println("Login with no parameter");
	}
	
	public void login(int otp) {// 1 Parameter
		System.out.println("Login with OTP: " +otp);
		
	}
	
	public void login(String username, String password) {// 2 parameter
		System.out.println("Login with username and password: " +username+ " " +password);
		
	}
	
	public void login(String username, int phonenumber) {// 2 parameter 
		System.out.println("Login with username and phone number: " +username+ " " +phonenumber);
		
	}
	
	public void login(long phonenumber, String username) {
		System.out.println("Login with phone number and username: " +phonenumber+ " " + username);
	}
	

	public void login(String username, String password, int otp) { // 3 params
		System.out.println("Login with username and password and OTP: " +username+ " " +password+ " "+otp);
	}

	public void login(String username, String password, String email) { // 3
																		// params
		System.out.println("Login with username and password and email: " + username +" "+ password+ " " + email);
	}
	

}
