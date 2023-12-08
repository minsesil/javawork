package 접근제한11;

import ex02.Car; 	//다른 패키지에 있는것 사용해서 import함 (Car)

public class 접근제한자Test {

	public static void main(String[] args) {

		접근제한 b1 = new 접근제한();
		/* private로 접근불가
		b1.balance = 100_000_000;
		System.out.println(b1.balance);
		*/
		b1.deposit(50000);
		System.out.println("현재 잔액 : " + b1.getBalance());
		
		b1.withdraw(30000);
		int balance = b1.getBalance();
		System.out.println("현재 잔액 : " + balance);
		

		/*
		다른 패키지에 있는것 사용해보기 Car
		
		Car car = new Car();	//Car눌러서 import하면 상단에 생김
								//car.company; (오류 getter setter하라 누름)
		System.out.println(car.company);		
		car.run();	// 호출2. 에러나지만 실행잘됨
		 */
		
		//호출3
		Car car = new Car();
		
		
	}

}
