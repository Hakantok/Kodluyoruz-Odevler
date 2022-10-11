import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat,fizik,turkce,kimya,muzik;
		double avarageToplam=0, dersSayisi=0, avarage;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz : ");
		mat = input.nextInt();
		
		System.out.print("Fizik notunuz : ");
		fizik = input.nextInt();
		
		System.out.print("Turkce notunuz : ");
		turkce = input.nextInt();
		
		System.out.print("Kimya notunuz : ");
		kimya = input.nextInt();
		
		System.out.print("Muzik notunuz : ");
		muzik = input.nextInt();
		
		
		if(mat >= 0 && mat <= 100) {
			avarageToplam += mat;
			++dersSayisi;
		}
		if(fizik >= 0 && fizik <= 100) {
			avarageToplam += fizik;
			++dersSayisi;
		}
		if(turkce >= 0 && turkce <= 100) {
			avarageToplam += turkce;
			++dersSayisi;
		}
		if(kimya >= 0 && kimya <= 100) {
			avarageToplam += kimya;
			++dersSayisi;
		}
		if(muzik >= 0 && muzik <= 100) {
			avarageToplam += muzik;
			++dersSayisi;
		}
		
		avarage = avarageToplam / dersSayisi;
		
		if(avarage >=55 ) {
			System.out.println("Geçtiniz");
		}else {
			System.out.println("Sýnýfta kaldýnýz");
		}
		
		System.out.println("Ortalamanýz : " + avarage);

	}

}
