package interface03;

public class Tv implements RemoteControl{	//inderface상속은 implements

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

System.out.println("현재 tv볼륨 : " + volume);
}


}