public class Main {

	public static void main(String[] args) {
		
		// Doctors 
		Doctor doctor1 = new Doctor("Edward Jenner", "May 17, 1749");
		doctor1.setSpeciality("Stroke specialist");
		
		Doctor doctor2 = new Doctor("Elizabeth Blackwell", "February 3, 1821");
		doctor2.setSpeciality("Stroke specialist");
		
		Doctor doctor3 = new Doctor("Daniel Hale Williams", "January 18, 1856");
		doctor3.setSpeciality("Stroke specialist");
		
		Doctor doctor4 = new Doctor("Alexander Fleming", "August 6, 1881");
		doctor4.setSpeciality("Stroke specialist");
		
		// Patients 
		
		Patients patient1 = new Patients("CHRIS EVANS", "June 13, 1981 ");
		patient1.setInsuranceCompany("Intact");
		patient1.setIllness("Stroke");
		
		Patients patient2 = new Patients("ROBERT DOWNEY, JR", "April 4, 1965");
		patient2.setInsuranceCompany("Allstate");
		patient2.setIllness("Heart Attack");
		
		Patients patient3 = new Patients("JENNIFER LAWRENCE", "ugust 15, 1990");
		patient3.setInsuranceCompany("Desjardins");
		patient3.setIllness("Diabete type 2");
		
		Patients patient4 = new Patients("CHANNING TATUM", "April 26, 1980");
		patient4.setInsuranceCompany("Wawanesa");
		patient4.setIllness("Diabete type 1");
		
		// Treatment from doctors for patients
		
		Treatment treatment1 = new Treatment();
		Treatment treatment2 = new Treatment();
		Treatment treatment3 = new Treatment();
		Treatment treatment4 = new Treatment();
		
		// first doctor 
		System.out.println("Doctor: " +doctor1);
		System.out.println("Speciality: " +doctor1.getSpeciality());
		System.out.println("");
		
		//first patient
		System.out.println("Patient: " +patient1);
		System.out.println("Illness is: " +patient1.getIllness());
		System.out.println("Insurance Company is: " +patient1.getInsuranceCompany());
		System.out.println("");
		
		// first treatment
		System.out.println("Treatment is:\n" +treatment1.Stroke());
		System.out.println(" ");
		
		// second doctor 
				System.out.println("Doctor: " +doctor2);
				System.out.println("Speciality: " +doctor2.getSpeciality());
				System.out.println("");
				
				//second patient
				System.out.println("Patient: " +patient2);
				System.out.println("Illness is: " +patient2.getIllness());
				System.out.println("Insurance Company is: " +patient2.getInsuranceCompany());
				System.out.println("");
				
				// second treatment
				System.out.println("Treatment is:\n" +treatment2.HeartAttackTreatment());
				System.out.println(" ");
				
				// third doctor 
				System.out.println("Doctor: " +doctor3);
				System.out.println("Speciality: " +doctor3.getSpeciality());
				System.out.println("");
				
				//third patient
				System.out.println("Patient: " +patient3);
				System.out.println("Illness is: " +patient3.getIllness());
				System.out.println("Insurance Company is: " +patient3.getInsuranceCompany());
				System.out.println("");
				
				// third treatment
				System.out.println("Treatment is:\n" +treatment3.Diabete2());
				System.out.println(" ");
		
		
				// fourth doctor 
				System.out.println("Doctor: " +doctor4);
				System.out.println("Speciality: " +doctor4.getSpeciality());
				System.out.println("");
				
				//fourth patient
				System.out.println("Patient: " +patient4);
				System.out.println("Illness is: " +patient3.getIllness());
				System.out.println("Insurance Company is: " +patient4.getInsuranceCompany());
				System.out.println("");
				
				// fourth treatment
				System.out.println("Treatment is:\n" +treatment4.Diabete1());
	}

}
