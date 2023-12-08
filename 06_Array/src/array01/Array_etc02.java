package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_etc02 {

	public static void main(String[] args) {
		// 
		char chArr[] = {'a','b','c','d'};
		String strArr[] = {"홍길동","kim","$%^"};
		boolean bArr[] = {true, false, false, true};
		double dArr[] = {3.14, 7.589, 46,789};
		
		String sArr[] = new String[3];
		
		sArr[0] = "아무개";
		sArr[1] = "강남길";
		sArr[2] = "이순남";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i < sArr.length; i++) {
			System.out.print((i+1) + "이름입력:");
			sArr[i] = scan.next();
			/*
			 * String name = scan.next(); sArr[i] = name;
			 */		
		}
		for(int i=0; i < sArr.length; i++) {
			System.out.print(sArr[i] + ", ");
		}		
		System.out.println(Arrays.toString(sArr));		//라이브러리
		
		/*test
		 * System.out.println(Arrays.toString(bArr)); //char값 외 출력 Arrays.toString 사용
		 * System.out.println(chArr); //char일때만 값 출력
		 * int iArr[] = {1,2,3,4}; 
		 * System.out.println(iArr); //주소출력
		 */	
	
	
	
	
	}

}
