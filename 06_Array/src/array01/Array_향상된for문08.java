package array01;

import java.util.Arrays;

public class Array_향상된for문08 {

	public static void main(String[] args) {
		
		//배열에서만 사용가능
		int num[] = {1,2,3,4,5};
		for(int result : num) {			//향상된for문 : 순서대로 돌때만 사용가능
			System.out.println(result);		
		}
		//
		String name[] = {"홍길동","아무개","이문열"};
		for(String str : name) {
			System.out.println(str);
		}
		//
		System.out.println("-------------------");
		String name2[] = new String[3];
		int index=0;
		for(String str : name) {
			name2[index++]=str;
			System.out.println(name2[index-1]);
		}
		System.out.println(Arrays.toString(name2));	//for문대신 해서 편리
		
	}

}
