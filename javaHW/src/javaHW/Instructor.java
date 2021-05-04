package javaHW;

public class Instructor extends User{
	
	private String officeNumber;
	
	public Instructor() {
		
	}
	
	public Instructor(String officeNumber, int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		this.officeNumber = officeNumber;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	
}
