package dateCalendar;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDate03 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();	
		System.out.println(today);	//출력:2023-11-03
		System.out.println(today.getYear()+"년");	//출력:2023년
		System.out.println(today.getMonth());	//월을 영문으로	//출력:NOVEMBER
		System.out.println(today.getMonthValue() + "월");	//출력:11월
		System.out.println(today.getDayOfMonth() + "일");	//출력:3일
		System.out.println("365일중" + today.getDayOfYear() + "일");	//출력:365일중307일
		System.out.println(today.getDayOfWeek());	//출력:FRIDAY
		System.out.println(today.getDayOfWeek().getValue());	//출력:5
		
		System.out.println("이달의마지막일은 " + today.lengthOfMonth());	//출력:이달의마지막일은 30
		System.out.println("올해는 총 " + today.lengthOfYear() + "일"); //출력:올해는 총 365일
		System.out.println("올해는 윤년인가? " + today.isLeapYear());  //출력:올해는 윤년인가? false
		System.out.println("----------------------------------");
		
		LocalDate endDay = LocalDate.of(2024,5,2);
		System.out.println(endDay);		//출력:2024-05-02
		
		Period p = today.until(endDay);
		System.out.println(p.getMonths() + "개월" + p.getDays() + "일 남음");		
		System.out.println("===================================");
				
		//시간만 얻어오기
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println("----------------------------------");
		
		LocalTime time2 = LocalTime.of(9, 30, 20);
		System.out.println(time2);
		
		Duration d = Duration.between(time2,time);					//출력) 09:30:20
		System.out.println(d.getSeconds()/60 + "분이 지남");			//출력) 150분이 지남
		System.out.println("----------------------------------");	
		
		
		//날짜와 시간 모두얻어오기
		LocalDateTime todayNow = LocalDateTime.now();
		System.out.println(todayNow);
		
		//zone, data타입 바꾸기
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/SEOUL"));
		System.out.println(seoulDT);

		ZonedDateTime newYORKDT = ZonedDateTime.now(ZoneId.of("America/NEW_YORK"));
		System.out.println(newYORKDT);
		
	}

}
