import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yıl;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl giriniz : ");
		yıl = input.nextInt();
		
		if(yıl % 4 == 0) {
			
			if(yıl % 100 == 0) {
				
				if(yıl % 400 == 0) {
					
					System.out.println(yıl + " bir artık yıldır");
				}
				else {
					System.out.println(yıl + " bir artık yıl değildir");
				}
			}
			else {
				System.out.println(yıl + " bir artık yıldır");
			}
		}
		else {
			System.out.println(yıl + " bir artık yıl değildir");
		}
	
	}

}
