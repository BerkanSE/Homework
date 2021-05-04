package javaHW;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + REACT)",
			
				300,
				"ffdf",
				123);
				
		//Course course2 = new Course(2,
		//		"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + REACT",
		//		"Engin Demiro�",
		//		0,
		//		"2 Ayl�k Kamp",
		//		600
		//		);
		
		CourseManager courseManager = new CourseManager();
		
		Course[] courses = { course1};
		
		//courseManager.add(course1);
		System.out.println("-----------------------------");
		//courseManager.add(course2);
		
		courseManager.GetAll(courses);
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setOfficeNumber("1234");
		
		//1 Instance olu�turma y�ntemi
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setAverage(78);
		student1.setFirstName("Berkan");
		student1.setLastName("Senger");
		student1.setGrade("4");
		
		//2.Instance olu�turma y�ntemi
		
		Student student2 = new Student("3",88.5,2,"Serap","�etin");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		
		User[] users = {student1,instructor1, student2};
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
	}

}
