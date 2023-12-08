package exception01;

public class Throws11 {
	//throws는 예외 떠넘기기

	public static void main(String[] args) {
		try {
			change();
		}catch (ClassNotFoundException e) {
		System.out.println("클래스가없음");
		}
	}
	
	public static void change() throws ClassNotFoundException{
		//int num = Integer.parseInt(str);
		Class class01 = Class.forName("java.lang.String2");  //https://docs.oracle.com/en/java/javase/11/docs/api/index.html
	}
	

}
