package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{
	
	public ErrorDataResult(T data, String message) {
		super(data, false, message);
		
		
	}
	
	public ErrorDataResult (T data) { //data ve sonuç bilgisi dönderiyor
		
		super(data,false);
		
	}
	
	public ErrorDataResult(String message) { // sonuç ve mesaj bilgisi dönderiyor
		
		super(null,false,message);
	}
	
	public ErrorDataResult() { //sadece sonuc bilgisi dönderiyor
		
		super(null,false);
	}

}
