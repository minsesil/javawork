package polyEx08;

public class Buyer2 {
	
	//
	int money = 5000;
	int bonusPoint;
		//배열
		Product[] proList = new Product[3];
		int count;
	
	void buy(Product p) {
		
		if(money < p.price) {
			System.out.println("잔액부족으로 물건을 구매할수 없음"); 
			return;
		}	
			money -= p.price;
			bonusPoint += p.bonusPoint;
			
			proList[count++] = p;		//0부터 1씩 증가
			
			System.out.println(p + "구입");
		}
	
	void buyList() {
		//물건 산 총 금액
		//물건 list
		int sum=0;	//지역변수는 항상 초기화
		String list = "";

		//일반for문
		/*
		for(int i=0; i<proList.length; i++) {
			sum += proList[i].price;
			list += proList[i]+",";
		}
		*/

		//향상된 for문(배열이므로)		
		for(Product pro : proList) {
			sum += pro.price;
			//list += pro.toString()+",";
			list += pro + ",";
		}
		
		System.out.println("구입한 물품의 총합계 : " + sum + "만원입니다");
		System.out.println("구입한 물품의 list : " + list);
		
	}
	
}
