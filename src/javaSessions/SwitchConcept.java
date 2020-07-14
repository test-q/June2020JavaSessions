package javaSessions;

public class SwitchConcept {
	

	public static void launchBrowser(String name){
		
		switch(name) {
		case "chrome": 
			System.out.println("launch chrome browser");
			break;
			
		case "mozilla":
			System.out.println("Launch Mozilla Browser");
			break;
			
		case "IE":
			System.out.println("Launch IE browser");
			break;
			
		default:
			System.out.println("Browser not found: "+name );
			break;
			
		}
	}

	public static void main(String[] args) {
		
		int i = 10;
		
		switch (i) {
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Hello");
			break;
		case 10:
			System.out.println("Byee");
			break;

		default:
			System.out.println("No Match Found.");
			break;
		}
		
		launchBrowser("mozilla");

		

	}

}
