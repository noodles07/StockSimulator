package BasicStockTradingAccount;

public abstract class BankAccount {
	String name;
	String ID;
	String PW;
	
	public abstract void deposit(double money); 
	public abstract void withdraw(double money);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
