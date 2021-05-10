package absrtractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager {

	@Override
	public void getData() {
		
		System.out.println("Veri getirildi : MySql ");
		
	}

	
	
}


//SOLÝD
//Open-Close prensibi:Bir sisteme(proðrama) yeni bir özellik getirildiðinde mevcuttaki
//hiçbir kodu deðiþtiremezsin.Deðiþtiriyotsan arýza vardýr iyi kod yazamamýþsýndýr.
//Biz yukarda MySqlDatabaseManageri ekledik ve daha sonra maindeki konfigarasyonu deðiþtirdik,
//onu deðiþtirmede sýkýntý yok orasý deðiþebilir adý üstünde konfigirasyon