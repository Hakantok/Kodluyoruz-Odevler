import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1,n2,select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�lk Say�y� Giriniz : ");
		n1 = input.nextInt();
		System.out.print("�kinci Say�y� Giriniz : ");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.print("Se�iminiz : ");
		select = input.nextInt();
		
		switch(select){
			
			case 1:
				System.out.println("Toplama Sonucu : " + (n1+n2));
				break;
			case 2:
				System.out.println("��karma Sonucu : " + (n1-n2));
				break;
			case 3:
				System.out.println("�arpma Sonucu : " + (n1*n2));
				break;
			case 4:
				System.out.println("B�lme Sonucu : " + (n1/n2));
				break;
			default:
				System.out.println("Yanl�� i�lem se�tiniz.");
				
		}

	}

}
