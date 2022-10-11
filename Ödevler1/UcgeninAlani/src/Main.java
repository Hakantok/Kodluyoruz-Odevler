import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a,b,c;
		double u,alan,cevre;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.Kenarý Giriniz : ");
		a = input.nextInt();
		System.out.print("2.Kenarý Giriniz : ");
		b = input.nextInt();
		System.out.print("3.Kenarý Giriniz : ");
		c = input.nextInt();
		
		u = (a+b+c) / 2;
		cevre = 2 * u;
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Üçgenin alaný : " + alan);

	}

}
