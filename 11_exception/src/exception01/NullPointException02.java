//예외 발생시키기
package exception01;

public class NullPointException02 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
		}catch(Exception e) {
			System.out.println("데이터가 들어있지 않습니다");
			System.out.println("예외메시지:"+e);
		}
		System.out.println("끝까지 실행완료");
	}

}
