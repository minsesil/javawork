package interface03;

public class Radio implements RemoteControl{

	private int volume;	//0
	
	@Override
	public void turnOn() {
	System.out.println("볼륨을 켭니다");
	}
	@Override
	public void turnOff() {
	System.out.println("볼륨을 끕니다");
}

	@Override
	public void setVolume(int volume) {   //200
	
	if(volume > RemoteControl.MAX_VOLUME)
		this.volume = RemoteControl.MAX_VOLUME;
		
	else if(volume < RemoteControl.MIN_VOLUME)
		this.volume = RemoteControl.MIN_VOLUME;
	
	else
		this.volume = volume;
	
	System.out.println("현재 Radio 볼륨 : " + volume);
	}

	
	@Override
	public void setMute(boolean mute) {
		System.out.println("재정의한 setMute 메소드");
		if(mute)
			System.out.println("재정의한 무음처리");
		else
			System.out.println("재정의한 무음처리 해제");
	}
	
}