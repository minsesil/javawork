//try catch 문
package exception01;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			//예외가 발생할수 있는 경우
			System.out.println(3);
			int result = 30/0;	//오류 나는 상황			
			System.out.println(4);

		}catch(Exception e) {
			
			//예외가 발생했을때 실행
			System.out.println(5);
		}
		System.out.println(6);
	}

}
