package objCar05;

public class Tv {
	/* (예제)
	 * 필드
	 * 회사명
	 * 모델
	 * 인치
	 * 볼륨
	 * 채널
	 * 켜고끄기
	 */

	//필드
	String company="LG";
	String model="울트라";
	int inch=75;
	int volume;
	int channel=1;
	boolean power;
	
	//온오프
	
	void power() {
		power = !power;
		if(power)
			System.out.println("TV를 켭니다");
		else
			System.out.println("TV를 끕니다");
	}
	/*
	 * 메소드
	 * tv 키거나 끄기
	 * 채널 올리는 메서드(2채널씩 올리기)매개변수 없음
	 * 문제 선생님꺼 더 참조
	 */
	
	 int channelUp() {
		 channel += 2;
		 return channel;
		 
	 }
	 int channelDown() {
		 channel -= 2;
		 return channel;
	 }
	 int volume(int volume) {
		 this.volume=volume;
		 return this.volume;
	 }
	
	

	
	
	
	
}
