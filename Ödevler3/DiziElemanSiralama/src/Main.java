import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int k=1;
		Scanner input = new Scanner(System.in);

		System.out.print("Dizinin boyutu : ");
		int n = input.nextInt();
		int[] numbers = new int[n];

		System.out.println("Dizinin elemanlar�n� giriniz : ");

		for(int i=0; i < numbers.length; i++) {
			System.out.print(k + ". Eleman� : ");
			numbers[i] = input.nextInt();
			k++;
		}
		Arrays.sort(numbers);
		System.out.println("S�ralama : " + Arrays.toString(numbers));

	}

}
