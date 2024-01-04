package Programs;

public class CountOfCharactersInString {
        
	
	
	
	    public static void main(String[] args) {
		 
        String s="vinod snd sn";
        int count=0;
        for (int i=0;i<s.length();i++)
        {
        if (s.charAt(i)!=' ')
        {
        count ++;
        }
        }
        System.out.println(count);	

			
	}

}
