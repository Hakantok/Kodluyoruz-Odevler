import java.util.Scanner;

public class Main {

	static void plus() {

		Scanner input = new Scanner(System.in);
		int number, result = 0, i = 1;
		boolean loop = true;

		while (loop) {
			System.out.print(i++ + ". say� : ");
			number = input.nextInt();
			if (number == 0) {
				break;
			}
			result += number;

			if (i >= 3) {
				loop = false;
			}
			if (loop == false) {
				System.out.print("Toplama yeni bir say� eklemek istiyorsan�z 1'e istemiyorsan�z 0'a bas�n�z : ");
				int value = input.nextInt();
				if (value == 1) {
					loop = true;
				} else {
					System.out.println("Toplam : " + result);
					System.out.println("==============================");
				}

			}
		}
	}

	static void minus() {

		Scanner input = new Scanner(System.in);
		System.out.print("Ka� adet say� gireceksiniz :");
		int counter = input.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". say� :");
			number = input.nextInt();
			if (i == 1) {
				result += number;
				continue;
			} else {
				result -= number;
				System.out.println("Sonuc : " + result);
			}
		}
		System.out.println("==============================");
	}

	static void times() {

		Scanner input = new Scanner(System.in);
		int number, result = 1, i = 1;

		while (true) {
			System.out.print(i++ + ". say� :");
			number = input.nextInt();

			if (number == 1)
				break;

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
			System.out.println("Sonuc : " + result);
		}
	}

	static void divided() {

		Scanner input = new Scanner(System.in);
		System.out.print("Ka� adet say� gireceksiniz :");
		int counter = input.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". say� : ");
			number = input.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("B�leni 0 giremezsiniz.");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Sonu� : " + result);
	}

	static void power() {

		Scanner input = new Scanner(System.in);
		System.out.print("Taban de�eri giriniz :");
		int base = input.nextInt();
		System.out.print("�s de�eri giriniz :");
		int exponent = input.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println("Sonu� : " + result);
		System.out.println("====================================");

	}

	static void factorial() {

		Scanner input = new Scanner(System.in);
		System.out.print("Say� giriniz :");
		int n = input.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println(n + "! = " + result);
		System.out.println("====================================");
	}

	static void mod() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("B�l�nen say�y� giriniz : ");
		int n = input.nextInt();
		System.out.print("B�len say�y� giriniz : ");
		int k = input.nextInt();
		
		int mod = n % k;
		System.out.println("Mod = " + mod);
		System.out.println("=====================================");
	}
	
	static void area() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Dikd�rtgenin k�sa kenar�n� giriniz : ");
		int a = input.nextInt();
		System.out.print("Dikd�rtgenin uzun kenar�n� giriniz : ");
		int b = input.nextInt();
		
		int cevre, alan;
		
		System.out.println("Dikd�rtgenin �evresi : " + ((2*a) + (2*b)));
		System.out.println("Dikd�rtgenin alan� : " + (a*b));
		System.out.println("=====================================");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int select;
		String menu = "1- Toplama i�lemi\n" + "2- ��karma ��lemi\n" + "3- �arpma ��lemi\n" + "4- B�lme ��lemi\n"
				+ "5- �sl� Say� Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikd�rtgen Alan ve �evre Hesab�\n" + "0- ��k�� Yap";
		do {
			System.out.println(menu);
			System.out.print("L�tfen bir i�lem se�iniz : ");
			select = input.nextInt();

			switch (select) {

			case 1:
				plus();
				break;

			case 2:
				minus();
				break;

			case 3:
				times();
				break;

			case 4:
				divided();
				break;

			case 5:
				power();
				break;

			case 6:
				factorial();
				break;

			case 7:
				mod();
				break;

			case 8:
				area();
				break;

			default:
				System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");

			}
		} while (select != 0);
	}

}
