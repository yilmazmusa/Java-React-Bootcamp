
public class Course {
	
	int id;
	String name;
	String instructor;
	String detail;
	double price;
	
	
	/* Contsructor t�rlar�n �zellikleri class ile ayn� isimdediler ve return tipi yoktur(yani geriye de�er d�ndermezler)*/
	
	public Course(int id,String name,String instructor,String detail,double price) {
		
		this.id=id;
		this.name=name;
		this.instructor=instructor;
		this.detail=detail;
		this.price=price;
		
		
	}
	
	public Course() {
		
		
	
		
	}
	
}
