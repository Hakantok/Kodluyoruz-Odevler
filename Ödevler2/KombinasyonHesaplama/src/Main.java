import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, r, kombinasyon, toplamBir = 1, toplam�ki = 1, toplam�c = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Eleman say�s�n� giriniz : ");
		n = input.nextInt();
		
		System.out.print("Se�im say�s�n� giriniz : ");
		r = input.nextInt();

		
		for(int i = 1; i <= n; i++ ) {
			toplamBir = toplamBir * i;
		}
		for(int j = 1; j <= r; j++) {
			toplam�ki = toplam�ki * j;
		}
		for(int k = 1; k <= n-r; k++) {
			toplam�c = toplam�c * k;
		}
		kombinasyon = toplamBir / (toplam�ki * toplam�c );
		System.out.println("C"+"("+n+","+r+")" + " = " + kombinasyon);
	}

}
