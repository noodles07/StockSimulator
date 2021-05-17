package BasicStockTradingAccount;

public class AmericanStockAccount extends StockAccount {
	
	public AmericanStockAccount() {
		new StockAccount();
	}
	
	public void exchange(KoreanStockAccount korea, int money) {
		korea.deposit(money * 1000);
		withdraw(money);
	}
	
	public void buyStock(StockMarket stock, String name, int amount) {
		AmericanStock america = stock.America.get(name);
		
		if(!stock.America.containsKey(name)) {
			System.out.println("It is not in our StockMarket. So, You can't buy it.");
			return;
		}
		else if(ownedStocks.containsKey(name)) {
			ownedStocks.put(name, ownedStocks.get(name) + amount);	
		}
		else {
			ownedStocks.put(name, amount);
		}		
		withdraw(america.Value * amount);
	}
	
	public void sellStock(StockMarket stock, String name, int amount) {
		
		int current = ownedStocks.get(name);
		
		if(!ownedStocks.containsKey(name)) {
			System.out.println("You don't have it. So, You can't sell it.");
			return;
		}
		else if(current == amount) {
			ownedStocks.remove(name);
		}
		else {
			ownedStocks.put(name, ownedStocks.get(name) - amount);
		}
		deposit(stock.America.get(name).Value * amount);
	}
	
	public double getDividends(StockMarket stock) {
		double dividends = 0;
		for(String name : ownedStocks.keySet()) {
			dividends += stock.Korea.get(name).Value * 0.005;
		}
		return dividends;
	}
}
