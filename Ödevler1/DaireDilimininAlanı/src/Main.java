import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int r,a;
		double pi = 3.14, diliminAlani;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yar� �ap�n� giriniz : ");
		r = input.nextInt();
		System.out.print("Merkez a��s�n�n �l��s�n� giriniz : ");
		a = input.nextInt();
		
		diliminAlani = (pi * (r * r) * a) / 360;
		System.out.print("Daire Diliminin Alani : " + diliminAlani);

	}

}
