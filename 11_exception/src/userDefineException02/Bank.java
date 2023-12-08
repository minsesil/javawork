package userDefineException02;

public class Bank {
	
	//잔액필드
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	//메소드 (throws:예외떠넘기기)
	public void withdraw(int money) throws UserException{
		if(balance < money)
			//System.out.println("잔액부족");
			throw new UserException("잔고부족:"+(money-balance)+"원모자람"	);
		else
			balance -= money;
	}
	
	//잔고보는 getter메소드
	public int getBalance() {
		return balance;
	}
	
	

}
