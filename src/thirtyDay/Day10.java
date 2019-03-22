package thirtyDay;


import java.util.Scanner;

public class Day10 {
	
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	 int n = scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         int count=0,t=0;
         while(n>0) {
             int reminder=n%2;
             n=n/2;
             if(reminder==1)
             {count++;
             if(count>=t){
                 t=count;
             }
             }
            else{
                count=0;
            }
             
             
             //System.out.print(reminder);
                                
         }
         //System.out.println("");
         System.out.println(t);

         scanner.close();
    }

}
