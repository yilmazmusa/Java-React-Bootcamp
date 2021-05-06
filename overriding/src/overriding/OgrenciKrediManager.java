package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	
public double hesapla (double tutar) { // biz burda BaseKrediHesapladaki hesapla metodunu burda ezdik çalıştırmadık.Yani overridable yaptık yani üzerine yazptık.
										
		return tutar*1.10;
		
		
	}
	

}
