package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	
public double hesapla (double tutar) { // biz burda BaseKrediHesapladaki hesapla metodunu burda ezdik �al��t�rmad�k.Yani overridable yapt�k yani �zerine yazpt�k.
										
		return tutar*1.10;
		
		
	}
	

}
