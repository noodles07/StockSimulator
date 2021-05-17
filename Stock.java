import java.util.Scanner;

abstract class Stock {

	public String name;
	public double Value;
	public abstract void updateValue();
	public abstract void showValue();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockMarket stockmarket = new StockMarket();
		//PersonalAccount personalaccount = new PersonalAccount();
		Scanner scn = new Scanner(System.in);
		int day = 1;
		int query = 0;
		System.out.println("Set your name,ID and Password");
		System.out.print("Name:");
		String strLine = scn.nextLine();
		//strLine = personalaccount.name;
		System.out.print("ID:");
		strLine = scn.nextLine();
		//strLine = personalaccount.ID;
		System.out.print("Password:");
		strLine = scn.nextLine();
		//strLine = personalaccount.PW;
		
		do {
			System.out.println("---It is day " + day +". What would you like to access?---");
			System.out.println("1.Stock Account");
			System.out.println("2.Checking Account");
			System.out.println("3.Saving Account");
			System.out.println("4.Wait a day");
			System.out.println("0.Quit");
			//1 
			//2
			//3
			//4
			day++;
			
		}while(query != 0);
		
	}

}