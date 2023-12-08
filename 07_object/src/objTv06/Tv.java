package objTv06;

public class Tv {
	
	//필드
	String company = "LG";
	String model = "울트라ai";
	int inch = 65;
	int volume;
	int channel = 1;
	boolean power;
	
	//메소드
	void power() {
		power = !power;
		  if(power)
			  System.out.println("TV를 켭니다");
		  else
			  System.out.println("TV를 끕니다");
	}
	
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
