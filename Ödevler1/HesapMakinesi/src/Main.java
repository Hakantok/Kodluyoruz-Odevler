import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1,n2,select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk Sayýyý Giriniz : ");
		n1 = input.nextInt();
		System.out.print("Ýkinci Sayýyý Giriniz : ");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz : ");
		select = input.nextInt();
		
		switch(select){
			
			case 1:
				System.out.println("Toplama Sonucu : " + (n1+n2));
				break;
			case 2:
				System.out.println("Çýkarma Sonucu : " + (n1-n2));
				break;
			case 3:
				System.out.println("Çarpma Sonucu : " + (n1*n2));
				break;
			case 4:
				System.out.println("Bölme Sonucu : " + (n1/n2));
				break;
			default:
				System.out.println("Yanlýþ iþlem seçtiniz.");
				
		}

	}

}
