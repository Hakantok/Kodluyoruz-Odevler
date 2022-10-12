
public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "05888999191");
		Teacher t2 = new Teacher("Graham Bell", "FZK", "00000");
		Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");

		Course mat = new Course("Matematik", "101", "TRH");
		mat.addTeacher(t1);

		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);

		Course kimya = new Course("Kimya", "101", "BIO");
		kimya.addTeacher(t3);

		Course fsnot = new Course("Fizik", "101", "FZK");
		Course msnot = new Course("Matematik", "101", "MAT");
		Course ksnot = new Course("Kimya", "101", "KMY");

		Student s1 = new Student("Ýnek Þaban", "123", "4", mat, fizik, kimya, ksnot, fsnot, msnot);
		s1.addBulkExamNote(60, 70, 50, 80, 60, 90);
		s1.isPass();

		Student s2 = new Student("Güdük Necmi", "456", "2211133", mat, fizik, kimya, ksnot, fsnot, msnot);
		s2.addBulkExamNote(100, 50, 40, 90, 90, 80);
		s2.isPass();

		Student s3 = new Student("Hayta Ýsmail", "545", "221121312", mat, fizik, kimya, ksnot, fsnot, msnot);
		s3.addBulkExamNote(50, 20, 40, 70, 60, 100);
		s3.isPass();
	}

}
