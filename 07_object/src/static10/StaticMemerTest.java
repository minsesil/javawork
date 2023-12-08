package static10;

public class StaticMemerTest {
	
	int a; //인스턴스 필드
	static int b; //정적 필드(클래스필드)

	//메소드시작
	public static void main(String[] args) {	//정적메소드,메인은 반환형이 없음
		
		int c;  //지역변수
		System.out.println(b);
		StaticMember.sMe3();
		
		for(int i=0; i<10; i++) {	// i=지역변수
				
		}
		if(2<5) {
			int aaaa = 9;
		}
		
		System.out.println("정적변수(객체생성안함):" + StaticMember.sName);
		StaticMember.sMe3();
		
		
		//객체생성
		StaticMember sm1 = new StaticMember();
		
		System.out.println("인스턴스 변수:" + sm1.num);
		System.out.println("정적 변수:" + sm1.sNum);
		
		sm1.Me1();		//인스턴스메소드 호출
		sm1.sMe3();		//정적메소드 호출

		
		StaticMember sm2 = new StaticMember();
		sm2.sNum = 100;
		
		//클래스를 이용하는 모든 객체들의 공통으로 사용
		System.out.println(StaticMember.sNum); 	//100
		System.out.println(sm1.sNum);			//100
		System.out.println(sm2.sNum);			//100
		System.out.println("========================");
		System.out.println(StaticMemerTest.Method1());	//10
		
	}//정적 main()메소드 끝
	
	static int Method1() {
		return 10;
	}

}





