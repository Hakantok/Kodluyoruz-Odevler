import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double boy,index,kg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen kilonuzu giriniz : ");
		kg = input.nextDouble();
		System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz : ");
		boy = input.nextDouble();
		
		index = kg / (boy*boy);
		
		System.out.print("Vücut kitle indeksiniz : " + index);

	}

}
