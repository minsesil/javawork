package objConstructor07;

public class Car {
	
		//필드
		String company = "삼성";
		String model = "ss";
		String color = "힌색";
		int speed = 5;
	
	    //클래스변수
		static String companys;
		static String models;
		static String colors;
		int speeds;
		
		//생성자 - 반환형이 없고 클래스랑 동일이름 넣어준다
		//객체가 생성될때 한번 호출된다
		Car(String company, String model, String color){

			System.out.println("생성자 호출");
			this.company = company;  //지역변수 받은걸 클래스변수에 넣기
			this.model = model;
			this.color = color;
	}

}
