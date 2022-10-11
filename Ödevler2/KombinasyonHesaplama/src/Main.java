import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, r, kombinasyon, toplamBir = 1, toplamÝki = 1, toplamÜc = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Eleman sayýsýný giriniz : ");
		n = input.nextInt();
		
		System.out.print("Seçim sayýsýný giriniz : ");
		r = input.nextInt();

		
		for(int i = 1; i <= n; i++ ) {
			toplamBir = toplamBir * i;
		}
		for(int j = 1; j <= r; j++) {
			toplamÝki = toplamÝki * j;
		}
		for(int k = 1; k <= n-r; k++) {
			toplamÜc = toplamÜc * k;
		}
		kombinasyon = toplamBir / (toplamÝki * toplamÜc );
		System.out.println("C"+"("+n+","+r+")" + " = " + kombinasyon);
	}

}
