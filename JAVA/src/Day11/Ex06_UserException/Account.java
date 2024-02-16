package Day11.Ex06_UserException;

public class Account {
	private long balance;		// 예금 잔액
	public Account(){
		
	}
	
	// getter
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceException {		// 예외 전가
		// 잔소 < 출금액 X
		if(balance < money) {
			// 예외 강제 발생
			// throw new ??Exception();
			throw new BalanceException("잔고가 부족합니다. "+(money-balance)+"원이 부족합니다");
		}
		balance -= money;
	}
}