import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz : ");
		int sayi = input.nextInt();
		int tutulanSayı = sayi;
		int deger = 0;
		int toplam = 0;
		
		while(tutulanSayı != 0) {
			deger = tutulanSayı % 10;
			toplam += deger;
			tutulanSayı /= 10;
		}
		System.out.println("Basamak sayılarının toplamı : " + toplam);
				

	}

}
