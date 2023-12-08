package constructorOverloding09;

public class Tv {

	String company;
	String model;
	int inch;
	int channel=1;
	int volume;
	boolean power;
	
	//생성자호출
	Tv(String company, String model, int inch){
		System.out.println("생성자호출");
		this.company=company;
		this.model=model;
		this.inch=inch;
	}
	
	//메소드(파워)
	void power() {
		power = !power;
		if(power)
			System.out.println("파워온");
		else
			System.out.println("파워오프");
	}
	
	//메소드(채널)
	int channelUp() {
		channel += 2;
		return channel;
	}
	int channelDown() {
		channel -= 2;
		return channel;
	}
			
	int volume(int volume) {
		this.volume = volume;
		return this.volume;
	
	}
	
	
	
	
	
}
