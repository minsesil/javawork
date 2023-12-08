package objCar05;

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();

		System.out.println("-----Tv정보----");
		System.out.println("회사:"+tv1.company);
		System.out.println("모델:"+tv1.model);
		System.out.println("inch:"+tv1.inch);
		System.out.println("--------------");

		tv1.power();
		System.out.println("현재채널:" + tv1.channelUp());
		System.out.println("현재채널:" + tv1.channelUp());
		System.out.println("현재채널:" + tv1.channelUp());
		System.out.println("현재채널:" + tv1.channelDown());
		
		System.out.println("현재볼륨:" + tv1.volume(13));
		System.out.println("현재볼륨:" + tv1.volume(10));
		
		System.out.println("현재채널:" + tv1.channelUp());
		System.out.println("현재채널:" + tv1.channelDown());
	
		
		

	}

}
