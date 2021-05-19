package Concrete;

import Absrtact.PlayerService;
import Adapters.PersonCheckService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	PersonCheckService eDevlet;
	
	public PlayerManager(PersonCheckService personCheckService) {

		this.eDevlet=personCheckService;

		
	}
	
	@Override
	public void add(Player player) {
		
		if(eDevlet.validation(player)) {
			
			System.out.println(player.getLastName() + " " + player.getLastName() + "  isimli oyuncu eklendi\n "  );
		}
		
		
		
	}

	@Override
	public void update(Player player) {
		
		if(eDevlet.validation(player)) {
			
			System.out.println(player.getName() + " " + player.getLastName() + "    isimli oyuncu güncellendi\n");
		}
		
		
	}

	@Override
	public void delete(Player player) {
		
		if(eDevlet.validation(player)) {
			
			System.out.println(player.getName() + " " + player.getLastName() + "  isimli oyuncu silindi\n");
		}
	}

}
