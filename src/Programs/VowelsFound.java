package Programs;

public class VowelsFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="vinodgate";
		int count =0;
        int count2 =0;
		
		for (int i=0;i<s.length();i++)
		{
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i' ||s.charAt(i)=='o'|| s.charAt(i)=='u')
					{
		 count ++;
		 
				System.out.println("vowels present " + " "  +   s.charAt(i)+ " at" + i );
				
				
					}
			else
			{
				count2++;
			}
		}
		System.out.println("count of vowels is "+"  "+  count );
		System.out.println("count of sinonoms is "+"  "+  count2 );
	}

}
