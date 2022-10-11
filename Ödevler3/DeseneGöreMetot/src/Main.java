import java.util.Scanner;

public class Main {

	static void Desen(int n) {

		if( n > 0) {
			System.out.print(n + " ");
			Desen(n-5);
		}
		System.out.print(n + " ");		

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N sayýsý : ");
		int n = input.nextInt();

		Desen(n);

	}

}
