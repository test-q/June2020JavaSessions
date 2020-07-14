package ExceptionHandling;

public class TryCatchConcept {

	public static void main(String[] args) {
		
		System.out.println("AA");
		System.out.println("AA");
		System.out.println("AA");
		
		try {
			System.out.println("testing....");
			//int i = 9/0;   
			
		}catch(Exception e) {
			System.out.println("Some Exception is coming...");
			e.printStackTrace();
		}
		
		TryCatchConcept obj = new TryCatchConcept();
		//obj = null;
		try {
			obj.getName();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			int p = 9/0;
			//obj = null;
			obj.getName();
			System.out.println("Value of P: " + p);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}

	}
	
	public void getName() {
		System.out.println("Get Name...");
	}

}
