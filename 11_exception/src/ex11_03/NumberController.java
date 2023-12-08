

package ex11_03;

public class NumberController {
	public boolean check(int num1, int num2) throws NumRangeException{
		if(num1<1 || num1>100 || num2<1 || num2>100) {
			throw new NumRangeException("1~100사이의값만입력할수있습니다");
		}
		return num1 % num2 == 0;
	}	
	
}
