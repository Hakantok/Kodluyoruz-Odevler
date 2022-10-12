import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayıyı giriniz : ");
		int n = input.nextInt();
		
		Integer[] numbers = {15, 12, 788, 1, -1, -788, 2, 0};
		
		int a = numbers.length;
		Integer newNumbers[] = new Integer[a+1];
		
		for(int i=0; i < a;i++) {
			newNumbers[i] = numbers[i];
		}
		
		newNumbers[a] = n;
		
		Arrays.sort(newNumbers);
		System.out.println(Arrays.toString(newNumbers));
		
		int sira = Arrays.asList(newNumbers).indexOf(n);
		
		System.out.println(n + "'den küçük en yakın sayı " + newNumbers[sira-1]);
		System.out.println(n + "'den büyük en yakın sayı " + newNumbers[sira+1]);
		
	}

}
