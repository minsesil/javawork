package repetitive02;

import java.util.Scanner;

public class Re03_while {

	public static void main(String[] args) {
		
		// for문을 while 문으로
		//int flag = 1;  //초기값
		//while(flag <= 5) {  //조건
		//	System.out.println("flag의 값은 " + flag);
		//	flag++;		//증감식
		//}

		//1~10 합계	
		System.out.println("------------------");	
		
		int sum=0;
		int i=1;
		
		while(i<=100) {
			// sum = sum + i++; (한줄-헤깔릴수있음)
			/*
			 * sum += i; 
			++i;
			*/
			sum += i++;			
		}
		System.out.println("1~10까지의합:" + sum);

		/*
		예제
		1~하나씩 증가하면서 합계를 낸다
		그합이 10이상이 되는순간 while문을 빠져나온다
		합과 어디까지 더했을때 100이 되었는지 그숫자를 출력
		*/
		System.out.println("------------------");			
		int sum2 = 0;
		int i2 = 0 ;
		
		while(sum2 <= 10) {
			sum2 += ++i2;	
			/*i2++;
			sum += i2;*/
		}
		System.out.println("1~" + i2 + "까지의합=" + sum2);

		
		//break : 반복문을 빠져나온다 (for, while, do-while)
		System.out.println("------------------");	
		int count=0;		

		while(true) {
			System.out.println(++count);	
			if(count==3) {
				break;  //반복문빠져나옴
			}			
		}
        //예제
		System.out.println("------------------");	
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("멈추려면 'q'");
			char ch = scan.next().charAt(0);
			
			if(ch=='q')
				break;
		}
		System.out.println("프로그램종료");
		
		//숫자입력
		System.out.println("------------------");			
		while(true) {
			System.out.println("연산할 숫자와 연산자 입력(끝내려면 @를 넣으세요) ex> + 4 9 :");
			char op = scan.next().charAt(0);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if (op == '@')
				break;
			System.out.println(num1 + op + num2 + "=" + (num1+num2));
		}
		System.out.println("프로그램종료");
		
		
	}		
	}


