

import java.util.Arrays;
import java.util.Scanner;

public class Ex_231024_2 {

	public static void main(String[] args) {

/*
2. 
3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
다시 정수를 받도록 하세요. 

ex.
정수 : 4
다시 입력하세요.
정수 : -6
다시 입력하세요.
정수 : 5
1, 2, 3, 2, 1		
 */
		//int input = 5;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int input = scan.nextInt();
		
		int[] Score = new int[5];
		
		if (input %2 == 0 || input<0) {
		System.out.println("다시 입력하세요");	
		}
		else {
			//System.arraycopy(Score, 0, Score, 0, input);
		    for (int i=0; i<Score.length; i++) {  
		    	//System.out.print(i+1);
				System.out.printf("%d", i+1);
		    	
		    }
		}
	    
	    
	}

}
