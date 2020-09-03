package oops_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.ambulanceService();
		fh.cardioService();
		fh.emergencyService();
		fh.neuroService();
		fh.entService();
		fh.pediaService();
		fh.oncologyService();
		fh.physioService();
		fh.orthoService(); //Common for all interface 
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.medicalCourse(); //call from parent class
		USMedical.covidTest();//calling static method
		fh.billing();
		fh.swinFlu();
		fh.covid19();
		System.out.println("------------------------------");
		
		//Top casting
		USMedical us = new FortisHospital();
		System.out.println("USMedical us = new FortisHospital()");
		us.ambulanceService();
		us.cardioService();
		us.emergencyService();
		us.orthoService();
		us.billing();
		us.swinFlu();
		us.covid19();
		int newFees = USMedical.min_fees +10;
		System.out.println(USMedical.min_fees);
		System.out.println(newFees);
		
		System.out.println("------------------------------");
		
		WHO w = new FortisHospital();
		w.swinFlu();
		w.covid19();
		
		System.out.println("------------------------------");
		System.out.println("UKMedical uk = new FortisHospital()");
		UKMedical uk = new FortisHospital();
		uk.entService();
		uk.neuroService();
		uk.covid19();
		uk.swinFlu();
		
		

	}

}
