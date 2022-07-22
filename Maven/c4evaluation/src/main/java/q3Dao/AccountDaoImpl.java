package q3Dao;

import com.masai.entity.Account;

import userException.InsufficientBalance;
import userException.InvalidAccount;

public class AccountDaoImpl implements AccountDao {

	@Override
	public void save(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account findById(int id) throws InvalidAccount {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Account account) throws InvalidAccount {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Account account) throws InvalidAccount {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
