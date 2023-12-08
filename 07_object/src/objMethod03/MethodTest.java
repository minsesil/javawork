package objMethod03;

public class MethodTest {

	public static void main(String[] args) {

	//객체생성
		Method m1 = new Method();
		                //클래스이름
		m1.print1();
		int re = m1.print2();
		System.out.println(re);
		
		m1.print3(); //이것도가능
		System.out.println(m1.print3());
		
		boolean re1 = m1.print4();
		System.out.println(re1);
		
		m1.print5(10);
				//인자(매개변수에 넣는값)
		
		int re2 = m1.print6(5);		//15
		System.out.println(re2);
		
		String str = m1.print7(7);
		System.out.println(str);

		System.out.println("--------------------------");		
		
		System.out.println(m1.print8(5,8));
		m1.print9("java", 10);

		m1.print10(13.89, "문자열", true, 4);
		
		
	}

}
