
public class Person {

	private String name;
	private String dateOfBirth;
	
	public Person(String pName, String pDateOfBirth) {

		this.name = pName;
		this.dateOfBirth = pDateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "\nName= " + name + "\nDate of birth=" + dateOfBirth ;
	}
	
	
}

