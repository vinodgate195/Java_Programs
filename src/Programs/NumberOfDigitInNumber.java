package Programs;

public class NumberOfDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int a=556778999;
		int i=0;
		while(a>0)
		{	
		a=a/10;
		i++;
		}
		System.out.println(i);
		
	}

}
