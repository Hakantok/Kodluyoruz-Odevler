import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int y�l;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Y�l giriniz : ");
		y�l = input.nextInt();
		
		if(y�l % 4 == 0) {
			
			if(y�l % 100 == 0) {
				
				if(y�l % 400 == 0) {
					
					System.out.println(y�l + " bir art�k y�ld�r");
				}
				else {
					System.out.println(y�l + " bir art�k y�l de�ildir");
				}
			}
			else {
				System.out.println(y�l + " bir art�k y�ld�r");
			}
		}
		else {
			System.out.println(y�l + " bir art�k y�l de�ildir");
		}
	
	}

}
