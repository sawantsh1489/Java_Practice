package thirtyDay;


import java.util.Scanner;

public class Day2 {

	 static void solve(double meal_cost, int tip_percent, int tax_percent) {
		 
		 double iMeal=meal_cost;
		 //double tip=tip_percent;
		 //System.out.println(tip);
		 double dtip=iMeal*(tip_percent/100.0);
		 //System.out.println(dtip);
		 double tax=iMeal*(tax_percent/100.0);
		 //System.out.println(tax);
		 double total=iMeal+dtip+tax;
		 //int finalTotal=(int)total;
		 int newTotal=(int) Math.round(total);
		 System.out.println(newTotal);


	    }
	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 //System.out.println(meal_cost);
	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        //System.out.println(tip_percent);

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            //System.out.println(tax_percent);
	        solve(meal_cost, tip_percent, tax_percent);

	        scanner.close();

	}

}

