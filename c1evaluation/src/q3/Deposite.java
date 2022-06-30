package q3;

public class Deposite extends Thread {

	int amount;
	Account account;
	
	public Deposite() {
		
	}
	
	public Deposite(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		account.deposit(amount);
	}
}
