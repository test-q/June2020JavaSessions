package javaSessions;

import java.util.ArrayList;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		// can not create a function/method inside a function
		// functions are always independent or parallel to each other
		System.out.println("main method");

		// create the object of class:
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getName();

		int i = obj.add();
		System.out.println(i + 20);

		String n = obj.getTrainerName();
		System.out.println("trainer name is : " + n);

		System.out.println(obj.isPermanent());

		int s1 = obj.sum(10, 20);
		System.out.println(s1);

		int s2 = obj.sum(40, 50);
		System.out.println(s2);

		double value = obj.multiply(2.3, 3.4);
		System.out.println(value);
		
		System.out.println(obj.getStudentMarks("Naveen"));
		System.out.println(obj.getStudentMarks("Tom"));
		System.out.println(obj.getStudentMarks("naveen"));
		
		obj.launchDriver("opera");

		String[] studentArray = obj.getStudentsName("first");
		for(String s: studentArray) {
			System.out.println("Student Name: " +s);
		}
		
		ArrayList<String> products = obj.getProductList("Flipcart");
		System.out.println("Total number of product in store: " + products.size());
		
//		// For Each loop
//		for (String p : products) {
//			System.out.println(p);
//		}
//		
//		//For Each lambda method
//		products.forEach(pro -> System.out.println(pro));
		
		products.stream().forEach(System.out::println); //method reference in JDK 1.8
		
		System.out.println(obj.isUSCitizen("Shweta"));

	}

	// 1. no input and no return:
	// void -- method can not return anything
	//return type: void
	public void test() {
		System.out.println("test method...");
	}

	public void getName() {
		System.out.println("get name method...");
	}

	// 2. no input but some return:
	//return type: int
	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;// 30
		return c;
	}

	public String getTrainerName() {
		String name = "Naveen";
		return name;
	}

	public boolean isPermanent() {
		boolean flag = true;
		return flag;
	}

	// 3. some input but some return:
	public int sum(int x, int y) {
		System.out.println("SUM method....");
		int s = x + y;
		return s;
	}

	//return type: double
	/**
	 * this is used to multiply two numbers
	 * @param g
	 * @param h
	 * @return mul
	 */
	public double multiply(double g, double h) {
		System.out.println("multiply method");
		double mul = g * h;
		return mul;
	}

	/**
	 * This method is used to get the student marks on the basis of names.
	 * @param name
	 * @return int
	 */
	public int getStudentMarks(String name) {

		System.out.println("get Student Marks for ..." + name);
		
		int marks = -1;
		
		if (name.equalsIgnoreCase("Naveen")) {
			marks = 10;
		}

		else if (name.equalsIgnoreCase("Priya")) {
			marks = 50;
		}

		else if (name.equalsIgnoreCase("Piyanka")) {
			marks = 70;
		}

		else if (name.equalsIgnoreCase("llias")) {
			marks = 90;
		}

		else {
			System.out.println(name + " is not found....");
		}
		
		return marks;

	}
	
	//WAM where u have to send the browser name and launch the browser accordingly.
	/**
	 * This method give you browser launch or not based on browser name
	 * @param browserName
	 * @return browser Launch Info
	 */
	
	public void launchDriver(String browserName) {
		
		System.out.println("Launching Browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Launch google chrome");
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			System.out.println("Launch mozilla firefox");
		}else if(browserName.equalsIgnoreCase("IE")) {
			System.out.println("Launch Interne"
					+ ""
					+ "t Exploer");
		}else {
			System.out.println("Browser not found: " + browserName + " we dont support this browser...");
		}
		
	}

	//WAM --> which will take class name(String) -- return the list of Student Names (static Array)
	
	public String[] getStudentsName(String className) {
		
		String[] studentName = new String[5];
		if(className.equalsIgnoreCase("First")) {
			studentName[0] = "Trupti";
			studentName[1] = "Pramod";
			studentName[2] = "Rupali";
			studentName[3] = "Tanishq";
			studentName[4] = "Sharvi";
			
		}else if(className.equalsIgnoreCase("Second")) {
			studentName[0] = "Janak";
			studentName[1] = "Naveen";
			studentName[2] = "Mayur";
			studentName[3] = "Peter";
			studentName[4] = "Tom";
			
		}
		
		return studentName;
		
	}
	
	//WAM -- which will take ecomm site name, then return list of all the products(product are varies hence using ArrayList)
	
	public ArrayList<String> getProductList(String siteName) {
		System.out.println("Get the list of products from " + siteName);
		ArrayList<String> productList = new ArrayList<String>();
		
		if(siteName.equalsIgnoreCase("flipcart")) {
			productList.add("Apple Macbook Pro");
			productList.add("Apple iPhoneX");
			productList.add("Nike Shoes");
		}	
		else if(siteName.equalsIgnoreCase("amazon")){
			productList.add("Apple Macbook air");
			productList.add("Apple iPhoneX");
			productList.add("Reebok Shoes");
		}
		
		else if(siteName.equalsIgnoreCase("walmart")){
			productList.add("Windows 10 Lenovo");
			productList.add("Apple iPhoneX");
			productList.add("Nike Tshirts");
		}
		
		else{
			System.out.println("product list is not available for site: " + siteName);
		}
		
		return productList;
		
	}
	
	//WAM which will decide that person is US citizen or not...
		public boolean isUSCitizen(String personName){
			System.out.println("status for : " + personName);
			
			boolean status = false;
			
			if(personName.equalsIgnoreCase("Nimpa")){
				return status;
			}
			
			else if(personName.equalsIgnoreCase("Shweta")){
				status = true;
				return status;
			}
			
			else if(personName.equalsIgnoreCase("Naveen")){
				return status;
			}
			
			else{
				System.out.println(personName + " is not found.....");
				//return status;
			}
			
			return status;
		}

}
