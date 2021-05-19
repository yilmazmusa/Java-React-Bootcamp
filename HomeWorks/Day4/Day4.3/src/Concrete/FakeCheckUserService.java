package Concrete;

import Adapters.PersonCheckService;
import Entities.Player;

public class FakeCheckUserService implements PersonCheckService{

	@Override
	public boolean validation(Player player) {

		if(player.getNationalityId().length()==11) {
			
			System.out.println(player.getName() + " " + player.getLastName() + "  isimli kullan�c� do�ruland�");
			 
			return true;
		}
		else {
			
			System.out.println("Kullan�c� bilgileri do�rulanamad�");
			
			return false;
		}
		
		
	}

}
