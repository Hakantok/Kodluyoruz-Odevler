import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Say� giriniz : ");
		int sayi = input.nextInt();
		int tutulanSay� = sayi;
		int deger = 0;
		int toplam = 0;
		
		while(tutulanSay� != 0) {
			deger = tutulanSay� % 10;
			toplam += deger;
			tutulanSay� /= 10;
		}
		System.out.println("Basamak say�lar�n�n toplam� : " + toplam);
				

	}

}
