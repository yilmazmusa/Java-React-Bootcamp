package Concrete;

import Absrtact.SaleService;
import Entities.Campaing;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService {

	@Override
	public void saleGame(Player player, Game game) {

		double eskiFiyat= game.getPrice();
		
		if(game.getCampaing() ==null) {
			
			System.out.println(player.getName() + " " + player.getLastName() + "   isimli kullanýcý '" + game.getName()
			+ "' oyunu "+ game.getPrice() + " tl deðerinde baþarýyla satýn aldý\n");
		}
		
		else {
			
			double discountedPrice = game.getPrice() - game.getPrice() * game.getCampaing().getDiscount() / 100;
			game.setPrice(discountedPrice);
			
			System.out.println(player.getName() + " " + player.getLastName() + "   isimli kullanýcý '" + game.getName()
			+ "' oyunu "+ game.getPrice() + " tl deðerinde indirimle satýn aldý (eski fiyat : " + eskiFiyat + " tl)\n");
		}
	}

}
