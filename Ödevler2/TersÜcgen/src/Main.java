import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak sayýsýný giriniz : ");
		int n = input.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k <= ((2*n+1) - (2*i)); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
