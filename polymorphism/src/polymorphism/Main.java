package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		
		/*polymorphism:çok biçimlilik demektir */
		/*polimorphism olmasý için önce inheritance olmasý lazým classlar arasýnda */
		/*LOGLAMA NEDÝR ? VERÝTANANINA LOGLAMA YAPILABÝLÝR,BÝR DOSYAYA YAPILABÝLÝR,E-MAÝL GÖNDERÝLEBÝLÝR KRÝTÝK DURUMLARDA */
	
		
		/*EmailLogger logger=new EmailLogger();
		logger.Logg("Logg mesajý ");*/
		
		
		/*BaseLoger[] loggers=new BaseLoger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger(),new ConsoleLogger()};
		
		for (BaseLoger loggerr : loggers) {
			
			loggerr.Logg("Log mesajý");*/
			
			
			CustomerManager customerManager = new CustomerManager(new FileLogger());
			customerManager.Add();
			
			
		}
		
	

}
