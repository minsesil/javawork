package interface03;

public class RemoteTest {

	public static void main(String[] args) {
		//인터페이스는 객체생성을 할수없다.
		//형변환 가능
		RemoteControl rc = null;
		Audio rcAudio = new Audio();
		//0x345 주소
		Tv rcTv = new Tv();
		//0x123
		
		//rc = new Audio();		//0x345
		rc = rcAudio;  			//0x465
		rc.turnOn();
		rc.setVolume(-200);
		rc.turnOff();
		System.out.println();

		//rc.new Tv();
		rc = rcTv;
		rc.turnOn();
		rc.setVolume(400);
		rc.turnOff();
		
		rc = rcAudio;  		//0x345
		//rc = new Audio(); 	//0x897
		
		//익명객체(새로운 클래스 정의)
		Tv tv = new Tv() {
			//인스턴스 변수 사용불가
			int a = 3;
			//새롭게 만든 메소드 사용불가
			void tvShow() {
				System.out.println("익명객체 tvShow()메소드");
			}
			@Override
			 public void turnOn() {
				System.out.println("Tv를 켭니다");
			}			
		};
		
		//인터페이스 익명객체로 생성할수 있다
		//익명객체는 단 한번만 사용할때 만들어 사용
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			 public void turnOn() {
				System.out.println("익명객체에서 라디오를 켬");
			}		
			@Override
			 public void turnOff() {
				System.out.println("익명객체에서 라디오를 끔");
			}		
			@Override
			public void setVolume(int volume) { //지역변수200

			if(volume > RemoteControl.MAX_VOLUME)
				volume = RemoteControl.MAX_VOLUME;
				
			else if(volume < RemoteControl.MIN_VOLUME)
				volume = RemoteControl.MIN_VOLUME;

			else
				volume = volume;

			System.out.println("익명 객체에서 라디오 볼륨 : " + volume);
			}				
			
		};
		rc2.turnOn();
		rc2.setVolume(45);
		rc2.turnOff();
		System.out.println("----------------------------------");
		
		rc.setMute(true);
		System.out.println("----------------------------------");
		
		rc = new Radio();
		rc.turnOn();
		rc.setMute(true);
		RemoteControl.info();
		rc.turnOff();
		
	}

}
