package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result { //Burda data döndereceğimiz için datanın tipi her şey olabilir o yüzde <T> şeklinde yaptık

	private T data;
	
	public DataResult(T data, boolean succes, String message) {
		super(succes, message); 			// super sayesinde base sınıftan(Result)  boolean succes, String message bilgileri set ediliyo biz sadece T data bilgisini set etmemiz gerekiyo
		this.data=data;
	}
	
	public DataResult(T data, boolean succes) { // burda message bilgisi dönmedik.data ve sonuc bilgisi döndük
		
		super(succes); 							// super sayesinde base sınıftan(Result)  boolean succes bilgisi ediliyo biz sadece T data bilgisini set etmemiz gerekiyo
		this.data=data;
	}
	
	public T getData() { //Datanın tipi her şey olabilir o yüzden T belirledik.
		
		return this.data;
		
	}

}
