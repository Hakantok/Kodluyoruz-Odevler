import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yas, tip;
		double  mesafe, yas�ndirimi, indirimliTutar, bilet�ndirimi,
				toplamTutar = 0, normalTutar = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Mesafeyi km t�r�nden giriniz : ");
		mesafe = input.nextInt();
		System.out.print("Ya��n�z� giriniz : ");
		yas = input.nextInt();
		System.out.print("Yolculuk tipini giriniz :\n1=> Tek Y�n\n2=> Gidi� D�n�� : ");
		tip = input.nextInt();
		
		normalTutar = mesafe * 0.10;
		
		if(yas > 0 && yas < 12) {
			yas�ndirimi = normalTutar * 0.50;
			indirimliTutar = normalTutar - yas�ndirimi; 
					
			if(tip == 2) {
				bilet�ndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - bilet�ndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL");
			}
			else if (tip == 1) {
				System.out.println("Toplam tutar : " + indirimliTutar + " TL");
			}else {
				System.out.println("Hatal� veri girdiniz.");
			}
				
		}
		
		if(yas >= 12 && yas <=24) {
			yas�ndirimi = normalTutar * 0.10;
			indirimliTutar = normalTutar - yas�ndirimi; 
					
			if(tip == 2) {
				bilet�ndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - bilet�ndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL");
			}
			else if(tip == 1) {
				System.out.println("Toplam tutar : " + indirimliTutar + " TL");
			}else {
				System.out.println("Hatal� veri girdiniz.");
			}
				
		}
		
		if(yas > 24 && yas <=65) { 	
				if(tip == 2) {
					bilet�ndirimi = normalTutar * 0.20;
					toplamTutar = ( normalTutar - bilet�ndirimi);
					System.out.println("Toplam tutar : " + toplamTutar + " TL");
				}
				else if(tip == 1) {
					System.out.println("Toplam tutar : " + normalTutar + " TL");
				}else {
					System.out.println("Hatal� veri girdiniz.");
				}
		}
		
		if(yas > 65) {
			yas�ndirimi = normalTutar * 0.30;
			indirimliTutar = normalTutar - yas�ndirimi; 
					
			if(tip == 2) {
				bilet�ndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - bilet�ndirimi) * 2;
				System.out.println("Toplam tutar : " + toplamTutar + " TL");
			}
			else if(tip == 1) {
				System.out.println("Toplam tutar : " + indirimliTutar + " TL");
			}else {
				System.out.println("Hatal� veri girdiniz.");
			}
				
		}
		
	}

}
