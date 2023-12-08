/*
 * 반복문을 이용한 선택메뉴
 * 1.모든문자를 대문자로 변환
 * 2.문자열에서 문자가 몇번 출현하는지 횟수반환
 * 3.글자변경하기
 * 0.프로그램끝내기
 */

package object01;

import java.util.Scanner;

public class Ex12_제출 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	System.out.println("문자를 입력하세요");
	String str = sc.next();
	
	int num = 0; 

		System.out.print("0~3 사이의 숫자를 입력하세요 > ");
		num = sc.nextInt();
		
		if(num==1) {
			System.out.println("1번");
			String upperCase = str.toUpperCase();
			System.out.println("대문자로변환:"+upperCase);
		}
		else if (num==2) {
			int indexCD = str.indexOf("cd");
			System.out.println("문자가몇번출현?:"+indexCD);
		}
		else if (num==3) {
			System.out.println("글자변경:" + str.replace('a', 'e'));
		}
		else 
			System.out.println("프로그램 종료");	
		
		
	
		
		
	}

}
