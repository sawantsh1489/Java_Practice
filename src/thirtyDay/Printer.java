package thirtyDay;


class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
	
	public <E> void printArray(E[] generic){
	    for(E element : generic) {
	        System.out.println(element); 
	    }
	}

}