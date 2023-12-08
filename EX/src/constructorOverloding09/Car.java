package constructorOverloding09;

public class Car {
	
	    //클래스변수
		String company;	//null	
		String model;	//null
		String color;	//null	
		int speed;		//0
		
		// 오버로딩(조건:이름이 같아야함,갯수,자료형이 달라야함)
		// 생성자 오버로딩
		// this() -> 다른생성자호출(매개변수와 자료형이 같은 생성자를 찾아감)
		Car(){
			this("삼성","sm5","흰색");
			System.out.println("매개변수 없는 생성자");
		}
		Car(String company){
			this(company,null,null);
			System.out.println("매개변수 1개인 생성자");
			//this.company = company;
		}
		Car(String company, String model){
			this("삼성","sm5","흰색");
			System.out.println("매개변수 2개인 생성자");
			//this.company = company;
			//this.model = model;
		}
		Car(String company, String model, String color){
			System.out.println("매개변수 3개인 생성자");
			this.company = company;
			this.model = model;
			this.color = color;
		}


}
