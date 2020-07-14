package javaSessions;

public class SplitConcept {
	
	public static void getEmpData(String input) {
		String[] value = new String[10];
		value = input.split("-");
		for(int k=0; k<value.length; k++) {
			System.out.println(value[k]);
		}
	}

	public static void main(String[] args) {
		
		String s = "java-python-ruby-javascript";
		String[] lang = s.split("-");
		System.out.println(lang.length);
		
		for(int i=0; i<lang.length; i++) {
			System.out.println(lang[i]);	
		}
		System.out.println("Single value: " +lang[0]);
		
		String s1 = "tom@gmail.com;tom;peter;SDET;9999";
		String[] data = s1.split(";");
		for(String a : data) {
			System.out.println(a);
		}
		System.out.println("Get all Emp data");
		getEmpData("rupali-sharvi-trupti");
		
		System.out.println("Single data");
		//String firstName = getEmpData().split(";")[0];
		
	

	}

}
