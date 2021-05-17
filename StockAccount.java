package BasicStockTradingAccount;

import java.util.HashMap;

public class StockAccount extends BankAccount{
	private static double Savings;
	public HashMap<String, Integer> ownedStocks = new HashMap<>();
	
	public StockAccount() {
		Savings = 0;
	}
	
	public void deposit(double money) {
		Savings += money;
	}
	
	public void withdraw(double money) {
		Savings -= money;
	}
	
	public void showStock() {
		for(String name : ownedStocks.keySet()) {
			System.out.println(name + ": " + ownedStocks.get(name));
		}
	}
	
	public void transferToCheck(CheckingAccount check, SavingsAccount savings, double money) {
		savings.Savings -= money;
		check.Savings += money;
	}
	
	public void transferToSaving(CheckingAccount check, SavingsAccount savings, double money) {
		check.Savings -= money;
		savings.Savings += money;
	}
	
	public static double getSavings() {
		return Savings;
	}
}
