package oops_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		//BMW try to access his own properties
		System.out.println("BMW b = new BMW()");
		b.start();
		b.autoParking();
		//BMW try to access parent class properties
		b.stop();
		b.refuel();
		//BMW try to access grandparent class properties
		b.engine();
		b.display(); //This is possible but throw warning boz it is static properties so call in static way below
		Vehicle.display();  //BMW try to access grandparent class, static properties
		System.out.println("-----------------------");
		
		System.out.println("Car c = new Car()");
		Car c = new Car();
		//Car try to access his own properties
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.display();//This is possible but throw warning boz it is static properties so call in static way below
		Vehicle.display();//Car try to access parent class, static properties
		System.out.println("-----------------------");
		
		System.out.println("Audi a = new Audi()");
		Audi a = new Audi();
		//Audi try to access his own properties
		a.start();
		a.theftSafety();
		//Audi try to access parent class properties
		a.start();
		a.refuel();
		//Audi try to access grandparent class properties
		a.engine();
		a.display();//This is possible but throw warning boz it is static properties so call in static way below
		Vehicle.display();  //Audi try to access grandparent class, static properties
		System.out.println("-----------------------");
		
		
		//Top casting 
		//Child class object can be referred by parent class reference variable
		System.out.println("Car c1 = new BMW()");
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		c1.display(); //Static method hence shows warning message
		System.out.println("-----------------------");
		
		System.out.println("Car c2 = new Audi()");
		Car c2 = new Audi();
		c2.start();
		c2.stop();
		c2.refuel();
		c2.engine();
		c2.display();  //Static method hence shows warning message
		System.out.println("-----------------------");
		
		System.out.println("Vehicle v1 = new Car()");
		Vehicle v1 = new Car();
		v1.engine();
		v1.display();  //Static method hence shows warning message
		v1.start();
		System.out.println("-----------------------");
		
		System.out.println("Vehicle v2 = new BMW()");
		Vehicle v2 = new BMW();
		v2.engine();
		v2.display();//Static method hence shows warning message
		v2.start();
		System.out.println("-----------------------");
		
		//Down Casting / Runtime Exception
		//BMW b2 = (BMW) new Vehicle();
		//b2.start(); // Down Casting not possible in classes -- Class cast exception come.
		//b2.autoParking();
		//b2.refuel();
		int $abc=5;
		int _abc=6;
		System.out.println($abc);
		System.out.println(_abc);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
