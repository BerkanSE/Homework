package javaHW;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " adl� ��renci eklendi!");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " adl� ��renci silindi!");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName() + " adl� ��renci g�ncellendi!");
	}
	
	
	
}
