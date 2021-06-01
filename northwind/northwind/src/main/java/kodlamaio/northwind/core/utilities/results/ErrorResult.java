package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {
	
	public ErrorResult() { //işlem sonuucu başarısız ama başarısız mesaj  vermiyor çünkü parametro yok
		
		super(false);
		
	}
	
		
	public ErrorResult(String message) {
		
		super(false,message);
		
	}

}
