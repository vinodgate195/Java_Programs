package Programs;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="vinoooojj";
		
		char[] mm=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
		
			for (int j=i+1;j<s.length();j++)  
			
			{
			
			if( mm[i]==mm[j])
			
			{
				
			System.out.println("duplicate chr is present:"     +   mm[i]);
				
			}	
				
				
			}
			
			
			
			
			
			
			
		}
		//System.out.println("duplicate chr is present:"     +   mm[i]);
	}

}
