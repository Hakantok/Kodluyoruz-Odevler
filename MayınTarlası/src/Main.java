import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("May�n Tarlas� Oyununa Ho� Geldiniz.\n");
		System.out.print("May�n Tarlas�n�n sat�r say�s�n� giriniz : ");
		int a = input.nextInt();
		System.out.print("\nMay�n Tarlas�n�n s�tun Say�s�n� giriniz : ");
		int b = input.nextInt();
		
		if(a < 0 || b < 0) {
			System.out.println("\nSat�r ve S�tun say�s� negatif olamaz !");
			
		}
		else {
			MineSweeper mineSweeper = new MineSweeper(a,b);
		mineSweeper.run();
		}

	}

}
