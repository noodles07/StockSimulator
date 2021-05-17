package BasicStockTradingAccount;

public class PersonalAccount {
	KoreanStockAccount Koreanstock = new KoreanStockAccount();
	AmericanStockAccount Americanstock = new AmericanStockAccount();
	CheckingAccount check;
	SavingsAccount savings;
	String name, ID, PW;
	
	public void TotalSavings() {
		System.out.println("Korean savings: " + KoreanStockAccount.getSavings());
		System.out.println("American savings: " + AmericanStockAccount.getSavings());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
