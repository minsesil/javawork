package overloding08;

public class Arithmetic {
		
		int j=10;

		//5칙연산 메소드 만들기
		int plus(int x, int y) {	//오버로딩원칙 : 이름은 같고 매개변수는 달라야한다
			int re = x+y;
			return re;
		}
		
		void plus(int x) {			
			System.out.println(x + "+10=" + (x+10));
			System.out.println(x + "+" + j + "=" + (x+j));
		}
		
		void plus(double x, double y) {		
			System.out.println("double, double");
			System.out.println(x + "x" + y + "=" + (x+y));
		}

		int minus(int x, int y) {
			return x-y;
		}
		
		int minus(int x) {
			return x-j;
		}	
		
		double multiply(int x, int y) {
			return x*y;
		}
		
		int multiply(int x) {
			return x*j;
		}
			
		double divide(int x, int y) {
			return (double)x/y;
		}
		
		double divide(int x) {
			return (double)x/j;
		}
		
		int remainder(int x, int y) {
			return x%y;
		}
	
	
	

}
