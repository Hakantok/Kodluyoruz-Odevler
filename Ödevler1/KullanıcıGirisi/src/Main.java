import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName,password,newPassword;
		int secim;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanýcý Adýnýz : ");
		userName = input.nextLine();
		System.out.print("Þifreniz : ");
		password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriþ Yaptýnýz !");
		}else {
			Scanner input2 = new Scanner(System.in);
			System.out.println("Bilgileriniz Yanlýþ. Yeni þifre Oluþturmak isterseniz 1'e basýnýz. Çýkýþ yapmak isterseniz 0'a basýnýz. !");
			System.out.print("Secim : ");
			secim = input2.nextInt();
			
			if(secim == 1) {
				System.out.print("Lütfen yeni þifrenizi giriniz : ");
				newPassword = input.nextLine();	
				
				if(newPassword == password) {
					System.out.println("Yeni þifreniz eski þifreniz ile ayný olamaz. Lütfen yeni bir þifre belirleyiniz.");
				}else {
					System.out.println("Þifreniz baþarýyla oluþturuldu.");
				}
			}
			
			else if(secim == 0) {
				System.out.println("Baþarýyla çýkýþ yaptýnýz.");
			}
			else {
				System.out.println("Yanlýþ bir seçim yaptýnýz. Lütfen seçiminizi kontrol ediniz.");
			}
		}
		

	}

}
