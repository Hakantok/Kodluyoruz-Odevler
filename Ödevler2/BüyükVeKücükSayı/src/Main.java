import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ka� tane say� gireceksiniz : ");
		int n = input.nextInt();
		int max=1, min=1;
		
		for(int i=1; i <= n; i++) {
			System.out.print(i +". Say�y� giriniz : ");
			int sayi = input.nextInt();
			
			if(i == 1) {
				max = sayi;
				min = sayi;
			}
			if(sayi > max) {
				max = sayi;
			}
			if(sayi < min) {
				min = sayi;
			}
		}
		System.out.println("En b�y�k sayi : " + max);
		System.out.println("En k���k sayi : " + min);

	}
}
