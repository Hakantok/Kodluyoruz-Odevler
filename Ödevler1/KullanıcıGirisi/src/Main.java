import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName,password,newPassword;
		int secim;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullan�c� Ad�n�z : ");
		userName = input.nextLine();
		System.out.print("�ifreniz : ");
		password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giri� Yapt�n�z !");
		}else {
			Scanner input2 = new Scanner(System.in);
			System.out.println("Bilgileriniz Yanl��. Yeni �ifre Olu�turmak isterseniz 1'e bas�n�z. ��k�� yapmak isterseniz 0'a bas�n�z. !");
			System.out.print("Secim : ");
			secim = input2.nextInt();
			
			if(secim == 1) {
				System.out.print("L�tfen yeni �ifrenizi giriniz : ");
				newPassword = input.nextLine();	
				
				if(newPassword == password) {
					System.out.println("Yeni �ifreniz eski �ifreniz ile ayn� olamaz. L�tfen yeni bir �ifre belirleyiniz.");
				}else {
					System.out.println("�ifreniz ba�ar�yla olu�turuldu.");
				}
			}
			
			else if(secim == 0) {
				System.out.println("Ba�ar�yla ��k�� yapt�n�z.");
			}
			else {
				System.out.println("Yanl�� bir se�im yapt�n�z. L�tfen se�iminizi kontrol ediniz.");
			}
		}
		

	}

}
