import java.util.Scanner;

public class Main {
	
	static String asalSay�(int a, int b) {
		
		if(b == a) {
			return "Asald�r";
		}
		if(a % b == 0) {
			return "Asal de�ildir";
		}
		else {
			return asalSay�(a, b+1);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Say� giriniz : ");
		int a = input.nextInt();
		
		System.out.println(a + " " + asalSay�(a,2));

	}

}
