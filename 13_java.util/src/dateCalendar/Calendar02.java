package dateCalendar;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println("현재년도:"+ (today.get(Calendar.YEAR)));	//출력)현재년도:2023
		System.out.println("현재월:"+ (today.get(Calendar.MONTH)+1));	//출력)현재월:11--현재월에 반드시 +1
		System.out.println("현재일:"+ (today.get(Calendar.DATE)));	//출력)현재일:3
		
		//요일 1~7(1:일요일)
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);	//출력:금요일
		switch(week) {
			case 1:
			System.out.println("일요일");
			break;
			case 2:
			System.out.println("월요일");
			break;
			case 3:
			System.out.println("화요일");
			break;
			case 4:
			System.out.println("수요일");
			break;
			case 5:
			System.out.println("목요일");
			break;
			case 6:
			System.out.println("금요일");
			break;
			case 7:
			System.out.println("일요일");
		}
		
		//배열로하면 짧다
		String[] weeks = {"일", "월" ,"화", "수", "목", "금", "토"};
		System.out.println(weeks[today.get(Calendar.DAY_OF_WEEK)-1]+"요일");	//출력:금요일

		//2020년부터 몇년 지났나
		Calendar date = Calendar.getInstance();
		date.set(2020,11,3);
		System.out.println(date.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.YEAR)-date.get(Calendar.YEAR)); //출력:3
		
		//문제:2024년 05월 08일 화요일 10시 30분
		System.out.println((today.get(Calendar.YEAR)+1)+"년"+((today.get(Calendar.MONTH)+1)-6)+"월"+((today.get(Calendar.DATE))+5)+"일");
	}

}
