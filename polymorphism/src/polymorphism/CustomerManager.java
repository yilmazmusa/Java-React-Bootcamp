package polymorphism;

public class CustomerManager {

	
	private BaseLoger loger;
		
	
	public CustomerManager(BaseLoger loger) {
		
		this.loger=loger;
		
		
	}
	public void Add() {
		
		System.out.println("M��teri eklendi");
		this.loger.Logg("log mesaj�");
		
		
	}
	
	
}
