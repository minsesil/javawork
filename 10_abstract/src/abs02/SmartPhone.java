package abs02;

public class SmartPhone extends Phone {	//phone으로부터 상속
	
	//생성자
	SmartPhone(String owner){
		super(owner);
	}
	
	@Override
	public void turnOn() {
		System.out.println("옆으로 밀어 전화를 받습니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("종료를 눌러 전화를 끕니다");
	}
	
	public void search(String search) {
		System.out.println(search+"를 찾았습니다");
	}

}
