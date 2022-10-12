
public class Course {

	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int varbelNote;
	
	Course(String name, String code, String prefix){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int varbelNote = 0;
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		}else {
			System.out.println("Öðretmen ve Ders bölümleri uyuþmuyor!");
		}
	}
	
	void printTeacher() {
		this.teacher.print();
	}
}
