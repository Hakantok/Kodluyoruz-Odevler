import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("S�n�r say�s�n� giriniz : ");
		n = input.nextInt();
		
		System.out.println("D�rd�n katlar� : ");
		for(int i = 1; i < n; i *= 4) {
			
			System.out.println(i);
				
		}
		
		System.out.println("Besin katlar� : ");
		for(int j = 1; j < n; j *= 5) {
			
			System.out.println(j);
		}

	}

}
