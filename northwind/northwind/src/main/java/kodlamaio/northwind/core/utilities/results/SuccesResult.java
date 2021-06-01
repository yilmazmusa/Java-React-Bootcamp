package kodlamaio.northwind.core.utilities.results;

public class SuccesResult extends Result {
		
		public SuccesResult() { //işlem sonuucu başarılı ama mesaj vermiyor çünkü parametro yok
			
			super(true);
			
		}
	
		public SuccesResult(String message) { // burda işlem başarılı ve mesaj dönecek
			
			super(true,message);
			
			
		}

}
