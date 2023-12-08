package array01;

public class Array_2차원Ex06 {

	public static void main(String[] args) {

	// 2차원 배열에 각 학생(5명)별 점수 입력 - 행
	// 국어, 영어 ,수학 점수- 열
		


System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
System.out.println("----------------------------------------------");

int score[][] = {{95, 100, 78},	
        {68, 57, 100},
        {62, 97, 85},	
        {59, 83, 69},	
        {76, 74, 38}};		
 
    for (int i=0; i<score.length; i++) {   //행
    	System.out.print(i+1 + "\t");	  //번호
   
    	int sum = 0;
    	for(int j=0; j<score[i].length; j++) {  //열
    		sum += score[i][j];
    		System.out.print(score[i][j] + " \t" );  //탭만큼 띄우기
    		
    	}
    	//System.out.print(sum + "\t"); 	//평균은 한번만 실행해야하므로 꼭 이곳에 출력
    	double avg = (double)sum / score[i].length;
    	//System.out.printf("%.1f\n" , avg); 
    	System.out.printf("%d\t%.1f\n" , sum, avg);   	
  }
	System.out.println("=================================================");
// 행 총점
	/*
	score[0][0] +
	score[1][0] +
	score[2][0] +
	score[3][0] +
	score[4][0] = 국어총점
	*/
	int korSum=0;
	int engSum=0;
	int mathSum=0;

	for(int i=0; i<3; i++) {
		System.out.print(i+1 + "\t");	
		korSum += score[i][0];
		engSum += score[i][1];
		mathSum += score[i][2];

		int sum=0;
		for(int j=0; j<score.length; j++) {
			sum += score[j][i];
			//System.out.print(score[j][i] + "\t");			
		}
	double avg = (double)sum / score[i].length;
	System.out.printf("%d\t%.1f\n", sum, avg);
	}
	System.out.println("총점\t" + korSum + "\t"+ engSum + "\t" + mathSum + "\n");
	
	System.out.println("총점\t" + korSum + "\t"+ engSum + "\t" + mathSum + "\n");
	 					//korSum/(double)5, engSum/(double)  //필기
	
	
/*
 * 번호  국어  영어  수학  총점  평균
 * ---------------------------
 * 1 95  100  78 273  83.3
 * 2 95  100  78 273  83.3
 * 3 95  100  78 273  83.3
 * 4 95  100  78 273  83.3
 * 5 95  100  78 273  83.3
 *-----------------------------
 * 총점  479  500  387
 * 평균  95.0 100.078.3
 */

   
    
    
	                 
	}

}
