package hashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class Credentials {
	 float roi;
	 HashMap<String, String> credMap;
	 
	 public Credentials() {
		 this.roi = 6.2f;
		 this.credMap = new HashMap<String, String>();
	 }
   

	public static void main(String[] args) {
		//customer, seller, distributor, vendor, partners, categorymanager
		Credentials obj = new Credentials();
		Credentials obj1 = new Credentials();
	
		obj.credMap.put("customer", "naveen@gmail.com : nav123");
		obj.credMap.put("seller", "rupali@gmail.com : rup123");
		obj.credMap.put("distributor", "purvi@gmail.com : pur123");
		obj.credMap.put("vendor", "vibha@gmail.com : vib123");
		obj.credMap.put("partners", "ravi@gmail.com : rav123");
		obj.credMap.put("categorymanager", "ramya@gmail.com : ram123");
		
	
		
		System.out.println("Print all pairs key-value\n");
		for(Map.Entry<String, String> p : obj.credMap.entrySet()) {
			System.out.println("Roles: " + p.getKey() + "    Values: " +p.getValue());
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Print Only all Keys\n");
		for(String k : obj.credMap.keySet()) {
			System.out.println("Keys: " +k);
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Print only all Values\n");
		for(String v : obj.credMap.values()) {
			System.out.println("Values: " +v);
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Print all Pairs using Lambda\n");
		obj.credMap.forEach((k,v) -> System.out.println("Keys: "+ k+ "    Values: " +v));
		System.out.println("------------------------------------------------------------");
		
		System.out.println("I want to login to the site based on role\n");
		obj.doLogin("customer");
		obj.doLogin("seller");
		obj.doLogin("distributor");
		obj.doLogin("vendor");
		obj.doLogin("partners");
		obj.doLogin("categorymanager");
		
		System.out.println("------------------------------------------------------------");
		String sellerUname = obj.credMap.get("seller").split(":")[0].trim();
		String sellerPwd = obj.credMap.get("seller").split(":")[1].trim();
		
		obj.doLogin(sellerUname, sellerPwd);
		//obj1.doLogin("seller");
	

	}

	
	public void doLogin(String role) {
		//Findout username and password i.e. value
		System.out.println("Login with Role: " + role);
		String username = credMap.get(role).split(":")[0].trim();
		String password = credMap.get(role).split(":")[1].trim();
		System.out.println("UserName: "+ username + "    Password: " +password);
		System.out.println();
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Login to the site: " +un+ " and " +pwd);
	}

}
