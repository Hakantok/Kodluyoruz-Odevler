
public class Teacher {
	
	String name;
	String mpno;
	String branch;
	
	Teacher(String name, String branch, String mpno){
		this.name = name;
		this.branch = branch;
		this.mpno = mpno;
	}
	
	void print() {
		System.out.println("Ad� : " + this.name);
		System.out.println("Telefonu : " + this.mpno);
		System.out.println("B�l�m� : " + this.branch);
	}
}
