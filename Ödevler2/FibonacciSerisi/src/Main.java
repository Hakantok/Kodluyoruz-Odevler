import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci serisinin eleman sayýsýný giriniz : ");
		int n = input.nextInt();
		
		int k=1, a=0;
		int toplam = 0;
		
		for(int i=0; i < n-1; i++) {
			toplam = a + k;
			System.out.println(a+"+"+k+"="+toplam);
			a = k;
			k = toplam;
			
		}
		

	}

}
