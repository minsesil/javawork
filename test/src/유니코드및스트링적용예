package object01;

import java.util.Arrays;
import java.util.Scanner;

public class String07 {

	public static void main(String[] args) { 
	/* Hello java 유니코드 - 72,101,108,108,111*/	
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str = new String(bytes);
		System.out.println(str);	//출:Hello Java
		
		String str2 = new String(bytes,6,4);	//객체,시작 index번호,갯수
		System.out.println(str2);	//출:Hello
		
		//한글자출력
		String str3 = "abcdefg";
		char ch = str3.charAt(3);  
		System.out.println(ch);    //출:d
		
		//모두대문자로변환
		String upperCase = str3.toUpperCase();
		System.out.println(upperCase);	//출:ABCDEFG
		
		int indexCD = str3.indexOf("cd");
		int indexD = str3.indexOf('d');
		System.out.println(indexCD);	//출:2
		System.out.println(indexD);		//출:3
		
		String bookName = "자바 프로그램";
		
		//문자,문자열이 시작하는 index번호반환(-1이면 없는글자)
		if(bookName.indexOf("자바")>-1) //문자열("")혹은 문자('')가능
			System.out.println("자바책입니다");
		else
			System.out.println("자바책이 아닙니다");
		
		//concat(String):2개의 문자열연결(자주안쓴다 주로 한줄로씀-배열에서만쓰임,배열은 +로 연결이 안되므로)
	    String str4 = "java";
		String str5 = str4.concat(" program");	//출:java program
		System.out.println(str4 + " program");
		System.out.println(str4+" program");	//굳이위것안쓰고 이것씀
		
		//contains(charSequence s):글자가 포함되어 있으면 true 반환
		//boolean re = str6.contains("java");  //이줄에러왜남?
		//System.out.println(re);
		
		//replace(char old, char newChar):글자를 변경하여 문자열로 변환
		//str5.replace('a', 'e');		//a를 e로 고쳐라
		System.out.println("글씨변경:"+str5.replace('a', 'e'));
		
		//split(String regex):regex를 기준으로 나누어 배열로 반환
		String str7 = "Cat/Dog/Hamster/Bear";
		String[] strArr = str7.split("/");
		System.out.println(Arrays.toString(strArr));	//출:[Cat, Dog, Hamster, Bear]
		System.out.println(strArr[1]);   //출:Dog
		
		String[] strArr2 = str7.split("/",3);  //3개로나눔
		System.out.println("1"+Arrays.toString(strArr2));	//출:[Cat, Dog, Hamster/Bear]
		System.out.println(strArr2[2]);  //출:Dog
		
		//sustring(int index):index를 기준으로 그뒤의 글자를 가져와서 문자열로 반환
		String str8 = "javaOracleSpringBoot";
		System.out.println(str8.substring(4,10));   //index4번부터(0부터시작)9까지 (출력:Oracle)
		System.out.println(str8.substring(4));  //번호하나이면 index번호부터 끝까지(출력:OracleSpringBoot)
		
		/*예제
		 * substring으로 주민번호를 사용자로부터 받기(123456-1234567)
		 * 123456-1****** 출력하기
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함) : ");		
		String jumin = scan.next();
		
		//substring이용
		String front = jumin.substring(0,8);
		System.out.println(jumin.substring(0,8) + "******");
		
		
		//trim() : 공백제거(앞뒤만,중간은안된다)
		String stTrim = "      kim";
		String stTrim2 = "kim      ";	
		System.out.println(stTrim);
		System.out.println(stTrim2 + ";");
		System.out.println("-----------------------");

		//공백제거로한줄
		System.out.println(stTrim.trim());
		System.out.println(stTrim2.trim()+ ";");
		System.out.println("-----------------------");
		
		String stTrim3 = "       kim     ";
		System.out.println(stTrim3 + ";");
		System.out.println(stTrim3.trim() + ";");
		
		String stTrim4 = "     kim    Hong     Lee";
		System.out.println(stTrim4.trim() + ";");
		
	}

}
