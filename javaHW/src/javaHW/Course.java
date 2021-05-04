package javaHW;

public class Course {

	public Course() {
		System.out.println("Parametresiz Constructor (Yapýcý) blok çalýþtý.");
	}
	
	public Course(int id,String name,double price,String details,int numberOfEnrolle) {
		this.id = id;
		this.details = details;
		
		this.name = name;
		this.numberOfEnrolle = numberOfEnrolle;
		this.price = price;
	}
	
	//Course özelliklerini oluþturduk
	
	int id;
	String name;
	String details;
	
	double price;
	int numberOfEnrolle;
	
	
	
	
}
