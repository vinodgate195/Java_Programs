package Programs;

public class Print1TO100PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		for(int i=1;i<=100;i++)
		{
			int count =0;
		for(int j=2;j<i;j++)
		
		{
		if(i%j==0)
		{
			count++;
			
			
		}
		}
	if (count==0)
		{
			System.out.println(i);
			
	}
		
		}	
		
		}
}
