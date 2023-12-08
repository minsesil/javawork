package objConstructor07;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv("삼성","파브",75);
		
		System.out.println("회사>" + tv1.company);
		System.out.println("모델명>" + tv1.model);
		System.out.println("인치>" + tv1.inch+"인치");
		System.out.println();
		
		System.out.print("파워>");
		tv1.power();   //void 호출시는 프린트문에 같이쓸수없다
		
		System.out.println("현재채널>" + tv1.channel);
		System.out.println("채널업>" + tv1.channelUp());
		System.out.println("채널다운>" + tv1.channelDown());
		
		
		
	}

}
