package repetitive02;

import java.util.Scanner;

public class Ex_231023 {

	public static void main(String[] args) {
/*
 * 1. 1~100까지 3의 배수의 합 구하기
 */
		int sum3=0;
		for(int i3=1; i3<=100; i3++) {
			if(i3 %3 == 0) {
				//continue;
			}
			sum3 += i3;			
		}
		System.out.println("1~100까지 3의 배수합=" + sum3);
/*		
2. 사용자로부터 숫자를 양수를 입력받아 1~입력받은 숫자까지 합계 구하기
    ex)
    숫자를 입력하세요 : -2
    양수를 입력하세요
    숫자를 입력하세요 : 10
    1~10까지의 합 = 55
*/
System.out.println("-------------------------");	
int user=0;

do {
	Scanner scan = new Scanner(System.in);
	System.out.println("숫자를 입력하세요 : ");
	user = scan.nextInt();

	if (user < 0)
		System.out.println("양수를 입력하세요");
	else
		System.out.println("숫자를 입력하세요:");
}
while(user > 0);

	int sum10 =0;
	int i=1;
	while(i<10) {
		sum10 += i;
		i++;	
}
System.out.println("1부터 10까지이 합 = " + sum10);	

/*
3. 1~100까지 숫자를 맞추기 게임
     랜덤으로 1~100까지의 숫자를 추출하고
     scan으로 사용자로 부터 숫자를 입력받아 숫자 맞추기
    ex)
    랜덤 추출한 숫자 : 5
    숫자를 입력하세요 : 10
    더 작은 숫자를 입력해보세요
    숫자를 입력하세요 : 2
    더 큰숫자를 입력해보세요
    숫자를 입력하세요 : 5
    축하합니다 맞췄습니다 종료
*/
System.out.println("-------------------------");	
int com = (int)(Math.random() * 100)+1;		//1~100숫자추출
int user3 = 0;

do {
	Scanner scan = new Scanner(System.in);
	System.out.print("숫자를 입력하세요:");
	user3 = scan.nextInt();
	
	if(com < user3) 
		System.out.println("더 큰 숫자를 입력해보세요");
	else if (com > user3)
		System.out.println("더 작은 숫자를 입력해보세요");
	else 
	System.out.println("맞췄습니다");
	
}while(com != user);

/*
4. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다. 
ex.
1이상의 숫자를 입력하세요 : 0
1 이상의 숫자를 입력해주세요.

1이상의 숫자를 입력하세요 : 4			
4 3 2 1

5. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
ex
첫 번째 숫자 : 9
두 번째 숫자 : 0
1 이상의 숫자를 입력해주세요.

첫 번째 숫자 : 8
두 번째 숫자 : 4 
4, 5, 6, 7, 8,
 */
		
		
	}

}
