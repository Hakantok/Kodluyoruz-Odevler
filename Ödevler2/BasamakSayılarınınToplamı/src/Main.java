import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý giriniz : ");
		int sayi = input.nextInt();
		int tutulanSayý = sayi;
		int deger = 0;
		int toplam = 0;
		
		while(tutulanSayý != 0) {
			deger = tutulanSayý % 10;
			toplam += deger;
			tutulanSayý /= 10;
		}
		System.out.println("Basamak sayýlarýnýn toplamý : " + toplam);
				

	}

}
