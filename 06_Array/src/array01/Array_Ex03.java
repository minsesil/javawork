package array01;

public class Array_Ex03 {

	public static void main(String[] args) {

		//1. 총점, 평균 구하기
		int score[] = {100, 97, 58, 72, 94};

		int sum=0;

		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		System.out.println("합계는?"  + sum); 	//합계구하기

		double avg = (double)sum / score.length;	//평균구하기
		System.out.printf("평균: %.2f" , avg);

		
		//2. 최대값, 최소값 구하기
		int num[] = {65, 26, 59, 98, 3, 73, 16, 84, 36, 8};
		
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min>num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		
		//인덱스번호에 연산도 가능함
		int k=1;
		System.out.println(num[0+k]);
		
		
	}

}
