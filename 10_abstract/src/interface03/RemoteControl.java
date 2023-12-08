package interface03;

public interface RemoteControl {

	//필드 (인터페이스는 반드시 상수)
	public static final int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn() ;		//interface라 ;로끝나고 body{ } 넣으면 안된다
	//public absstract붙이지 않으면 컴파일시 자동으로 붙인다
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드 : 실행문을 넣을수 있다.
	//재정의를 하지 않으면 실행문이 실행이 되고 재정의하면 재정의한 메소드가 호출
	default void setMute(boolean mute) {
	System.out.println("나중에 추가된 메소드");
		if(mute) {
			System.out.println("무음처리완료");
		}else {
			System.out.println("무음처리해제");
		}
    }
	//static 메소드 : 실행문을 넣을수 있다.
	static void info() {
		System.out.println("static() 메소드 호출가능");
	}
	
	
	
	
}
