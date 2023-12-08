package exception01;

public class Throw10 {
	//throw는 강제로 예외 발생을 시킬때 사용

	public static void main(String[] args) {
		try {
			//int num = 3/0;

			Exception e = new Exception("고의로 예외를 발생시킴");
			throw e;	//throw는 강제로 예외 발생을 시킬때 사용			
		}catch(Exception e) {
			
			e.printStackTrace();  //출력1
			System.out.println(e.getMessage());	 //출력2	
			System.out.println("예외발생");  //출력3
		}

	}

}
