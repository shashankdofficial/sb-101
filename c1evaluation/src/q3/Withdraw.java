package q3;

public class Withdraw extends Thread {

	int amount;
	Account account;
	
	public Withdraw() {
		
	}
	
	public Withdraw(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		account.withdraw(amount);
	}
}
