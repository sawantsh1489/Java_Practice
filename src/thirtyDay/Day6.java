package thirtyDay;

import java.util.Scanner;

public class Day6 {

	
	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		  
		  Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				String nString = sc.nextLine();
				int sLen=nString.length();
				for(int j=0;j<sLen;j+=2) {
					System.out.print(nString.charAt(j));	
				}
				System.out.print("  ");
				for(int j=1;j<sLen;j+=2) {
					System.out.print(nString.charAt(j));	
				}
			}
			
			sc.close();
				
		  
	    }
}
