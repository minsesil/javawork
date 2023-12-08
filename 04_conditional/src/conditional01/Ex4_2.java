package conditional01;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		/*
		 * 2.
		정수를 하나 입력 받아 그 수가 양수일 때만 입력된 수를 줄 수로 적용하여 아래와 같이 출력
		ex
		정수입력 : 5
		*
		**
		***
		****
		*****

		정수입력 : -5
		양수가 아닙니다    
		 */
			Scanner scan = new Scanner(System.in);	
			System.out.println("정수 입력>");				
			int num = scan.nextInt();
		 
			if (num < 0) {
			    System.out.println("양수가 아닙니다.");				
			}
		
			else {
				int plus = num;			
				for (int i=1; i<plus; i++) {
					System.out.println("*");	
				}
				System.out.println ("*");	
			}

 
	}

}
