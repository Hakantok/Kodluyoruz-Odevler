import java.util.Scanner;

public class Main {
	
	static String asalSayý(int a, int b) {
		
		if(b == a) {
			return "Asaldýr";
		}
		if(a % b == 0) {
			return "Asal deðildir";
		}
		else {
			return asalSayý(a, b+1);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý giriniz : ");
		int a = input.nextInt();
		
		System.out.println(a + " " + asalSayý(a,2));

	}

}
