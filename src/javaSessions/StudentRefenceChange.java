package javaSessions;

public class StudentRefenceChange {
	
	String name;
	int rollNum;
	String cName;
	
	public StudentRefenceChange(String name, int rollNum, String cName) {
		this.name = name;
		this.rollNum = rollNum;
		this.cName = cName;
	}

	public static void main(String[] args) {
		
		StudentRefenceChange s1 = new StudentRefenceChange("Rupali", 10, "fifth");
		StudentRefenceChange s2 = new StudentRefenceChange("Vibha", 11, "fourth");
		StudentRefenceChange s3 = new StudentRefenceChange("Nimpa", 12, "sixth");

		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName);
		System.out.println();
		
		s1 = s2;
		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName);
		System.out.println();
		
		s2 = s3;
		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName);
		System.out.println();
		
		s3 = s1;
		System.out.println(s1.name + " " + s1.rollNum + " " + s1.cName);
		System.out.println(s2.name + " " + s2.rollNum + " " + s2.cName);
		System.out.println(s3.name + " " + s3.rollNum + " " + s3.cName); 
		
	

	}

}
