package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		
		/*polymorphism:�ok bi�imlilik demektir */
		/*polimorphism olmas� i�in �nce inheritance olmas� laz�m classlar aras�nda */
		/*LOGLAMA NED�R ? VER�TANANINA LOGLAMA YAPILAB�L�R,B�R DOSYAYA YAPILAB�L�R,E-MA�L G�NDER�LEB�L�R KR�T�K DURUMLARDA */
	
		
		/*EmailLogger logger=new EmailLogger();
		logger.Logg("Logg mesaj� ");*/
		
		
		/*BaseLoger[] loggers=new BaseLoger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger(),new ConsoleLogger()};
		
		for (BaseLoger loggerr : loggers) {
			
			loggerr.Logg("Log mesaj�");*/
			
			
			CustomerManager customerManager = new CustomerManager(new FileLogger());
			customerManager.add();
			
			
		}
		
	

}
