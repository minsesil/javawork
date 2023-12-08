package repetitive02;

import java.util.Scanner;

public class Ex_231023_2 {

	public static void main(String[] args) {

		/*		
		2. 사용자로부터 숫자를 양수를 입력받아 1~입력받은 숫자까지 합계 구하기
		    ex)
		    숫자를 입력하세요 : -2
		    양수를 입력하세요
		    숫자를 입력하세요 : 10
		    1~10까지의 합 = 55
		*/
		System.out.println("-------------------------");	
		int user2 = 0;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 : ");
			user2 = scan.nextInt();

			if (user2 < 0)
				System.out.println("양수를 입력하세요");
			else
				int sum2 =0;
				int i=1;
				while(i<10) {
					sum2 += i;
					i++;	

		}
		//while(user2 > 0);

			//int sum10 =0;
			//int i=1;
			//while(i<10) {
			//	sum10 += i;
			//	i++;	
		}
		System.out.println("1~입력받은 숫자까지 합 = " + sum2);	

		
	}

}
