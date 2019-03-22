package thirtyDay;

import java.util.*;

public class Day18 {
   // Write your code here.

	LinkedList<Character> queue=new LinkedList<Character>();
	Stack<Character> stacky =new Stack<>();
	
	
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String input = scan.nextLine();
       scan.close();

       // Convert input String to an array of characters:
       char[] s = input.toCharArray();

       // Create a Solution object:
       Day18 p = new Day18();

       // Enqueue/Push all chars to their respective data structures:
       for (char c : s) {
           p.pushCharacter(c);
           p.enqueueCharacter(c);
       }

       // Pop/Dequeue the chars at the head of both data structures and compare them:
       boolean isPalindrome = true;
       for (int i = 0; i < s.length/2; i++) {
           if (p.popCharacter() != p.dequeueCharacter()) {
               isPalindrome = false;                
               break;
           }
       }

       //Finally, print whether string s is palindrome or not.
       System.out.println( "The word, " + input + ", is " 
                          + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
   }

private char dequeueCharacter() {
	// TODO Auto-generated method stub
	System.out.println(queue.pop());
	return queue.remove();
	//return null;
}

private char popCharacter() {
	// TODO Auto-generated method stub
	System.out.println(stacky.pop());
	return stacky.pop();
	
}

private void enqueueCharacter(char c) {
	// TODO Auto-generated method stub
	
	queue.add(c);
	
}

private void pushCharacter(char c) {
	// TODO Auto-generated method stub
	stacky.push(c);
	
	
}
}
