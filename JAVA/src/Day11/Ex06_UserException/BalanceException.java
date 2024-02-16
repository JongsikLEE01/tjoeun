package Day11.Ex06_UserException;
/*
 * 사용자 정의 예외 클래스
 * - public class ??Exception extends Exception{ }
 */
public class BalanceException extends Exception{

	public BalanceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BalanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}