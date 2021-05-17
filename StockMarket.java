package BasicStockTradingAccount;

import java.util.*;

public class StockMarket {

	HashMap<String,KoreanStock> Korea = new HashMap<>();
	HashMap<String,AmericanStock> America = new HashMap<>();
	
	StockMarket(){
		set();
	}
	private void set() {
	Korea.put("Samsung",new KoreanStock("Samsung",80000));
	Korea.put("Kakao",new KoreanStock("Kakao",100000));
	Korea.put("SK Hynix",new KoreanStock("SK Hynix",120000));
	Korea.put("Naver",new KoreanStock("Naver",340000));
	Korea.put("Hyundai Motor",new KoreanStock("Hyundai Motor",230000));
	America.put("Amazon",new AmericanStock("Amazon",3200.00));
	America.put("Apple",new AmericanStock("Apple",125.00));
	America.put("Microsoft",new AmericanStock("Microsoft",248.00));
	America.put("Tesla",new AmericanStock("Tesla",580.00));
	America.put("Alphabet Inc.",new AmericanStock("Alphabet Inc.",2275.00));
	}
	public void update() {
		Iterator<String> keys = Korea.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			Korea.get(key).updateValue();
		}
		keys = America.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			America.get(key).updateValue();
		}
	}
	public void show() {
		System.out.println("-----Korean Market-----");
		Iterator<String> keys = Korea.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			Korea.get(key).showValue();
		}
		System.out.println("-----American Market-----");
		keys = America.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			America.get(key).showValue();
		}
	}
}
