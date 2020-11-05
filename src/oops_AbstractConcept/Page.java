package oops_AbstractConcept;

public abstract class Page {
	
	public int timeout = 10;
	private double price = 10.5;

	abstract public void title();
	
	abstract public void header();
	
	public static void logo() {
		System.out.println("Page.....Logo");
	}
	
	public void display() {
		System.out.println("Page......Display");
	}
	
	public double getPrice() {
		return price;	
	}

}
