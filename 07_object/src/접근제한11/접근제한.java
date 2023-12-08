package 접근제한11;

public class 접근제한 {
	
	//라이브러리
	//필드정의
	//은행에서 입금,출금	

	private int balance;	//아무나 접근할수 없도록
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔액부족");
		}else {
			balance -= money;
		}
	}

	int getBalance() {		//반환형 int
		return balance;
	}
	//getter(변수의 값을 얻어올때)
	//setter(변수에 값을 넣을때)
	
void setBalance(int balance) {
	this.balance = balance;
}
}
