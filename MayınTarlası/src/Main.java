import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Mayin Tarlasi Oyununa Ho� Geldiniz.\n");
		System.out.print("Mayin Tarlasinin satir sayisini giriniz : ");
		int a = input.nextInt();
		System.out.print("\nMayin Tarlasinin s�tun sayisini giriniz : ");
		int b = input.nextInt();
		
		if(a < 0 || b < 0) {
			System.out.println("\nSatir ve S�tun sayisi negatif olamaz !");
			
		}
		else {
			MineSweeper mineSweeper = new MineSweeper(a,b);
		mineSweeper.run();
		}

	}

}
