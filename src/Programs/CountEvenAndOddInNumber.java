package Programs;

public class CountEvenAndOddInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=124434;
		int Evencount=0;
		int Oddcount=0;
		
	while(num>0)
		
	{	
		int rem=num%10;
		if(rem%2==0)
		{
		Evencount++;
		
		}
		else
		{		
			Oddcount++;
		}	
			
		num=num/10;			
	}
	System.out.println(Evencount);
	System.out.println(Oddcount);
	}

	
}
