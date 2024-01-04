package Programs;

public class ReverseEachWordInString {

public static void main(String[] args) {
		
  String s="vinod java learner";
  String a[]=s.split(" ");
 
  
  String revresestring="";	
 
		
	for (String word:a)	
	{
		
    String reverseword="";
		
	for (int i=word.length()-1;i>=0;i--)	
		
	{	
		
		reverseword = reverseword+ word.charAt(i);
	}	
		
	        revresestring= revresestring  + " "+ reverseword;
	}	
		
	        System.out.println(revresestring);
	}

}
