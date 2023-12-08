package userDefineException02;

public class BankTest {

	public static void main(String[] args) {
		
		//객체생성
		Bank bank = new Bank();
		
		bank.deposit(1000);
		System.out.println("현재잔액:"+bank.getBalance());
		
		try {
			bank.withdraw(10000);
			
		}catch (UserException e) {
			System.out.println(e.getMessage());
		}

	}

}
