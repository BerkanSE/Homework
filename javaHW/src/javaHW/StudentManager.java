package javaHW;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " adlı öğrenci eklendi!");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " adlı öğrenci silindi!");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName() + " adlı öğrenci güncellendi!");
	}
	
	
	
}
