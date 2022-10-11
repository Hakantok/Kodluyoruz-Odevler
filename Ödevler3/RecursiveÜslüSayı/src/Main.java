import java.util.Scanner;

public class Main {
	
	static int üsAlma(int a, int b) {

		if(a == 1 | b == 0)
            return 1;
		
		return üsAlma(a,b-1) * a;

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Taban deðerini giriniz : ");
		int a = input.nextInt();
		System.out.print("Üs deðerini giriniz : ");
		int b = input.nextInt();
		
		System.out.println("Sonuc : " + üsAlma(a,b));
	}

}
