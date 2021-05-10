package interfacesDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
		
		//customerManager.customerDal=new MySqlCustomerDal(); // CustomerManagerin içinde public Customer diye constructor tanýmlayýp,içindeki deðiþkenide yukarda private yaparsak bu koda gerek kalmaz
														      //burda belirteceðimize 1 satýr üste CustructorManagerin içinde belirtiriz yukarda var
		
		customerManager.add();
		
	}

}

//interfacelerde abstractlar gibi newlenemezzler.Ve imza taþýrlar.
//Ýmplementasyonun extendsten farký birden class birden fazla interfaceyi implement edebilmesidir.
//interfaceler onu implemente eden classýn referansýný tutabilir.Bu bir polimorfizimdir.Yukarda örneði var