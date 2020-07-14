package javaSessions;

public class MethodOverloadingEcommSearch {

	public static void main(String[] args) {
		
		System.out.println("Method Overloading Ex: Ecommers site Search ");
		
		MethodOverloadingEcommSearch obj = new MethodOverloadingEcommSearch();
		obj.search();
		obj.search("Laptop");
		obj.search("Laptop", "Silver");
		obj.search("Laptop", 85000);
		obj.search("Laptop", "Blue", 75000);
		obj.search("Laptop", 98000, "Reliance Digital");
		
		

	}
	
	public void search() {
		System.out.println("Default Search with 0 parameter");
	}
	
	public void search(String name) {
		System.out.println("Search on Name: " +name);
	}
	
	public void search(String name, String color) {
		System.out.println("Search on Name and color: " +name+ " " +color);
	}
	
	public void search(String name, double price) {
		System.out.println("Search on Name and Price: " +name+ " " +price);
	}
	
	public void search(String name, String color, double price) {
	 	System.out.println("Search on Name, Color and Price: " +name+ " " +color+ " " +price);

	}

	public void search(String name, double price, String seller) {
		System.out.println("Search on Name, Price and Seller: " +name+ " " +price+ " " +seller);

	}
	
	// payments:
		public int payment(long CCNumber) {

				return 100;
		}

		public void payment(long CCNumber, int otp) {

		}

		public void payment(String paypalID, int otp) {

		}

		public void payment(int bankAccount, int otp) {

		}

		public void payment(String upi) {

		}

		public void payment(long GPay, int otp, String pwd) {

		}

	

}
