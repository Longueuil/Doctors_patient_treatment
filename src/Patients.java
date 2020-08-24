
public class Patients extends Person{

	public Patients(String pName, String pDateOfBirth) {
		super(pName, pDateOfBirth);
		
	}

	private String insuranceCompany;
	private String illness;

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	
	
}
