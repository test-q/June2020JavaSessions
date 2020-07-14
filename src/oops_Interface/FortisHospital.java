package oops_Interface;

public class FortisHospital extends MedicalOrg implements USMedical, UKMedical, IndianMedical {

	//USMedical Interface
	@Override
	public void ambulanceService() {
		System.out.println("FortisHospital.....ambulanceService");
		
	}

	@Override
	public void cardioService() {
		System.out.println("FortisHospital.....cardioService");
		
	}

	@Override
	public void emergencyService() {
		System.out.println("FortisHospital.....emergencyService");
		
	}

	@Override
	//This method common for all interface hence there is no need to implement same method 3 times in class. Java not allow duplicate method.
	//use if else condition
	public void orthoService() {
		System.out.println("FortisHospital.....orthoService");
		
	}

	//UKMedical Interface
	@Override
	public void neuroService() {
		System.out.println("FortisHospital.....neuroService");
		
	}

	@Override
	public void entService() {
		System.out.println("FortisHospital.....neuroService");
		
	}

	//IndianMedical Interface
	@Override
	public void pediaService() {
		System.out.println("FortisHospital.....pediaService");
		
	}

	@Override
	public void oncologyService() {
		System.out.println("FortisHospital.....oncologyService");
		
	}

	@Override
	public void physioService() {
		System.out.println("FortisHospital.....physioService");
		
	}
	
	//Class own method
	public void medicalInsurance() {
		System.out.println("FortisHospital.....medicalInsurance");
	}
	
	public void medicalTraining() {
		System.out.println("FortisHospital.....medicalTraining");
	}
	
	//Try to override default method
	@Override
	public void billing() {
		System.out.println("DefaultMethod...FortisHospital.....billing");
	}

	//WHO methods
	@Override
	public void swinFlu() {
		System.out.println("WHO.....swinFlu");	
	}

	@Override
	public void covid19() {
		System.out.println("WHO.....covid19");	
		
	}
	
	
 
}
