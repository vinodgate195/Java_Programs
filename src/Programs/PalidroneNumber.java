package Programs;

public class PalidroneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 int a=121;
	 int   rev=0;
	 int on=a;
		
		while(a!=0)
		
		{
		rev=rev*10+a%10;
		a=a/10;
	
		
		}
		
		System.out.println(rev);
	
	if (on==rev)
	{
		System.out.println("is a palindrone number");
			
	}
	
	else
	{
		System.out.println("is a not palindrone number");
	
	}
		}

	
}
