
public class Match {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	void run() {
		if(isCheck()) {
			while(this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("===== YEN� ROUND ======");
				if(Start() == 1) {
					this.f2.health = this.f1.hit(f2);
					this.f1.health = this.f2.hit(f1);
				}else {
					this.f1.health = this.f2.hit(f1);
					this.f2.health = this.f1.hit(f2);
				}
				System.out.println(this.f1.name + " Sa�l�k : " + this.f1.health);
				System.out.println(this.f2.name + " Sa�l�k : " + this.f2.health);
				isWin();
			}
			
		}
		else {
			System.out.println("Sporcular�n sikletleri uymuyor.");
		}
	}
	
	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	
	int Start() {
		
		int randomNumber =(int)Math.random()*2;
		
		return randomNumber;
	}
	
	boolean isWin() {
		if(this.f1.health == 0) {
			System.out.println(this.f2.name + " kazand� !");
			return true;
		}
		if(this.f2.health == 0) {
			System.out.println(this.f1.name + " kazand� !");
			return true;
		}
		
		return false;
	}
}
