package dateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); //출력:Fri Nov 03 10:17:08 KST 2023

		//포맷을 바꾸고 싶을때
		//MM:월,mm:분
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
		System.out.println(sdf.format(now)); //출력:2023-11-03 10:23:14
		
		//a:오전,오후 hh(소문자):12시간,HH(대문자):24시간
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf2.format(now)); //출력:2023-11-03 10:23:14

		//E:요일
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf3.format(now)); //출력:2023-11-03 10:23:14

		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 E요일");
		System.out.println(sdf4.format(now)); //출력:2023년 11월 03일 10시 40분 29초 금요일
		
		//D : 365일중 몇일째인지
		SimpleDateFormat sdf5 = new SimpleDateFormat("D");
		System.out.println(sdf5.format(now)); //출력:307

		//스트링은 데이타 타입으로 전환해야
		String strDate = "20231103";
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy-MM-dd");

		try {
			   Date strNow = sdf6.parse(strDate);
			   System.out.println(sdf7.format(strNow));  //출력:2023-11-0
		}catch(ParseException e) {
			   e.printStackTrace();
		}


		
		
		
		
	}

}
