package Programs;

    public class Primenumberfound {

	public static void main(String[] args) {
		

	int a=9;
	int count=0; 
	
		for (int i=2;i<a;i++)
		{
		
		if (a%i==0)
		{
		count++;	
		}
			
		}
		if (count==0)
			
		{
			System.out.println("is prime number");
			
		}	
			
		else
		{
			System.out.println("is not prime number");
		}	
			
		
	
	
	
		
	
	}

}
