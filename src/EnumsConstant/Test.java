package EnumsConstant;

import java.time.*;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

import EnumsConstant.EnumCon.Level;

public class Test {

	public static void main(String[] arg) {
		Level myLevel = Level.HIGH;
		System.out.println(myLevel);
		
		switch(myLevel) {
		case LOW:
			System.out.println(Level.LOW);
			break;
		case MEDIUM:
			System.out.println(Level.MEDIUM);
			break;
		case HIGH:
			System.out.println(Level.HIGH);
			break;
		default:
			System.out.println("Enter Correct enum value");
			break;
		}
		System.out.println("**********************************");
		
		for(Level myVar : Level.values()) {
			System.out.println(myVar);
			
		}
		
		System.out.println("Current date: " + LocalDate.now());
		System.out.println("Current date: " + LocalTime.now());
		System.out.println("Current Date and Time: " + LocalDateTime.now());
		
		//How to Chenge Date time format
		LocalDateTime obj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
		String formattedDate = obj.format(myFormatObj);
		System.out.println("After formatting: " +formattedDate );
	}

}
