package javaSessions;

public class UsersNullPointer {
	// class variables
	String name;
	int age;
	
	//Constructor
	public UsersNullPointer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		UsersNullPointer u1 = new UsersNullPointer("Tom", 25);
		UsersNullPointer u2 = new UsersNullPointer("Peter", 35);
		
		System.out.println(u1.name + " " + u1.age);
		u1 = null;
		
		//System.out.println(u1.name + " " + u1.age);//NullPointerException
		
		u1 = u2;
		System.out.println(u1.name + " " + u1.age);
		System.out.println(u2.name + " " + u2.age);

	}

}
