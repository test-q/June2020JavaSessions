package hashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("name", "Tom");
		empMap.put("email", "tom@gmail.com");
		empMap.put("city", "Bangalore");
		//empMap.put(null, null);
		//empMap.put(null, "USA");
		//empMap.put(null, "UK"); //Override null value
		empMap.put("country", "India");
		empMap.put("country", "Brazil");// Override country value
		empMap.put("lastname", null);
		
		
		System.out.println("Getting values using key...\n");
		System.out.println("Name: " + empMap.get("name"));
		System.out.println("Email: " + empMap.get("email"));
		System.out.println("City: " + empMap.get("city"));
		System.out.println("Taking USA: " + empMap.get("null"));
		System.out.println("Country: " + empMap.get("country"));
		System.out.println("LastName: " + empMap.get("lastname"));
		System.out.println("------------------------------------");
		
		//To print all values in HashMap use ---> entrySet(), getKey() and getValue()
		System.out.println("Print all values in HashMap use ---> entrySet(), getKey() and getValue() \n");
		for(Map.Entry<String, String> e : empMap.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		}
		System.out.println("------------------------------------");
		
		System.out.println("Print all \"Keys\" only by using keySet()...\n");
		for(String s : empMap.keySet()) {
			System.out.println("Key: " +s);
		}
		System.out.println("------------------------------------");
		
		
		System.out.println("Print all \"Values\" only by using value()...\n");
		for(String v : empMap.values()) {
			System.out.println("Values: " +v);
		}
		System.out.println("------------------------------------");
		
		//forEach with Lambda expression:
		System.out.println("forEach with Lambda expression\n");
		empMap.forEach((k,v)-> System.out.println("Keys: "+k+ " Values: " +v));
		

	}

}
