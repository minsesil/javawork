package ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*		
		//1.
		System.out.print("배열의 길이입력 : ");
		int num = sc.nextInt();
		
		int iArr[] = new int[num];
		int sum = 0;
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print("배열[" + i + "] index에 넣을 값 입력 : ");
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		System.out.println(Arrays.toString(iArr));
		System.out.println("총합="+sum);
		 */		
/*
2. 
3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
다시 정수를 받도록 하세요. 

ex.
정수 : 4
다시 입력하세요.
정수 : -6
다시 입력하세요.
정수 : 5
1, 2, 3, 2, 1
*/	

		//풀이1.
		while(true) {
			System.out.print("정수 입력 : ");
			int num2 = sc.nextInt();
			int iArr2[] = new int[num2];  //홀수이면 배열
			
			if(num2 %2 == 1 && num2 >= 3) {
				int count = 1;
				
				for(int i=0; i<num2; i++) {
					if(i < num2/2) 	// 5/2 = [0][1] [2] [3][4]  인덱스번호 딱중간
						 iArr2[i] = count++;		//0부터 시작하면 앞에 ++
					else
						 iArr2[i] = count--;		//카운트 하나 감소
				}
				
			}else{
				 System.out.println("다시 입력하세요");
				 continue;
		    }
		   	System.out.println(Arrays.toString(iArr2));
		   	break;
		}  	
		   	//풀이2		   	
		   	/*
			System.out.print("정수 입력 : ");
			int num2 = sc.nextInt();
			
			if(num2 %2 == 1 || num2 >= 3) {
				int iArr2[] = new int[num2];

				int count = 1;
				
				for(int i=0; i<num2; i++) {
					if(i < num2/2) 	// 5/2 = [0][1] [2] [3][4]  인덱스번호 딱중간
						  iArr2[i] = count++;		//0부터 시작하면 앞에 ++
					else
						  iArr2[i] = count--;		//카운트 하나 감소
				}
			    System.out.println(Arrays.toString(iArr2));
		   } else {
					System.out.println("다시 입력하세요");
					System.out.println("정수입력 :");
		   			num2 = sc.nextInt();
		   	}
		   	 */
		   	
		
/*
3.
사용자가 입력한 값이 배열에 있는지 검색하여
있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

ex.
치킨 이름을 입력하세요 : 양념			
양념치킨 배달 가능

치킨 이름을 입력하세요 : 불닭
불닭치킨은 없는 메뉴입니다.		
*/
		/*		
		String chickens[] = {"후라이드","양념","파닭","간장"};
		System.out.print("치킨 이름을 입력하세요: ");
		String menu = sc.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println(menu + "치킨 배달가능");
		else
			System.out.println(menu + "는 없는메뉴");
		*/

// 4.
/*
ex.
주민등록번호(-포함) : 123456-1234567
123456-1******			

		System.out.print("주민번호 입력(-포함) : ");
		String jumin = sc.next();
		
		char[] origin = new char[jumin.length()]; 	//가로가 붙은건 메소드
		//char[] copy = new char[origin.length];
		
		for(int i=0; i<origin.length; i++) {
			
			if(i<6)
				origin[i] = jumin.charAt(i);
			else
				origin[i]='*';
		}
		System.out.println(origin);
*/
/* 
 4.주민등록번호 성별자리 이후부텨 * 가리고 출력
   단, 원본 배열 값은 변경없이 배열 복사본으로 변경
 */
/*p201 숙제 (다시보기)*/	
		boolean run = true;		
		int studentNum = 0;
		int [] scores = null;
		Scanner scanner = new Scanner(System.in);

		
		while (run) {
			 System.out.println("-----------------------------------------------------");
			 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			 System.out.println("-----------------------------------------------------");
			 System.out.print("선택> ");
			 
			 int selectNo = Integer.parseInt(scanner.nextLine());
		
			if (selectNo==1) {
				System.out.print("학생수 입력:");
				studentNum = sc.nextInt();
				scores = new int[studentNum];			
			}
			else if(selectNo==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = sc.nextInt();
				}
			}else if (selectNo==3) {
				//System.out.println(Arrays.toString(scores));
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			}else if(selectNo==4) {
				int max=0,sum=0;
				//double avg=0;
				for(int i=0; i<scores.length; i++) {
					max = max < scores[i]? scores[i] : max; //3항연산자
					sum += scores[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.printf("평균점수 : %.2f\n",(double)sum / scores.length);
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	}
}
