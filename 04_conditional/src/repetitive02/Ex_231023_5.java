package repetitive02;

import java.util.Scanner;

public class Ex_231023_5 {

	public static void main(String[] args) {
/*
5. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
ex
첫 번째 숫자 : 9
두 번째 숫자 : 0
1 이상의 숫자를 입력해주세요.

첫 번째 숫자 : 8
두 번째 숫자 : 4 
4, 5, 6, 7, 8, 
*/

Scanner scan = new Scanner(System.in);	
boolean change = true;
while(change) {
	System.out.println("두 수를 입력하세요 ex> 56 8 : ");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	if(num1==0|| num2==0) {
		System.out.println("0보다 큰 숫자입력");
		continue;
	}
	//num1은 작은수 num2 큰수 넣고
	if(num1 < num2) {
	   int tmp = num1;
	   num1 = num2;
	   num2 = tmp;
	}
	
	for(int i=num1; i<=num2; i++)
		System.out.print(i + ",");
	
	System.out.println("num1=" + num1 + ", num2=" + num2);
	change = false;
	
/*
	if (num1 > num2) {
		for(int i=num2; i<=num1; i++);
			System.out.print(i + ",");
	else if(num1 < num2) {
		for(int i=num1; i<=num2; i++)
		System.out.print(i + ",");
			}
	change = false;
	}
}*/


	
	
	}

}
