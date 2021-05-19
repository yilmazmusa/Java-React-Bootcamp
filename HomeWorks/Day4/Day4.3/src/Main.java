import Concrete.CampaignManager;
import Concrete.FakeCheckUserService;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Game;
import Entities.NewYearCampaing;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		NewYearCampaing campaing=new NewYearCampaing();
		NewYearCampaing campaing1= new NewYearCampaing(101,"Devindirim",45);
		
		Player player= new Player(1,"Musa","Yýlmaz","14978925801","1996");
		
		
		Game game=new Game(1,"PES2021","FUTBOL",385);
		
		PlayerManager playerManager=new PlayerManager(new FakeCheckUserService());
		playerManager.add(player);
		playerManager.update(player);
		playerManager.delete(player);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		SaleManager saleManager=new SaleManager();
		saleManager.saleGame(player, game);
		
		
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaing1);
		campaignManager.update(campaing1);
		campaignManager.delete(campaing1);
		
		
		
	}

}
