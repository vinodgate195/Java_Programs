package Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using for loop
		String s="Vinnod";
		System.out.println(s.length());
		String s1="ddc";
		
	
		 
		String b="";
		for (int i=s.length()-1;i>=0;i--)
		{
		 b=b+s.charAt(i);
		}	
		 System.out.println(b);
	    }
	   
	
	
	// Using char array
	
	/* String s="vinod";
     String rev="";
     char c[] =s.toCharArray();
     
     for (int i=c.length-1;i>=0;i--)
{
     rev =rev + c[i];

}    
  System.out.println(rev)
	
	*/
	
	
	
	
	
	
		//using string buffer
	/*	String m="gate";
	    StringBuffer bf =new StringBuffer(m);
	    System.out.println(bf.reverse());*/
		}

	
	


