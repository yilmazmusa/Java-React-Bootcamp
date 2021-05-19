package Concrete;

import Absrtact.CampainService;
import Entities.Campaing;

public class CampaignManager implements CampainService {

	@Override
	public void add(Campaing campaing) {
		
		System.out.println(campaing.getName() + "  isimli kampanya eklendi");

	}

	@Override
	public void update(Campaing campaing) {

		System.out.println(campaing.getName() + "  isimli kampanya güncellendi");
	}

	@Override
	public void delete(Campaing campaing) {

		System.out.println(campaing.getName() + "  isimli kampanya silindi");
	}

}
