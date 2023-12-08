package polyEx08;

import java.util.ArrayList;

public class Buyer3 {
	
	//
	int money = 5000;
	int bonusPoint;
		//배열
		ArrayList<Product> aList = new ArrayList<Product>();
	
	void buy(Product p) {
		
		if(money < p.price) {
			System.out.println("잔액부족으로 물건을 구매할수 없음"); 
			return;
		}	
			money -= p.price;
			bonusPoint += p.bonusPoint;
			aList.add(p);
			
		
			System.out.println(p + "구입");
		}
	//반품
	void refund(Product p) {
		if(aList.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품");
		}	else {
				System.out.println("구입한 상품이 아니라 반품불가");
		}
	}
	
	void buyList() {
		//물건 산 총 금액
		//물건 list
		int sum=0;	//지역변수는 항상 초기화
		String list = "";
		if(aList.isEmpty()) {
			System.out.println("구입한 제품 없습니다");
			return;
		}

		for(int i=0; i<aList.size(); i++) {
			Product p1 = aList.get(i);
			sum += p1.price;
			list += (i==aList.size()-1) ? p1 : p1 + ",";
		}

		
		System.out.println("구입한 물품의 총합계 :" + sum + "만원입니다");
		System.out.println("구입한 물품의 list : " + list);
		
	}
	
}
