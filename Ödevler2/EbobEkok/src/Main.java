import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i = 1, j = 1, ebob = 1, ekok = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayýyý giriniz : ");
		int n1 = input.nextInt();
		System.out.print("Ýkinci sayýyý giriniz : ");
		int n2 = input.nextInt();
		
		while(i <= n1) {
			if(n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
			i++;
		}
		System.out.println("Ebob"+"("+n1+","+n2+"): " + ebob);
		
		while(j <= (n1 * n2)) {
			if(j % n1 == 0 && j % n2 == 0) {
				ekok = j;
				break;
			}
			j++;
		}
		System.out.println("Ekok"+"("+n1+","+n2+"): " + ekok);

	}

}
