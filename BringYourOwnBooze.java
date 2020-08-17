//==============================
//=======Bello Abarchi==========
//=======1/23/2018==============
//=======Beer assignment========
import java.util.*;
public class BringYourOwnBooze {
	public static void main(String[] args) {
		double dailyBeer = 0;// beer
		double Yearconsumption = 0;// over a year
		double calories = 0;// calories in take
		double weight = 0;// weight gained
		double price = 0;// money spent on beer
		Scanner input = new Scanner(System.in);
		// get input form user
		System.out.println("please enter the number of beer you expect to drink daily:\n");
		dailyBeer = input.nextDouble();
		System.out.println("please enter amount of money spent on beer every day:\n");
		price = input.nextDouble();
		Yearconsumption = dailyBeer * 365;
		calories = (dailyBeer * 150) * 365;
		if(dailyBeer > 1) {
			weight = 15 + (30 * dailyBeer);// 15 for the weight and 30 pound extra for each beer exceeding 1
		}else{weight = 15;};
		price = price * 365;
		// display results
		System.out.println("1.The number of beer consumes over a period of 365 days: \n" + Yearconsumption  );
		System.out.println("2.The calories consumed over a year: \n" + calories + " Cal");
		System.out.println("3.Weight gained over a year: \n" + weight + " pounds");
		System.out.println("4.You will spend" + price + " every year");
		
		
	}//end of main
}//end of class
 