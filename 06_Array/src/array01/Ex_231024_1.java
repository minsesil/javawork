package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_231024_1 {

/* 
1.
사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

ex.
정수 : 5
배열 0번째 인덱스에 넣을 값 : 4
배열 1번째 인덱스에 넣을 값 : -4
배열 2번째 인덱스에 넣을 값 : 3
배열 3번째 인덱스에 넣을 값 : -3
배열 4번째 인덱스에 넣을 값 : 2
4 -4 3 -3 2 
총 합 : 2	
 */
	
	public static void main(String[] args) {

		//int input = 5;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int input = scan.nextInt();
		
		int[] oldScore = {4, -4, 3, -3, 2};
		int[] newScore = new int[5];

		
		System.out.println("0\t1\t2\t3\t4");
		System.out.println("----------------------------------------------");
		
		if (input == 5) {
		System.arraycopy(oldScore, 0, newScore, 0, input);		
		System.out.println(Arrays.toString(newScore));	
		System.out.println("합계"  + oldScore[4]); 	//합계

		}
		
		
			
	}

}
