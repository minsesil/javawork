package abs02;

//추상 클래스
public abstract class Phone {
	
	//필드
	private String owner;

	//생성자
	Phone(String owner){
		this.owner = owner;
	}

	//추상메소드
	public abstract void turnOn();
	public abstract void turnOff();
	
}
