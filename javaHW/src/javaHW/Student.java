package javaHW;

public class Student extends User {
	
	private String grade;
	private double average;
	
	public Student() {
		
	}
	
	
	public Student(String grade, double average, int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		this.grade = grade;
		this.average = average;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}
	
}
