package thirtyDay;


public class Calculator {
	int i,j;
	


	public int power(int i,int j) throws Exception {
		
		if(i<0||j<0) {
			throw new Exception("n and p should be non-negative");
			
		}
		this.i=i;
		this.j=j;
		//System.out.println(i);
		//System.out.println(j);
		int pow=1;
		for(int l=0;l<j;l++)
		{
			
			
			pow=pow*i;
			
			//System.out.println(pow);
		}
		
		return pow;
	}
	
	
}
