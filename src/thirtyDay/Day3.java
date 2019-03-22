package thirtyDay;
import java.util.Scanner;

public class Day3 {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int N = scanner.nextInt();
	     scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	     scanner.close();
	     
	     int div=N%2;
	     if(div==0) {
	    	 if(2<=N&&N<=5){
	    		System.out.println("Not Weird");
	    	
	    	 }
	    	 else if (N>20) {
	    		 System.out.println("Not Weird");
			}
	    	 else {
	    		 System.out.println("Weird");
	    	 }
	     }
	     else {
	    	 System.out.println("Weird");
	     }

	}

}
