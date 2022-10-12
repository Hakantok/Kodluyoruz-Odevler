import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int c = 1;
		int d = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin satýr sayýsýný giriniz : ");
		int a = input.nextInt();
		System.out.print("Dizinin sütun sayýsýný giriniz : ");
		int b = input.nextInt();

		int[][] dizi = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("Dizinin " + "[" + i + "]" + "[" + j + "]" + " Elemanýný giriniz : ");
				dizi[i][j] = input.nextInt();
			}
		}
		
		System.out.println("========================");
		System.out.println("Dizi :\n");
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(dizi[i][j] +"   ");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		System.out.println("Dizinin Transpozu :\n");
		
		for(int j = 0 ; j < dizi[0].length;j++){
            for(int i =0  ; i < dizi.length;i++){
                System.out.print(dizi[i][j]+"   ");
            }
            	System.out.println();
        }
		
	}

}
