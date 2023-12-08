package inEx02;

public class TvTest {

	public static void main(String[] args) {
		
		//AI TV 객체생성
		AiTv ai = new AiTv();
		ai.power();	//tv킨다
		ai.setChannel(11);	//11채널
		System.out.println("현재채널:" + ai.getChannel());
		
		System.out.println(ai.internet("java"));

		System.out.println(ai.genre("스릴러"));
		ai.setVolume(17);
		System.out.println("현재몰륨:" + ai.getVolume());
		ai.power();		
		
		
		//polular tv 객체생성
	}

}
