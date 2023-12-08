package polyEx08;

public class Buyer {
	
	//
	int money = 5000;
	int bonusPoint;

	void buy(Product p) {
		
		if(money < p.price) {
			System.out.println("잔액부족으로 물건을 구매할수 없음"); 
			return;
		}	
			money -= p.price;
			bonusPoint += p.bonusPoint;
			
			System.out.println(p + "구입");
		}

	
}
