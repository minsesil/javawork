package singleton15;

//싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
//			실행클래스에서 객체를 만들지 못하도록 해야함

class Singleton{		//클래스생성
		//정적 필드
	    private static Singleton singleton = new Singleton();		//객체생성(private-외부에서 접근불가)

		//생성자에 private를 붙여 객체를 생성할수 없게 만든다
		private Singleton()	{}

		//정적 메소드
		static Singleton getInstance2() {
			return singleton;
		}
		
		
		//인스턴스 메소드 : 현재 메소드가 호출되었다는 것은 객체가 이미 생성되었다는 의미
		//Singleton getInstance1() {
		//	Singleton = singleton1;
		//	return singleton2;
		//}		

}

public class SingletonTest15 {

	public static void main(String[] args) {
		//Singleton s1 = new Singleton();	  //불가
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		//객체를 가리키고 있는 주소가 같은가?
		if(sing1 == sing2) {
			System.out.println("같은 객체를 가리키고 있음");
		else
			System.out.println("다른 객체임");
		}
		

	}

}
