package Entities;

public class NewYearCampaing   extends Campaing {
	
	
	public NewYearCampaing() {
		
		super.setDiscount(50);
		
		
	}
	
	public NewYearCampaing(int id, String name, double discount) {
			
		super(id,name,discount);
		
		
	}

}
