package absrtractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager {

	@Override
	public void getData() {
		
		System.out.println("Veri getirildi : MySql ");
		
	}

	
	
}


//SOL�D
//Open-Close prensibi:Bir sisteme(pro�rama) yeni bir �zellik getirildi�inde mevcuttaki
//hi�bir kodu de�i�tiremezsin.De�i�tiriyotsan ar�za vard�r iyi kod yazamam��s�nd�r.
//Biz yukarda MySqlDatabaseManageri ekledik ve daha sonra maindeki konfigarasyonu de�i�tirdik,
//onu de�i�tirmede s�k�nt� yok oras� de�i�ebilir ad� �st�nde konfigirasyon