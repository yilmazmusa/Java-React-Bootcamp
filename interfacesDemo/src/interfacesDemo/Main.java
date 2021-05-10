package interfacesDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
		
		//customerManager.customerDal=new MySqlCustomerDal(); // CustomerManagerin i�inde public Customer diye constructor tan�mlay�p,i�indeki de�i�kenide yukarda private yaparsak bu koda gerek kalmaz
														      //burda belirtece�imize 1 sat�r �ste CustructorManagerin i�inde belirtiriz yukarda var
		
		customerManager.add();
		
	}

}

//interfacelerde abstractlar gibi newlenemezzler.Ve imza ta��rlar.
//�mplementasyonun extendsten fark� birden class birden fazla interfaceyi implement edebilmesidir.
//interfaceler onu implemente eden class�n referans�n� tutabilir.Bu bir polimorfizimdir.Yukarda �rne�i var