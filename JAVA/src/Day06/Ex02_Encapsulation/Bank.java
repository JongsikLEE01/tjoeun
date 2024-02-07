package Day06.Ex02_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Account account = new Account(0,"국민은행","123456-12-123456","이종식");
		
		//account.deposit(1000); private로 지정했기 때문에 직접 접근 불가
		
		account.setDeposit(10000);
		
		int money = account.getDeposit();
		System.out.println(account);
		System.out.println("예금액 : "+money);
	}
}