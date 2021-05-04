package javaHW;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adlý eðitmen eklendi!");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adlý eðitmen silindi!");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adlý eðitmen güncellendi!");
	}
}
