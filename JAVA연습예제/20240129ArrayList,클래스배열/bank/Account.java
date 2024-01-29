package exam.bank;

public class Account {

	// #필드
	private String accountNo;// 계좌번호
	private String owner;// 계좌주
	private int balance;// 예금액

	// #생성자
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}// end of constructor

	// getter / setter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 메소드

	// toString()
	@Override
	public String toString() {
		return "Account [계좌번호=" + accountNo + ", 예금주=" + owner + ", 금액=" + balance + "]";
	}// end of toString()

}// end of class
