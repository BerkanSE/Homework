package javaHW;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adl� e�itmen eklendi!");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adl� e�itmen silindi!");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adl� e�itmen g�ncellendi!");
	}
}
