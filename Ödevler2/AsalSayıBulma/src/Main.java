
public class Main {

	public static void main(String[] args) {
		
		
		for(int i=1; i < 100; i++) {
			int number = 0;
			for(int j=1; j <= i; j++) {
				if(i % j == 0) {
					number++;
				}
			}
			if(number == 2) {
				System.out.print(i +" ");
			}
		}

	}

}
