import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patl�can = 5.00,
				armutKg, elmaKg, domatesKg, muzKg, patl�canKg, toplam = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut ka� kilo? : ");
		armutKg = input.nextDouble();
		System.out.print("Elma ka� kilo? : ");
		elmaKg = input.nextDouble();
		System.out.print("Domates ka� kilo? : ");
		domatesKg = input.nextDouble();
		System.out.print("Muz ka� kilo? : ");
		muzKg = input.nextDouble();
		System.out.print("Patl�can ka� kilo? : ");
		patl�canKg = input.nextDouble();
		
		toplam = ((armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patl�can * patl�canKg));
		System.out.print("Toplam Tutar : " + toplam);

	}

}
