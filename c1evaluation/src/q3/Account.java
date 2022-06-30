package q3;

public class Account {

	int balance;
	int accountNo;
	
	public void displayBalance() {
		System.out.println("Account"+accountNo+" Balance is: "+balance);
	}
	public void deposit(int amount){
		System.out.println(amount+" is Deposited");
		balance += amount;
		displayBalance();
	}
	public void withdraw(int amount){
		System.out.println(amount+" is withdrawn");
		balance = balance - amount;
		displayBalance();
	}
}
