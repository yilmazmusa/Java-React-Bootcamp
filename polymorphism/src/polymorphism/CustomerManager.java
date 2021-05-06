package polymorphism;

public class CustomerManager {

	
	private BaseLoger loger;
		
	
	public CustomerManager(BaseLoger loger) {
		
		this.loger=loger;
		
		
	}
	public void Add() {
		
		System.out.println("Müþteri eklendi");
		this.loger.Logg("log mesajý");
		
		
	}
	
	
}
