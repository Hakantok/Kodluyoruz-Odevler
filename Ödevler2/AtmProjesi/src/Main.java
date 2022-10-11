import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName, password;
		Scanner input = new Scanner(System.in);
		
		int balance = 1500;
		int right = 3;
		
		while(right > 0) {
			
			System.out.print("Kullan�c� ad�n�z� giriniz : ");
			userName = input.nextLine();
			System.out.print("Sifrenizi giriniz : ");
			password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("dev123")) {
			Scanner inp = new Scanner(System.in);
			System.out.println("Merhaba Kodluyoruz Bankas�na ho� geldiniz!");
			System.out.print("1- Para Yat�rma\n" +
							"2- Para �ekme\n" + "3- Bakiye Sorgula\n" + "4- ��k�� Yap\n");
			System.out.print("Yapmak istedi�iniz i�lemi se�iniz : ");
			int secim = inp.nextInt();
			
			switch(secim) {
				
			case 1:
				System.out.print("Yat�rmak istedi�iniz para miktar� : ");
				int inPrice = inp.nextInt();
				balance += inPrice;
				System.out.println("��lem ba�ar�l�.");
				break;
			case 2:
				System.out.println("�ekmek istedi�iniz para miktar� : ");
				int outPrice = inp.nextInt();
				if(outPrice > balance) {
					System.out.println("Bakiye yetersiz.");
				}else {
					balance -= outPrice;
					System.out.println("��lem ba�ar�l�.");
				}
				break;
			case 3:
				System.out.println("Bakiyeniz : " + balance);
				break;
			case 4:
				System.out.println("Tekrar g�r��mek �zere.");
				break;
			default:
				System.out.println("Yanl�� i�lem se�tiniz !");
			}
			
		}
		else {
			right--;
			System.out.println("Yanl�s kullan�c� ad� veya sifre girdiniz !");
		
			}
			
		}
		
		if(right == 0) {
			System.out.println("Hesab�n�z bloke olmu�tur. Banka ile ileti�ime ge�iniz.");
		}else {
			System.out.println("Kalan hakk�n�z : " + right);
		}

	}
}
