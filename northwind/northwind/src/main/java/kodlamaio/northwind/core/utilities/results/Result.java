package kodlamaio.northwind.core.utilities.results;

public class Result {
	
	private boolean succes;
	private  String message;
	
	
	public Result(boolean succes) { // burda sadece başarılı mı bilgisini dönüyoruz mesaaj bilgisini dönmüyoruz
		
		this.succes=succes;
		
	}
	
	public Result(boolean succes,String message) { // burda  hem başarılı mı bilgisini hemde mesaj bilgisini dönüyoruz 
		
		this(succes);
		this.message=message;
		
	}
	
	public boolean isSucces() { //burda getter oluşturduk,başarılı bilgisini dönecek,isSucces yerine getSucceste yazabilirdik
		
		return this.succes;
	}

	
	public String getMassage() { //burda getter oluşturduk,mesaj bilgisini dönecek
		
		return this.message;
	}
	
	
}
