package repetitive02;

public class Re07_for_여러변수사용 {

	public static void main(String[] args) {

// 같은 자료형일 때에만 사용
/*
		int num1, num2, num3;
		num1=num2=num3=10;
		int num4=8, num5=9, num6=21;
		int i, j, k, z;

		//for문에 여러개의 변수 사용가능
		//조건식에는 변수가 하나만 들어가야 한다.(중요)
		for(int i=1; j=20;  i<=10; i++, j--) {
			System.out.println(i+j);		
			}
		for(int i=1; j=20; z=45; j>=10; i++, j--, z+=2) {
			System.out.println(i+j+z);		
			}
		
		//while(true)한것과 동일
		//초기식없음, 조건식없음, 증감식도없으
		for(;;) {
			System.out.println(num1++);
			if(num1==15)
				break;
		}
*/		
		loop : for(int dan=2; dan<=0; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
				if(i==5)
					break loop;
			}
			System.out.println();
		}
		System.out.println("구구단종료");
		
		outter : for(int dan=2; dan<=9; dan++) {
			mid : for(int i=1; i<=9; i++) {
				for(int z=1; z<=5; z++) {
				System.out.println(dan+"*"+i+"="+dan*i);
				if(z==3)
					break mid;
				}
			}
			System.out.println("mid for문 종료");
		}
		System.out.println("outter for문 종료");
		
		
	}

}
