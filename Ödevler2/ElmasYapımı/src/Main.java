import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak sayýsýný giriniz : ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= (n - i); k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (2*i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int a = 1; a <= n; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(" ");
			}
			for(int c = 1; c <= (2*n - (2*a + 1)) ; c++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
