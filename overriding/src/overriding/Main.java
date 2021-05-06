package overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new TarımKrediManager(), new OgretmenKrediManager() , new OgrenciKrediManager()};
			
		
		for (BaseKrediManager kredi : krediManagers) {
			
			System.out.println(kredi.hesapla(10000));
			
		}
		
	}

}
