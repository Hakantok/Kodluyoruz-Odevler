import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	String gamePlace[][];
	String notMinePlace[][];
	Random random = new Random();
	int rowNumber, colNumber, sum = 0;

	public MineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
	}

	public void run() {

		createGamePlace(this.rowNumber, this.colNumber);
		setMine(this.rowNumber, this.colNumber);
		minePlace(this.rowNumber, this.colNumber);

		int sumPlace = rowNumber * colNumber;
		int sumLoop = sumPlace - (sumPlace / 4);

		while (sumLoop > 0) {

			for (int i = 0; i < rowNumber; i++) {
				for (int j = 0; j < colNumber; j++) {
					System.out.print(notMinePlace[i][j] + " ");
				}
				System.out.println();
			}

			Scanner input = new Scanner(System.in);
			System.out.print("Tahmini satir sayisini giriniz : ");
			int row = input.nextInt();
			System.out.print("Tahmini sütun sayisini giriniz : ");
			int col = input.nextInt();

			if (row < 0 && col < 0) {
				System.out.println("Satir ve Sütun sayisi negatif olamaz!");
				break;
			} else {

				if (rowNumber > row && colNumber > col) {
					if (gamePlace[row][col] == "*") {
						System.out.println("Game Over");
						break;
					} else {

						if (row - 1 >= 0 && col - 1 >= 0) {
							if (gamePlace[row - 1][col - 1] == "*")
								sum++;
						}
						if (row - 1 >= 0) {
							if (gamePlace[row - 1][col] == "*")
								sum++;
						}
						if (row - 1 >= 0 && col + 1 < colNumber) {
							if (gamePlace[row - 1][col + 1] == "*")
								sum++;
						}
						if (col - 1 >= 0) {
							if (gamePlace[row][col - 1] == "*")
								sum++;
						}
						if (col + 1 < colNumber) {
							if (gamePlace[row][col + 1] == "*")
								sum++;
						}
						if (row + 1 < rowNumber && col - 1 >= 0) {
							if (gamePlace[row + 1][col - 1] == "*")
								sum++;
						}
						if (row + 1 < rowNumber) {
							if (gamePlace[row + 1][col] == "*")
								sum++;
						}
						if (row + 1 < rowNumber && col + 1 < colNumber) {
							if (gamePlace[row + 1][col + 1] == "*")
								sum++;
						}

						notMinePlace[row][col] = String.valueOf(sum);
					}
				} else {
					System.out.println("\nYanlis satir veya sütun degeri girdiniz !");
					break;
				}

				System.out.println("=============================");
				sum = 0;
				sumLoop--;

				if (sumLoop == 0) {
					System.out.println("Tebrikler oyunu kazandiniz");

					for (int i = 0; i < rowNumber; i++) {
						for (int j = 0; j < colNumber; j++) {
							System.out.print(notMinePlace[i][j] + " ");
						}
						System.out.println();
					}
				}
			}
		}

	}

	public void createGamePlace(int rowNumber, int colNumber) {

		gamePlace = new String[rowNumber][colNumber];
		notMinePlace = new String[rowNumber][colNumber];

		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				gamePlace[i][j] = "-";
				notMinePlace[i][j] = "-";
			}

		}

	}

	public void setMine(int rowNumber, int colNumber) {

		int mineCount = (rowNumber * colNumber) / 4;

		for (int i = 0; i < mineCount; i++) {

			int randomNumberX = (int) (Math.random() * rowNumber);
			int randomNumberY = (int) (Math.random() * colNumber);

			if (gamePlace[randomNumberX][randomNumberY] == "*") {
				mineCount++;
			} else {
				gamePlace[randomNumberX][randomNumberY] = "*";
			}
		}

	}

	public void minePlace(int rowNumber, int colNumber) {

		System.out.println("\nMayinlarin konumu : ");
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print(gamePlace[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===========================");
	}

}
