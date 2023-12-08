package conditional01;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

/*
	1. 
	키보드로 정수 두 개를 입력 받아 두 정수 중 작은 값을 시작 값으로 큰 값을 종료 값으로 사용
	작은 값에서 큰 값까지 정수 합계를 구하기
*/
		
	Scanner scan = new Scanner(System.in);
	System.out.println("정수1 입력>");	
	int num1 = scan.nextInt();

	System.out.println("정수2 입력>");
	int num2 = scan.nextInt();
	
	int min = num1 < num2 || num2 < num1 ? min;
	System.out.println(min);
    
    
    
   
	}

}
