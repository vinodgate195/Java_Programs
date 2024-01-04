package JavaConcept;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
		int a=10/0;
		}
		catch(NullPointerException y)
		{
			System.out.println("entered nullpointer block");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("entered in catch block");
		}
		
		
		
		
		
		
	}

}
