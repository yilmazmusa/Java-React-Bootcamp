package interfacesDemo;

public class MySqlCustomerDal  implements ICustomerDal,IRepository {

	@Override
	public void Add() {
		
		System.out.println("My Sql Eklendi");
		
	}

}

//interfacelerde abstractlar gibi newlenemezzler.Ve imza ta��rlar.
//�mplementasyonun extendsten fark� birden class birden fazla interfaceyi implement edebilmesidir.yukar�da var
//interfaceler onu implemente eden class�n referans�n� tutabilir.Bu bir polimorfizimdir.Yukarda �rne�i var