package args13;

public class MultiArgsTest {

	public static void main(String[] args) {
		//MultiArgsTest mt = new MultiArgsTest();
		//String str = concatenate("","","");
		String str = concatenate("a","b","c");		//이렇게하면 위처럼 객체생성 안해도됨		
		System.out.println(str);
		
		String strArr[]= {"홍길동","아무개","이순신","kkk","iwoeir"};
		System.out.println(concatenate(strArr));
		System.out.println(con2("-","홍길동","아무개","이순신"));
		System.out.println(con2("/",new String[] {"1","2","3"}));
		System.out.println(con2("",strArr));
		
		//합계 숫자가 몇개가 들어올지모름
		//메소드 호출하여 합계출력
		System.out.println(plus);
		
	}
	
	 //합계를 구하는 메소드 구현
	private static int plus;
	void plus(){
	}
		void plus(int plus){
			this.plus = plus;
		}
	
		
	static String concatenate(String...a) {
		String result = "";
		for(String str : a) {
			result += str + ",";
		}		
		return result;
	}

	static String con2(String delim, String... b) {
		String result = "";
		for(String str : b) {
			result += str + delim;
		}
		return result;
	}

	/*	
	String concatenate(String i, String a, String b, String c) {
		String result = "";
		result = i + a + b + c;
		return result;
	}
*/
	


}