package interfacesDemo;

public class MySqlCustomerDal  implements ICustomerDal,IRepository {

	@Override
	public void Add() {
		
		System.out.println("My Sql Eklendi");
		
	}

}

//interfacelerde abstractlar gibi newlenemezzler.Ve imza taþýrlar.
//Ýmplementasyonun extendsten farký birden class birden fazla interfaceyi implement edebilmesidir.yukarýda var
//interfaceler onu implemente eden classýn referansýný tutabilir.Bu bir polimorfizimdir.Yukarda örneði var