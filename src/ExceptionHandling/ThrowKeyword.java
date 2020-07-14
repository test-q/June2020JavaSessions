package ExceptionHandling;

public class ThrowKeyword {
	
	public void getAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}else {
			System.out.println("Access granted - You are old enough!");
		}
		
	}

	public static void main(String[] args) {
		
//		try {
//			System.out.println("Hi");
//			throw new Exception("RupaliException");
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Open chrome browser");
		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Open firefox browser");
		}else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("Open IE browser");
		}else {
			System.out.println("plz pass the right browser name..."+browser);
			try {
				throw new Exception("NoBrowserFoundException");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
		ThrowKeyword tk = new ThrowKeyword();
		tk.getAge(2);
	}

}
