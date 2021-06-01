package kodlamaio.northwind.core.utilities.results;

public class SuccesDataResult<T> extends DataResult<T>{

	public SuccesDataResult(T data, String message) {
		super(data, true, message);
		
		
	}
	
	public SuccesDataResult (T data) { //data ve sonuç bilgisi dönderiyor
		
		super(data,true);
		
	}
	
	public SuccesDataResult(String message) { // sonuç ve mesaj bilgisi dönderiyor
		
		super(null,true,message);
	}
	
	public SuccesDataResult() { //sadece sonuc bilgisi dönderiyor
		
		super(null,true,null);
	}
	
	

}
