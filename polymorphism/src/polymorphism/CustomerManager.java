package polymorphism;

public class CustomerManager {

	
	private BaseLoger loger;
		
	
	public CustomerManager(BaseLoger loger) {
		
		this.loger=loger;
		
		
	}
	public void add() {
		
		System.out.println("M��teri eklendi");
		this.loger.logg("log mesaj�");
		
		
	}
	
	
}
