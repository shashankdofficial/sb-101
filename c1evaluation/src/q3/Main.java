package q3;

public class Main {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.accountNo = 101;
		a1.balance = 500;
		
		Deposite deposite = new Deposite(a1,500);
		Withdraw withdraw = new Withdraw(a1, 700);
		
		Thread t1 = new Thread(deposite);
		Thread t2 = new Thread(withdraw);
		
		t1.start();
		t2.start();
	}
}
