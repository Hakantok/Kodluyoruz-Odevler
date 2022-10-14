
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
				System.out.println("===== YENÝ ROUND ======");
				if(Start() == 1) {
					this.f2.health = this.f1.hit(f2);
					this.f1.health = this.f2.hit(f1);
				}else {
					this.f1.health = this.f2.hit(f1);
					this.f2.health = this.f1.hit(f2);
				}
				System.out.println(this.f1.name + " Saðlýk : " + this.f1.health);
				System.out.println(this.f2.name + " Saðlýk : " + this.f2.health);
				isWin();
			}
			
		}
		else {
			System.out.println("Sporcularýn sikletleri uymuyor.");
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
			System.out.println(this.f2.name + " kazandý !");
			return true;
		}
		if(this.f2.health == 0) {
			System.out.println(this.f1.name + " kazandý !");
			return true;
		}
		
		return false;
	}
}
