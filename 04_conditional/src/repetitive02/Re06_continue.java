package repetitive02;

public class Re06_continue {

	public static void main(String[] args) {

		// break : 반복문을 빠져나올때
		// continue : continue 하위의 실행문을 실행하지 않고 반목문을 다시실행
		//            ~을 제외할때 많이 사용
		//1~100까지의 숫자중 3의 배수를 제외한 합계 구하기

		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				continue;
			}
			sum += i;			
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계="+sum);
		
// 1~100까지 합
System.out.println("------------------");		
		
int sum100 =0;
int i=1;
while(i<100) {
	sum100 += i;
	i++;	
}
System.out.println(sum100);		
	
//문제1. 1~100까지 3의배수 합
System.out.println("------------------");		

int sum3=0;
for(int i3=1; i3<=100; i3++) {
	if(i3 %3 == 0) {
		//continue;
	}
	sum3 += i3;			
}
System.out.println("1~100까지 3의 배수합=" + sum3);




	}

}
