import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int month, day;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do�du�unuz ay : ");
		month = input.nextInt();
		
		System.out.print("Do�du�unuz g�n : ");
		day = input.nextInt();
		
		
		if(month >=1 && month <= 12 && day >=1 && day <= 31) {
		
		if (month == 1) {
			if (day >= 1  && day <= 21) {
			System.out.println("O�lak burcusunuz.");
			} else if (day > 21 && day <= 31) {
			System.out.println("Kova burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 2) {
			if (day >= 1  && day <= 19) {
			System.out.println("Kova burcusunuz.");
			} else if (day > 20 && day <= 28) {
			System.out.println("Bal�k burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 3) {
			if (day >= 1  && day <= 20) {
			System.out.println("Bal�k burcusunuz.");
			} else if (day > 20 && day <= 31) {
			System.out.println("Ko� burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 4) {
			if (day >= 1  && day <= 20) {
			System.out.println("Ko� burcusunuz.");
			} else if (day > 20 && day <= 30) {
			System.out.println("Bo�a burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 5) {
			if (day >= 1  && day <= 21) {
			System.out.println("Bo�a burcusunuz.");
			} else if (day > 21 && day <= 31) {
			System.out.println("�kizler burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 6) {
			if (day >= 1  && day <= 22) {
			System.out.println("�kizler burcusunuz.");
			} else if (day > 22 && day <= 31) {
			System.out.println("Yenge� burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 7) {
			if (day >= 1  && day <= 22) {
			System.out.println("Yenge� burcusunuz.");
			} else if (day > 22 && day <= 31) {
			System.out.println("Aslan burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 8) {
			if (day >= 1  && day <= 23) {
			System.out.println("Aslan burcusunuz.");
			} else if (day > 23 && day <= 31) {
			System.out.println("Ba�ak burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 9) {
			if (day >= 1  && day <= 22) {
			System.out.println("Ba�ak burcusunuz.");
			} else if (day > 22 && day <= 30) {
			System.out.println("Terazi burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 10) {
			if (day >= 1  && day <= 22) {
			System.out.println("Terazi burcusunuz.");
			} else if (day > 22 && day <= 31) {
			System.out.println("Akrep burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 11) {
			if (day >= 1  && day <= 21) {
			System.out.println("Akrep burcusunuz.");
			} else if (day > 21 && day <= 30) {
			System.out.println("Yay burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		
		}
		
		if (month == 12) {
			if (day >= 1  && day <= 21) {
			System.out.println("Yay burcusunuz.");
			} else if (day > 21 && day <= 31) {
			System.out.println("O�lak burcusunuz.");
			} else {
			System.out.println("Yanl�� g�n girdiniz. L�tfen kontrol ediniz.");	
			}
		}
		
	  }
		else {
			System.out.println("Yanl�� ay veya g�n girdiniz. L�tfen kontrol ediniz.");
		}

   }

}
