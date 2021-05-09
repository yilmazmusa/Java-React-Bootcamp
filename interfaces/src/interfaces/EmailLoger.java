package interfaces;

public class EmailLoger implements Logger{

	@Override
	public void log(String message) {
		
		System.out.println("Email gönderildi: " + message);
		
	}

}
