package javaSessions;

public class Person {
	//class variables
	String name;
	int age;
	double weight;
	char gender;
	String dob;

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		p1.name = "Sharvi";
		p1.age = 2;
		p1.weight = 5;
		p1.gender = 'F';
		p1.dob = "3-Jan-2018";
		
		p2.name = "Tanishq";
		p2.age = 10;
		p2.weight = 40;
		p2.gender = 'M';
		p2.dob = "20-Aug-2002";
		
		p3.name = "Janak";
		p3.weight = 110;
		
		new Person().name = "Tom";
		new Person().age = 25;
		
		System.out.println("Name: " +p1.name+ " Age: " +p1.age+ " Weight: " +p1.weight+ " Gender: " +p1.gender+ " DOB: " +p1.dob);
		System.out.println("Name: " +p2.name+ " Age: " +p2.age+ " Weight: " +p2.weight+ " Gender: " +p2.gender+ " DOB: " +p2.dob);
		System.out.println(p3.name + " " + p3.age + " " + p3.weight + " " + p3.gender + " " + p3.dob);
		System.out.println(p4.name + " " + p4.age + " " + p4.weight + " " + p4.gender + " " + p4.dob);
		System.out.println(new Person().name + " " + new Person().age);

	}

}
