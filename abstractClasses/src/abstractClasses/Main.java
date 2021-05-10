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
ben onun içerisini Base sýnýfta belirlemek istemiyorum ama bu sýnýfý kim inheriate ediyosa(kalýtým)(yani miras alýyosa),
hesapla metodunu override etmek zorunda yani hesapla metodunu almak zorunda alsýn ve kendine göre deðiþtirsin ama alsýn !! */

//absrtract kurallarý:abstract bir sýnýfýn absrtract olabilmesi için ör(public abstract class GameCalculator) olmasý gerekir.
//Aynýsý metot içinde geçerlidir ör(public abstract void hesapla();) þeklinde olmalýdýr
//absrtact bir sýnýfta illa abstract bir metot olmak zorunda deðildir.

//ABSRTACT SINIFLAR ASLA NEW LENEMEZ.

//ABSTRACTLAR onu implemente eden classýn referansýný tutabilir.Bu bir polimorfizimdir.Yukarda örneði var

//ABSTRACT sýnýflarýn(classlarýn) normal sýnýflardan(classlardan) farký newleyemiyoruz ve 
//zorunlu operasyonlar ekleyebiliyoruz,içini her sýnýfýn ayrý ayrý doldurmasý gereken operasyonlar doldurabiliyoruz



