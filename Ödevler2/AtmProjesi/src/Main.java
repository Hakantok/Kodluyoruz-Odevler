import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName, password;
		Scanner input = new Scanner(System.in);
		
		int balance = 1500;
		int right = 3;
		
		while(right > 0) {
			
			System.out.print("Kullanýcý adýnýzý giriniz : ");
			userName = input.nextLine();
			System.out.print("Sifrenizi giriniz : ");
			password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("dev123")) {
			Scanner inp = new Scanner(System.in);
			System.out.println("Merhaba Kodluyoruz Bankasýna hoþ geldiniz!");
			System.out.print("1- Para Yatýrma\n" +
							"2- Para Çekme\n" + "3- Bakiye Sorgula\n" + "4- Çýkýþ Yap\n");
			System.out.print("Yapmak istediðiniz iþlemi seçiniz : ");
			int secim = inp.nextInt();
			
			switch(secim) {
				
			case 1:
				System.out.print("Yatýrmak istediðiniz para miktarý : ");
				int inPrice = inp.nextInt();
				balance += inPrice;
				System.out.println("Ýþlem baþarýlý.");
				break;
			case 2:
				System.out.println("Çekmek istediðiniz para miktarý : ");
				int outPrice = inp.nextInt();
				if(outPrice > balance) {
					System.out.println("Bakiye yetersiz.");
				}else {
					balance -= outPrice;
					System.out.println("Ýþlem baþarýlý.");
				}
				break;
			case 3:
				System.out.println("Bakiyeniz : " + balance);
				break;
			case 4:
				System.out.println("Tekrar görüþmek üzere.");
				break;
			default:
				System.out.println("Yanlýþ iþlem seçtiniz !");
			}
			
		}
		else {
			right--;
			System.out.println("Yanlýs kullanýcý adý veya sifre girdiniz !");
		
			}
			
		}
		
		if(right == 0) {
			System.out.println("Hesabýnýz bloke olmuþtur. Banka ile iletiþime geçiniz.");
		}else {
			System.out.println("Kalan hakkýnýz : " + right);
		}

	}
}
