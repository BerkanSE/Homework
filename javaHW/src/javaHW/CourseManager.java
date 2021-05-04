package javaHW;

public class CourseManager {

	public void add(Course course) {
		System.out.println(course.name + " added!");
	}
	
	public void GetAll(Course[] courses) {
		for (Course course : courses) {
			System.out.println(course.name);
		}
	}
	
}
