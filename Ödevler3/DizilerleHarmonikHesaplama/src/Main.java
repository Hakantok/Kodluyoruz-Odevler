
public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		double harmonik = 0.0;
		
		for(int i=0; i < numbers.length; i++) {
			
			harmonik += (1.0 / numbers[i]);
		}
		
		System.out.println("Harmonik ortalama : " + (numbers.length / harmonik ));

	}

}
