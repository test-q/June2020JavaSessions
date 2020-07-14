package oops_AbstractConcept;

public class Test {

	public static void main(String[] args) {
		//Page p = new Page(); // U can not create object of abstract class and interface
		
		System.out.println("----------------LoginPage lp = new LoginPage()------------------");
		LoginPage lp = new LoginPage();
		lp.title();
		lp.header();
		lp.doLogin();
		lp.doLogin("rupali", "rup123");
		lp.display();
		Page.logo(); // calling static method from abstract class
		
		System.out.println("-------------------HomePage hp = new HomePage()------------------------");
		HomePage hp = new HomePage();
		hp.title();
		hp.header();
		hp.showAccountDetails();
		hp.display();//override happened
		
		System.out.println("-----------------Page  p = new LoginPage()---------------------");
		Page  p = new LoginPage();
		p.title();
		p.header();
		p.display();
		Page.logo();
		
		System.out.println("-----------------Page  p = new LoginPage()---------------------");
		Page p1 = new HomePage();
		p1.title();
		p1.header();
		p1.display();
		Page.logo();
		

	}

}
