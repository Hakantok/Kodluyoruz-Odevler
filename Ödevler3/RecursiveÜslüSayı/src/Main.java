import java.util.Scanner;

public class Main {
	
	static int �sAlma(int a, int b) {

		if(a == 1 | b == 0)
            return 1;
		
		return �sAlma(a,b-1) * a;

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Taban de�erini giriniz : ");
		int a = input.nextInt();
		System.out.print("�s de�erini giriniz : ");
		int b = input.nextInt();
		
		System.out.println("Sonuc : " + �sAlma(a,b));
	}

}
