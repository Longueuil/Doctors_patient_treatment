
public class Doctor extends Person{
	
	private String speciality;
	

	public Doctor(String pName, String pDateOfBirth ) {
		super(pName, pDateOfBirth);
		
				
	}
	
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	
}
