import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yýl,kalan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doðum yýlýnýzý giriniz : ");
		yýl = input.nextInt();
		
		kalan = yýl % 12;
		
		switch(kalan) {
			
		case 0:
			System.out.println("Çin zodyaðý burcunuz : At ");
			break;
		case 1:
			System.out.println("Çin zodyaðý burcunuz : Horoz ");
			break;
		case 2:
			System.out.println("Çin zodyaðý burcunuz : Köpek ");
			break;
		case 3:
			System.out.println("Çin zodyaðý burcunuz : Domuz ");
			break;
		case 4:
			System.out.println("Çin zodyaðý burcunuz : Fare ");
			break;
		case 5:
			System.out.println("Çin zodyaðý burcunuz : Öküz ");
			break;
		case 6:
			System.out.println("Çin zodyaðý burcunuz : Kaplan ");
			break;
		case 7:
			System.out.println("Çin zodyaðý burcunuz : Tavþan ");
			break;
		case 8:
			System.out.println("Çin zodyaðý burcunuz : Ejderha ");
			break;
		case 9:
			System.out.println("Çin zodyaðý burcunuz : Yýlan ");
			break;
		case 10:
			System.out.println("Çin zodyaðý burcunuz : At ");
			break;
		case 11:
			System.out.println("Çin zodyaðý burcunuz : Koyun ");
			break;
		}
		

	}

}
