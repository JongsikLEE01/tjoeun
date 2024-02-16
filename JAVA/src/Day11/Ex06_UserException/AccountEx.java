package Day11.Ex06_UserException;

public class AccountEx {
	public static void main(String[] args) {
		Account acc =new Account();
		
		// 10000 입금
		acc.deposit(10000);
		
		// 20000 출금
		try {
			acc.withdraw(20000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}