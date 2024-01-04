package Programs;

public class PalindroneString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="viv";
		String b="";
		for(int i=s.length()-1;i>=0;i--)
		{
		   b=b+s.charAt(i);
		}	
		
		System.out.println(b);
		
		if (b.equals(s))
		{
		System.out.println("Given string is palindrone string");
		}
		
		else
		{
			System.out.println("Given string is not palindrone string");
		}		
	}

}
