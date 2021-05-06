package polymorphism;

public class CustomerManager {

	
	private BaseLoger loger;
		
	
	public CustomerManager(BaseLoger loger) {
		
		this.loger=loger;
		
		
	}
	public void add() {
		
		System.out.println("Müþteri eklendi");
		this.loger.logg("log mesajý");
		
		
	}
	
	
}
