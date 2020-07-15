package dataConversionConcept;

public class DataConversion {

	public static void main(String[] args) {
	
		//String to Integer conversion
		String x = "100";
		System.out.println(x+20); // concat String and Integer
		int y = Integer.parseInt(x); //It will give me pure Integer value
		System.out.println(y+20);
		System.out.println("------------------------------");
		
		System.out.println("Assignment Skip A\n");
		String t = "100A";
		System.out.println(t+20);
		//If i try to convert Integer value it will give me the error...bcoz it is not pure Integer value
		//int k = Integer.parseInt(t); //NumberFormatException
		//System.out.println(k+20);
		String r= t.replaceAll("A", "");
		System.out.println("New Value of t: " +r);
		int m = Integer.parseInt(r);
		System.out.println(m+20);
		System.out.println("------------------------------");
		
		//String to double
		String p = "12.33";
		System.out.println(p+20);
		double q = Double.parseDouble(p);
		System.out.println(q+2000);
		System.out.println("------------------------------");
		
		//Integer to String
		int a = 100;
		System.out.println(a+20);
		String b = String.valueOf(a); //This will give me "100" pure string
		System.out.println(b+20);
		
		
		
		

	}

}
