package thirtyDay;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        int j= scan.nextInt();
	        double e=scan.nextDouble();
	        String q=scan.next();
	        String p=scan.nextLine();
	        String r=q.concat(p);
	        String con=s.concat(r);
	        System.out.println(i+j);
	        System.out.println(e+d);
	        System.out.println(con);

	        /* Declare second integer, double, and String variables. */

	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	        
	        /* Print the sum of both integer variables on a new line. */

	        /* Print the sum of the double variables on a new line. */
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */

	        scan.close();

	}

}
