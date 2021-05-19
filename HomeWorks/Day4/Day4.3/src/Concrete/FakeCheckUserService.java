package Concrete;

import Adapters.PersonCheckService;
import Entities.Player;

public class FakeCheckUserService implements PersonCheckService{

	@Override
	public boolean validation(Player player) {

		if(player.getNationalityId().length()==11) {
			
			System.out.println(player.getName() + " " + player.getLastName() + "  isimli kullanıcı doğrulandı");
			 
			return true;
		}
		else {
			
			System.out.println("Kullanıcı bilgileri doğrulanamadı");
			
			return false;
		}
		
		
	}

}
