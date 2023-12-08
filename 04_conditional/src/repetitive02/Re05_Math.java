package repetitive02;

import java.util.Scanner;

public class Re05_Math {

	public static void main(String[] args) {
		
		// Math(수학에 관련된 클래스)
	    double rand1 = Math.random();		//실수형 : 0~0.999999999
		System.out.println(rand1);

		System.out.println("--------------------");		
		double rand2 = Math.random() * 10;		//0~9.9999999999
		System.out.println(rand2);
		
		//실수를 정수로-int형으로 형변환
		int reRand2 = (int)rand2;		//int형으로 형변환 (소수점이하버림) 0~9
		System.out.println("0~9까지="+reRand2);
		
		//1~10까지의 숫자를 얻고자 한다면
		int re2Rand2 = (int)rand2 + 1;
		System.out.println("1~10"+re2Rand2);

		double rand3 = Math.random() * 100;		//0~99.999999999
		System.out.println("1~10까지="+rand3);

		System.out.println("--------------------");		
		//0~4  (0~4.9999)
		// 0.99999 * 5
		double rand4 = Math.random()*5;
		System.out.println("0~4까지="+rand4);
 
		System.out.println("--------------------");		
		// 주사위의 숫자 맞추기 게임
		//랜덤으로 주사위숫자 만들기
		//사용자로부터 숫자 입력받아서
		//숫자를 맞추면 축하합니다. 맞췄습니다 하고 끝내기
		//못맞췄으면 계속하기
		//랜덤으로 1~6까지 숫자 추출하기
		
		int com = (int)(Math.random() * 6)+1;		//1~6숫자추출
		int user = 0;
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("주사위의 숫자를 맞춰보세요:");
			user = scan.nextInt();
			
			if(com == user)
				System.out.println("축하합니다.맞췄습니다");
			else
				System.out.println("틀렸습니다.다시 넣으세요");
		}while(com != user);
		
		
		
			

		
	}

}
