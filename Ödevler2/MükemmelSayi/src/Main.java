import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayý giriniz : ");
		int n = input.nextInt();
		int toplam = 0;
		
		if(n > 0) {
			for(int i=1; i < n; i++) {
				if(n % i == 0) {
					toplam += i;
				}	
			}
			if(toplam == n) {
				System.out.println(n + " Mükemmel sayidir");
			}
			else {
				System.out.println(n + " Mükemmel sayi deðildir");
			}
		}
		else {
			System.out.println("Sayý negatif deðer olamaz.");
		}

	}

}
