import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sýnýr sayýsýný giriniz : ");
		n = input.nextInt();
		
		System.out.println("Dördün katlarý : ");
		for(int i = 1; i < n; i *= 4) {
			
			System.out.println(i);
				
		}
		
		System.out.println("Besin katlarý : ");
		for(int j = 1; j < n; j *= 5) {
			
			System.out.println(j);
		}

	}

}
