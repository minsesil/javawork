package str01;

public class String_형변환 {

	public static void main(String[] args) {

		// 문자-> 숫자로 형변환

		String str1 = "100";
		
		//int로 고치기 
		//int num1 = (int)str1; //안됨
		int num1 = Integer.parseInt(str1);	//문자가 포함되있으면 안된다
		
		System.out.println(num1+10)	;
		System.out.println(str1+10)	;
		
		//double로 고치기
		double dou1 = Double.parseDouble(str1);
		System.out.println("더블로고치기>"+dou1);

		//숫자 -> 문자로 형변환
		int num2 = 50;
		double dou2 = 78.12;
		
		String str2 = String.valueOf(num2); //어떤형이든 스트링으로변환시 valuof
		String str3 = String.valueOf(dou2);
		System.out.println("숫자를 문자로 고치기>"+ str2 + 90 );
		
		
	
	}

}
