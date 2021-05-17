package BasicStockTradingAccount;

public class KoreanStockAccount extends StockAccount{
	
	public KoreanStockAccount() {
		new StockAccount();
	}
	
	public void exchange(AmericanStockAccount american, int money) {
		american.deposit(money * 0.001);
		withdraw(money);
	}
	
	public void buyStock(StockMarket stock, String name, int amount) {
		KoreanStock korea = stock.Korea.get(name);
		
		if(!stock.Korea.containsKey(name)) {
			System.out.println("It is not in our StockMarket. So, You can't buy it.");
			return;
		}
		else if(ownedStocks.containsKey(name)) {
			ownedStocks.put(name, ownedStocks.get(name) + amount);	
		}
		else {
			ownedStocks.put(name, amount);
		}		
		withdraw(korea.Value * amount);
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
		deposit(stock.Korea.get(name).Value * amount);
	}
	
	public double getDividends(StockMarket stock) {
		double dividends = 0;
		for(String name : ownedStocks.keySet()) {
			dividends += stock.Korea.get(name).Value * 0.005;
		}
		return dividends;
	}
}
