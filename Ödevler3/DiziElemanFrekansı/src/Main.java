import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		

		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		int[] repeat = new int[dizi.length];
		
		System.out.println("Dizi : " + Arrays.toString(dizi));
		System.out.println("Tekrar Sayýlarý");
		
		for(int i=0; i < dizi.length; i++) {
			repeat[i] = 1;
		}
		
		for(int i=0; i < dizi.length; i++) {
			for(int j=0; j < dizi.length; j++) {
				if((i != j) && (dizi[i] == dizi[j])) {
					repeat[i]++;
				}
			}
		}
		for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    dizi[j] = 0;
                }
            }
        }
		
		for(int i=0; i < dizi.length; i++) {
			if(repeat[i] >= 1) {
				if(dizi[i] != 0) {
					System.out.println(dizi[i] + " sayisi " + repeat[i] + " kere tekrar edildi");
				}
			}
		}

	}

}
