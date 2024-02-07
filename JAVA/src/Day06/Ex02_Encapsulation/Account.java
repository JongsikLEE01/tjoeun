package Day06.Ex02_Encapsulation;
/*
 * 변수 : 예금주, 잔액, 계좌번호, 은행
 */
public class Account {
	//변수 선언
	private int deposit;
	private String deposotor;
	private String depoNumber;
	private String bank;
	
	// 생성자
	public Account() {
		this(0,"예금주 없음","000000-00-000000","은행 없음");
	}
	public Account(int deposit, String deposotor, String depoNumber, String bank) {
		this.deposit = deposit;
		this.deposotor = deposotor;
		this.depoNumber = depoNumber;
		this.bank = bank;
	}
	
	//getter,setter
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public String getDeposotor() {
		return deposotor;
	}
	public void setDeposotor(String deposotor) {
		this.deposotor = deposotor;
	}
	public String getDepoNumber() {
		return depoNumber;
	}
	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	//tostring
	@Override
	public String toString() {
		return "계좌 [잔액 : " + deposit + ", 은행 : " + deposotor + ", 계좌번호 : " + depoNumber + ", 예금주 : "
				+ bank + "]";
	}
}