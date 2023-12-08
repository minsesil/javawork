package repetitive02;

import java.util.Scanner;

public class Ex_231023_4 {

	public static void main(String[] args) {
/*
 * 4. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다. 
ex.
1이상의 숫자를 입력하세요 : 0
1 이상의 숫자를 입력해주세요.

1이상의 숫자를 입력하세요 : 4			
4 3 2 1
 */
		
		// 1번째 답
		/*
		boolean change = true;
		while(change) {
			System.out.print("두 수를 입력하세요 ex> 56 8 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("0보다 큰 숫자 입력");
				continue;
			}
			
			if(num1 >= num2) {
				for(int i=num2; i<= num1; i++)
					System.out.print(i + ", ");
			} else {
				for(int i=num1; i<= num2; i++)
					System.out.print(i + ", ");
			}
			change = false;
		}
		*/
		// 2번째 답
		boolean change = true;
		while(change) {
			System.out.print("두 수를 입력하세요 ex> 56 8 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			if(num1 == 0 || num2 == 0) {
				System.out.println("0보다 큰 숫자 입력");
				continue;
			}
			// num1은 작은수 num2 큰수 넣고
			if(num1 > num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}

			for(int i=num1; i<=num2; i++)
				System.out.print(i + ", ");

			change = false;
		}
		
		
			
	}

}
