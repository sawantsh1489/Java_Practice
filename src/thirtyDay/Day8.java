package thirtyDay;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook;
        phoneBook = new HashMap<String, Integer>(); 
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)==false)
            {System.out.println("Not Found");
            }
            else
            System.out.println(s+"="+phoneBook.get(s));
            // Write code here
        }
        in.close();
    }
	
}
