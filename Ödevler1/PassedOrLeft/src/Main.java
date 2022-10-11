import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz : ");
		mat = scanner.nextInt();
		
		
		System.out.print("Fizik Notunuz : ");
		fizik = scanner.nextInt();
		
		
		System.out.print("Kimya Notunuz : ");
		kimya = scanner.nextInt();
		
		
		System.out.print("Turkce Notunuz : ");
		turkce = scanner.nextInt();
		
		
		System.out.print("Tarih Notunuz : ");
		tarih = scanner.nextInt();
		
		
		System.out.print("Muzik Notunuz : ");
		muzik = scanner.nextInt();
		
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double ortalama = toplam / 6;
		System.out.println("Ortalamanýz : " + ortalama);
		
		String Mesaj = ortalama > 60 ? "Geçtiniz" : "Kaldýnýz";
		System.out.println(Mesaj);
		
	}

}
