package BasicStockTradingAccount;
import java.util.Random;
import java.lang.Math;

public class AmericanStock extends Stock{
	
	AmericanStock(String name,double initValue){
		super.name = name;
		Value = initValue;
	}
	public void updateValue() {
		Random random = new Random();
		int sign = (int)(random.nextInt(2));
		if(sign == 0)
		{
			double factor = (double)(random.nextDouble());
			Value = Value + Value*(-factor*0.5);
			Value = Math.round(Value*100)/100.0;
		}
		else if(sign == 1)
		{
			double factor = (double)(random.nextDouble());
			Value = Value + Value*(factor*0.5);
			Value = Math.round(Value*100)/100.0;
		}
	}
	public void showValue() {
		System.out.println(name + ": $"+ Value);
	}
}