package abs01;

//import polyEx09.override;

public class Dog extends Pet{	//상속을 Pet으로부터 받음

	//생성자
	Dog(String color){
		super("강아지",color);
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	//추상메소드는반드시 오버라이딩하여 구현해야한다
	//만약 구현냐용이 없으면 빈채로 놔두어도 된다
	
	@Override
	public void pattern() {
	}

	
}
