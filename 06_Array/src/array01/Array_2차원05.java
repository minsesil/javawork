package array01;

public class Array_2차원05 {

	public static void main(String[] args) {
		
// 2차원 배열
		int iArr[][] = new int [3][5];  //3행 5열
		int [][] score = {{1,2,3,4,5},			//[0]
						  {4,5,6,7,8},			//[1]
		  				  {9,10,11,12,13}};		//[2]

		System.out.println(score[1][2]);		//6	출력    
	    System.out.println(score[2][3]);		//12 출력
	    
	    System.out.println("score의 길이(행길이) : " + score.length);
	    System.out.println("score[0]의 길이(열길이) : " + score[1].length);   //알고싶은 배열을 구한다
	    

	    for (int i=0; i<score.length; i++) {
	    	for(int j=0; j<score[i].length; j++) {
	    		System.out.print(score[i][j] + " ");
	    	}
	    	System.out.println();
	   }

// 예제
/* 3  4  5
 * 6  7  8
 * 9  10 11
 * 12 13 14
 */
	    System.out.println("------------------------");	    
	    int iArr1[][] = new int[4][3];
	    int count = 3;
	    
	    for(int i=0; i<iArr1.length; i++) {
	    	for(int j=0; j<iArr1[i].length; j++) {
	    		iArr1[i][j] = count++;
	    		System.out.print(iArr1[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
// 예제	(다시)    
	    				//{{1,2,3},
	    				// {4,5];
	    				// {6,7,8,9});
	    		        //}
	     int iArr2[][] = new int[3][4];
	    
	     for(int i=0; i<iArr2.length; i++) {
	    	 for(int j=0; j<iArr2[i].length; j++)
	    	 System.out.println(iArr[i][j] + " ");
	     }	     
	     System.out.println();
	    
}
}