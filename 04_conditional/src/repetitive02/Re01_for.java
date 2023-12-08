package repetitive02;

public class Re01_for {

	public static void main(String[] args) {
		// 반복문 : 원하는 갯수만큼 반복하여 실행하고자 할때
		/*   for (초기식; 조건식; 증감식) {
		         실행문
         }
        */

		int num1 = 1;
		
		for(int i=1; i<=100; i++) {
	 		System.out.println(i + ". 안녕하세요"); 
	 		System.out.println("\t반갑습니다"); 

		}
		
 		System.out.println("------------------");   //2씩증가 (i=i+2)
		
 		for(int i=2; i<=10; i+=2) {                
	 		System.out.println(i + ".번 출력"); 
 		}
 		
 		System.out.println("------------------");   //감소
		
		for(int i=10; i>=1; i--) {                 
	 		System.out.println(i + ". 1씩감소"); 			
		}
		
 		System.out.println("------------------");  //1~10까지의 합 구하기
		
 		int sum = 0;
 		for(int i=1; i<=100; i++) {
 			sum = sum + i;
	 		System.out.println("합계=" + sum); 
 		}
 		System.out.println("1~100까지의 합계=" + sum); //합계만 나오게하기 (for문 끝나고)
 		 		
	}

}