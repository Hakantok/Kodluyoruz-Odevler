import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.Say�y� giriniz : ");
		a = input.nextInt();
		
		System.out.print("2.Say�y� giriniz : ");
		b = input.nextInt();
		
		System.out.print("3.Say�y� giriniz : ");
		c = input.nextInt();
		
		if((a < b) && ( a < c)) {
			if(b < c) {
				System.out.println("a < b < c");
			}else {
				System.out.println("a < c < b");
			}
		}else if((b < a) && (b < c)) {
			if(a < c) {
				System.out.println("b < a < c");
			}else {
				System.out.println("b < c < a");
			}
		}else if((c < b) && (c < a)) {
			if(b < a) {
				System.out.println("c < b < a");
			}else {
				System.out.println("c < a < b");
			}
		}

	}

}
