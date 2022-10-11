import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int k, toplam = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen sayýyý giriniz : ");
		k = input.nextInt();
		
		for(int i = 1; i <= k; i++) {
			if(i % 4 == 0) {
				if(i % 3 == 0) {
					System.out.println(i);
					toplam += i;
					
				}
			}
		}
		System.out.println("Toplam : " + toplam);
	}

}
