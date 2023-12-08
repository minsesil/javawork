//finally문
package exception01;

public class Finally08 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			//예외가 발생할수 있는 경우
			System.out.println(3);			
			//int result = 30/0;		
			System.out.println(4);
			return;		//7번출력안됨
		}catch(Exception e) {
			
			//예외가 발생했을때 실행
			System.out.println(5);
		}finally {
			//실행되지 않는경우 없음
			System.out.println(6);
		}
		//try구문안에 return값이 있으면 실행되지 않음
		System.out.println(7);
		
	}

}
