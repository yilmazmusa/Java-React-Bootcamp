
public class Course {
	
	int id;
	String name;
	String instructor;
	String detail;
	double price;
	
	
	/* Contsructor týrlarýn özellikleri class ile ayný isimdediler ve return tipi yoktur(yani geriye deðer döndermezler)*/
	
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
