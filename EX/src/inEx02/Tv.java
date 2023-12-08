package inEx02;
/*문제
 * TV 공통으로 들어가는 기능
 * 전원켜고 끄기
 * 채널
 * 볼륨
 * 
 * 스마트 TV 기능 (가장상위부모) tv상속
 * 인터넷 기능
 * 넷플릭스
 * 
 * 인공지는 TV 기능 (스마트tv 상속)
 * 내가 좋아하는 장르추천 
 */

//클래스
public class Tv {
	
	//필드
	private String model;
	private int inch;
	private boolean power;
	private int channel;
	private int volume;
	
	public void power(){		//기능
		power = !power;
		if(power) 
			System.out.println("TV를 켬");
		else
			System.out.println("TV를 끔");
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return channel;			
	}
	public void setVolume(int volume) {
		this.volume = volume;					
	}
	public int getVolume() {
		return volume;			
	}
}