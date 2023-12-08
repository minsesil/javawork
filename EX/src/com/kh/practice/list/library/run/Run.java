package com.kh.practice.list.library.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		/*
		BookMenu bMenu = new BookMenu();
		bMenu.mainMenu();
		*/
		//컬렉션 정렬
		/*
		 * - 클래스별로 기본정렬(오름차순정렬):sort
		 * - comparator구현 클래스 작성이 필요
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		
		System.out.println("정렬전"+list);
		
		list.sort(null);
		//Collections.sort(list);	//위와같음
		System.out.println("정렬후 :" + list);
		
		/*
		Comparator<Integer> comp = Collections.reverseOrder();
		list.sort(comp);
		*/
		
		list.sort(Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 :" + list);
		
		List<String> strList = new ArrayList<String>();
		strList.add("이길동");
		strList.add("홍길동");
		strList.add("김길동");
		strList.add("박길동");
		strList.add("남이길동");
		
		System.out.println("정렬전:"+strList);
		
		strList.sort(null);
		System.out.println("정렬후:"+strList);
		
		
		
	
	}

}
