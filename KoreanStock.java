package BasicStockTradingAccount;
import java.util.Random;
import java.lang.Math;

public class KoreanStock extends Stock{
	
	KoreanStock(String name,double initValue){
		super.name = name;
		Value = initValue;
	}
	public void updateValue() {
		Random random = new Random();
		int sign = (int)(random.nextInt(2));
		if(sign == 0)
		{
			double factor = (double)(random.nextDouble());
			Value = Value + Value*(-factor*0.15);
			Value = ((int)(Value/50))*50;
		}
		else if(sign == 1)
		{
			double factor = (double)(random.nextDouble());
			Value = Value + Value*(factor*0.15);
			Value = ((int)(Value/50))*50;
		}
	}
	public void showValue() {
		System.out.println(name +": "+ (int)Value +"Won");
	}
}