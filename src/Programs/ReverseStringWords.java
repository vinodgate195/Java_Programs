package Programs;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="vinod java learner";
		String a[]=s.split(" ");
		 
		  
		String rev="";	
		 
		
				
			for (int i=a.length-1;i>=0;i--)	
				
			{	
				rev=rev+   a[i] + " ";
				
			}	
				
		System.out.println(rev);
		
		
	
	}

}
