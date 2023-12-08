package objField02;

public class FieldTest {

	public static void main(String[] args) {
		
		//객체 생성
		
		Car car1 = new Car();
		
		String company = car1.company;
		System.out.println("car1 회사명 :" + company);
		
		System.out.println("car1 모델명:" + car1.model);	
		
		car1.model = "SM9";			
		System.out.println("car1 모델명:" + car1.model);	//모델에서 sm9으로 고치기
		
		//car1.MAX_SPEED = 800;		//필드에 final이 붙으면 상수이기에 한번값을 넣으면 고칠수 없다
		
		car1.maxSpeed = 800;		
		System.out.println("------------------------------");
		
		Car car2 = new Car();
		System.out.println("Car2 회사명:" + car2.company);
		System.out.println("Car2 모델명" + car2.model);		//객체에서는 모델명이 바뀌지않음 (자료가 섞이지 않음)
	}

}
