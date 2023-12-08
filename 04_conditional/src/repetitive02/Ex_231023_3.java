package repetitive02;

import java.util.Scanner;

public class Ex_231023_3 {

	public static void main(String[] args) {
		/*
		3. 1~100까지 숫자를 맞추기 게임
		     랜덤으로 1~100까지의 숫자를 추출하고
		     scan으로 사용자로 부터 숫자를 입력받아 숫자 맞추기
		    ex)
		    랜덤 추출한 숫자 : 5
		    숫자를 입력하세요 : 10
		    더 작은 숫자를 입력해보세요
		    숫자를 입력하세요 : 2
		    더 큰숫자를 입력해보세요
		    숫자를 입력하세요 : 5
		    축하합니다 맞췄습니다 종료
		*/
		System.out.println("-------------------------");	
		int com = (int)(Math.random() * 100)+1;		//1~100숫자추출
		System.out.println("랜덤숫자:"+com);
		
		int user3 = 0; //지역변수 바깥에서 선언

		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("1~100 사이의 숫자를 입력하세요 > ");
			user3 = scan.nextInt();
			
			if(com < user3) 
				System.out.println("더 작은 숫자를 입력해보세요 > ");
			else if (com > user3)
				System.out.println("더 큰 숫자를 입력해보세요 > ");
			else 
			System.out.println("축하합니다. 맞췄습니다.(종료)");
			
		}while(com != user3);
		
		
		
	}

}
