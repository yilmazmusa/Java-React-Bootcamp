package abstractClasses;

public class Main {

	public static void main(String[] args) {
	
		
		ManGameCalculator manGameCalculator= new ManGameCalculator();
		
		manGameCalculator.hesapla();
		manGameCalculator.gameOver();

		GameCalculator gameCalculator=new WomenGameCalculator();
		
		
	}

}






/*absrtract:Benim bitane operasyonum(birden fazlada olabilir) var mesela hesapla,
ben onun i�erisini Base s�n�fta belirlemek istemiyorum ama bu s�n�f� kim inheriate ediyosa(kal�t�m)(yani miras al�yosa),
hesapla metodunu override etmek zorunda yani hesapla metodunu almak zorunda als�n ve kendine g�re de�i�tirsin ama als�n !! */

//absrtract kurallar�:abstract bir s�n�f�n absrtract olabilmesi i�in �r(public abstract class GameCalculator) olmas� gerekir.
//Ayn�s� metot i�inde ge�erlidir �r(public abstract void hesapla();) �eklinde olmal�d�r
//absrtact bir s�n�fta illa abstract bir metot olmak zorunda de�ildir.

//ABSRTACT SINIFLAR ASLA NEW LENEMEZ.

//ABSTRACTLAR onu implemente eden class�n referans�n� tutabilir.Bu bir polimorfizimdir.Yukarda �rne�i var

//ABSTRACT s�n�flar�n(classlar�n) normal s�n�flardan(classlardan) fark� newleyemiyoruz ve 
//zorunlu operasyonlar ekleyebiliyoruz,i�ini her s�n�f�n ayr� ayr� doldurmas� gereken operasyonlar doldurabiliyoruz



