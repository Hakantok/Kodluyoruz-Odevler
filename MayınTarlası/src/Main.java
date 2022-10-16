import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Mayýn Tarlasý Oyununa Hoþ Geldiniz.\n");
		System.out.print("Mayýn Tarlasýnýn satýr sayýsýný giriniz : ");
		int a = input.nextInt();
		System.out.print("\nMayýn Tarlasýnýn sütun Sayýsýný giriniz : ");
		int b = input.nextInt();
		
		if(a < 0 || b < 0) {
			System.out.println("\nSatýr ve Sütun sayýsý negatif olamaz !");
			
		}
		else {
			MineSweeper mineSweeper = new MineSweeper(a,b);
		mineSweeper.run();
		}

	}

}
