import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yas, tip;
		double  mesafe, yasİndirimi, indirimliTutar, biletİndirimi,
				toplamTutar = 0, normalTutar = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz : ");
		mesafe = input.nextInt();
		System.out.print("Yaşınızı giriniz : ");
		yas = input.nextInt();
		System.out.print("Yolculuk tipini giriniz :\n1=> Tek Yön\n2=> Gidiş Dönüş : ");
		tip = input.nextInt();
		
		normalTutar = mesafe * 0.10;
		
		if(yas > 0 && yas < 12) {
			yasİndirimi = normalTutar * 0.50;
			indirimliTutar = normalTutar - yasİndirimi; 
					
			if(tip == 2) {
				biletİndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - biletİndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL");
			}
			else if (tip == 1) {
				System.out.println("Toplam tutar : " + indirimliTutar + " TL");
			}else {
				System.out.println("Hatalı veri girdiniz.");
			}
				
		}
		
		if(yas >= 12 && yas <=24) {
			yasİndirimi = normalTutar * 0.10;
			indirimliTutar = normalTutar - yasİndirimi; 
					
			if(tip == 2) {
				biletİndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - biletİndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL");
			}
			else if(tip == 1) {
				System.out.println("Toplam tutar : " + indirimliTutar + " TL");
			}else {
				System.out.println("Hatalı veri girdiniz.");
			}
				
		}
		
		if(yas > 24 && yas <=65) { 	
				if(tip == 2) {
					biletİndirimi = normalTutar * 0.20;
					toplamTutar = ( normalTutar - biletİndirimi);
					System.out.println("Toplam tutar : " + toplamTutar + " TL");
				}
				else if(tip == 1) {
					System.out.println("Toplam tutar : " + normalTutar + " TL");
				}else {
					System.out.println("Hatalı veri girdiniz.");
				}
		}
		
		if(yas > 65) {
			yasİndirimi = normalTutar * 0.30;
			indirimliTutar = normalTutar - yasİndirimi; 
					
			if(tip == 2) {
				biletİndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - biletİndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL");
			}
			else if(tip == 1) {
				System.out.println("Toplam tutar : " + indirimliTutar + " TL");
			}else {
				System.out.println("Hatalı veri girdiniz.");
			}
				
		}
		
	}

}
