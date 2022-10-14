
public class Employee {
	
	String name;
	int salary, workHours, hireYear;
	
	Employee(String name, int salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	int tax(int salary) {
		
		int vergi;
		if(salary > 1000) {
			vergi = (salary * 3) /100;
			return vergi;
		}
		else if(this.salary < 1000 && this.salary > 0) {
			vergi = this.salary;
			return vergi;
		}else {
			return  0;
		}
	}
	
	int bonus(int workHours) {
		
		int hours = 40;
		int bonus = 0;
		
		if( workHours > 40) {
			bonus = ( workHours - hours ) * 30;
			return bonus;
		}else {
			bonus = 0;
			return bonus;
		}
		
	}
	
	int raiseSalary(int hireYear) {
		
		int year = 2021;
		int rightNowYear = year - hireYear;
		int raise = 0;
		
		if(rightNowYear < 10 && rightNowYear > 0) {
			raise = (salary * 5) / 100;
			return raise;
		}
		else if(rightNowYear > 9 && rightNowYear < 20) {
			raise = (salary * 10) / 100;
			return raise;
		}
		else if(rightNowYear > 19) {
			raise = (salary * 15) / 100;
			return raise;
		}
		return 0;
	}
	
	 void toStringValue() {
		
		System.out.println("Ad� : " + this.name);
		System.out.println("Maa�� : " + this.salary);
		System.out.println("�al��ma saati : " + this.workHours);
		System.out.println("��e ba�lang�� y�l� : " + this.hireYear);
		System.out.println("Verdi�i vergi : " + tax(salary));
		System.out.println("Ald��� bonus �cret : " + bonus(workHours));
		System.out.println("Ald��� zam : " + raiseSalary(hireYear));
		
		int sumSalary = this.salary + bonus(workHours) + raiseSalary(hireYear) - tax(salary);
		System.out.println("Toplam maa� : " + sumSalary);
		System.out.println("=================================");
	}
}
