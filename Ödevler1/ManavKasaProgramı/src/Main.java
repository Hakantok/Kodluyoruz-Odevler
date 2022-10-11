import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlýcan = 5.00,
				armutKg, elmaKg, domatesKg, muzKg, patlýcanKg, toplam = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut kaç kilo? : ");
		armutKg = input.nextDouble();
		System.out.print("Elma kaç kilo? : ");
		elmaKg = input.nextDouble();
		System.out.print("Domates kaç kilo? : ");
		domatesKg = input.nextDouble();
		System.out.print("Muz kaç kilo? : ");
		muzKg = input.nextDouble();
		System.out.print("Patlýcan kaç kilo? : ");
		patlýcanKg = input.nextDouble();
		
		toplam = ((armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlýcan * patlýcanKg));
		System.out.print("Toplam Tutar : " + toplam);

	}

}
