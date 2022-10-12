
public class Student {

	Course mat;
	Course fizik;
	Course kimya;
	Course ksnot;
	Course fsnot;
	Course msnot;
	String name;
	String classes;
	String stuNo;
	double avarage;
	boolean isPass;

	Student(String name, String classes, String stuNo, Course mat, Course fizik, Course kimya, Course ksnot,
			Course fsnot, Course msnot) {
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		this.ksnot = ksnot;
		this.fsnot = fsnot;
		this.msnot = msnot;
		calcAvarage();
		this.isPass = false;
	}

	public void addBulkExamNote(int note1, int note2, int note3, int fsnot, int ksnot, int msnot) {
		if (note1 >= 0 && note1 <= 100) {
			mat.note = note1;
		}
		if (note2 >= 0 && note2 <= 100) {
			fizik.note = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			kimya.note = note3;
		}
		if (fsnot >= 0 && fsnot <= 100) {
            this.fsnot.varbelNote = fsnot;
        }
        if (ksnot >= 0 && ksnot <= 100) {
            this.ksnot.varbelNote = ksnot;
        }
        if (msnot >= 0 && msnot <= 100) {
            this.msnot.varbelNote = msnot;
        }

	}

	public void isPass() {
		if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.msnot.varbelNote == 0
				|| this.ksnot.varbelNote == 0 || this.fsnot.varbelNote == 0) {
			System.out.println("Notlar tam olarak girilmemiþ");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama : " + this.avarage);
			if (this.isPass) {
				System.out.println("Sýnýfý Geçti. ");
			} else {
				System.out.println("Sýnýfta Kaldý.");
			}
		}
	}

	public void calcAvarage() {
		this.avarage = ((this.fizik.note * 0.80 + this.fsnot.varbelNote * 0.20)
				+ (this.kimya.note * 0.80 + this.ksnot.varbelNote * 0.20)
				+ (this.mat.note * 0.80 + this.msnot.varbelNote * 0.20)) / 3;
	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}

	public void printNote() {
		System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.msnot.varbelNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fsnot.varbelNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.ksnot.varbelNote);
	}

}
