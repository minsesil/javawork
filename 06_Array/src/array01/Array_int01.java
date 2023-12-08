package array01;

public class Array_int01 {

	public static void main(String[] args) {
		//  배열 : 같은 자료형을 연속된 저장공간에 저장함
		//  배열의 길이는 늘리거나 줄일 수 없다
		//  배열의 표시는 대괄호 - int[] 변수명 = new int[갯수]
		// or  				  int 변수명[] = new int[갯수]
		
	
		// 저장공간을 확보만하고 값은 나중에 넣을때 (좀더 여유있게 만들덧)
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[5];	//[]는 앞뒤로 넣을수있음
		
		// 배열을 만들면서 값을 바로 넣을 때
		int arrayInt3[] = {1,2,3,4,5};
		//		   Index = 0,1,2,3,4     (index번호)
		
		System.out.println(arrayInt3[0]);  //인덱스번호 출력
		System.out.println(arrayInt3[3]);
		System.out.println("--------------------");

		arrayInt3[1] = 20;
		/*
		 * System.out.println(arrayInt3[0]); 
		 * System.out.println(arrayInt3[1]);
		 * System.out.println(arrayInt3[2]); 
		 * System.out.println(arrayInt3[3]);
		 * System.out.println(arrayInt3[4]);
		 */
		System.out.println("--------------------");
		
		//for문으로 돌리기
		for(int i=0; i<=4; i++) {
			
			if(i==4)
				System.out.println(arrayInt3[i]);
			else	
				System.out.println(arrayInt3[i] + ", ");	//가로출력안됨?
			
		}
		
	// {0,2,4,6,8}	
	/*
	 * arrayInt3[0]=0*2=0; 
	 * arrayInt3[1]=1*2=2; 
	 * arrayInt3[2]=2*2=4;
	 * arrayInt3[3]=3*2=6; 
	 * arrayInt3[4]=4*2=8;
	 */		
		System.out.println("\n--------------------");
		
		for(int i=0; i<=4; i++) {
			arrayInt3[i] = i*2;
		}
		for(int i=0; i<=4; i++) {
			
			if(i==4)
				System.out.println(arrayInt3[i]);
			else	
				System.out.println(arrayInt3[i] + ", "); //가로안됨
		}

		System.out.println("\n--------------------");
		
		int int1[] = {3,4,5,6,7,8,9,10,11};	//배열의 길이가 달라져도 고쳐쓰지 않는다
		int int2[] = new int[10];
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int2의 길이 : " + int2.length);
		
		for(int i=0; i < int1.length; i++)
			System.out.println(int1[i]);

		System.out.println("\n--------------------");	

		// 문제1. 길이가 5인 배열에 값을 for문으로 0,3,6,9,12를 넣고 합계를 구하여 출력하기
		// {0,3,6,9,12}	
		/*
		 * arrayInt4[0]=0*3=0; 
		 * arrayInt4[1]=1*3=3; 
		 * arrayInt4[2]=2*3=6;
		 * arrayInt4[3]=3*3=9; 
		 * arrayInt4[4]=4*3=12;
		 */		
			System.out.println("\n--------------------");

			
			/*
			 * int scores = new int[5];
			 * 
			 * 
			 * for(int i=0; i<=4; i++) {
			 * 
			 * if(i==4) System.out.println(arrayInt4[i]); else
			 * System.out.println(arrayInt4[i] + ", "); //가로출력안됨?
			 * 
			 * }
			 */				
		
		
		
		
	}

}
