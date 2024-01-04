package Programs;

import java.util.HashSet;

public class DuplicteINArray {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		boolean flag=false;
		String arr[]={"vinnod","priti","priti","nik","buf","biccf"};
		
		for(int i=0;i<arr.length;i++)
		{
			
		for(int j=i+1;j<arr.length;j++)
		{
			
			if (arr[i]==arr[j])
			
			{	
				System.out.println("Duplicate array:"+arr[i]);
				flag=true;
			}		
		}	
			
			
			
		}
		if (flag==false)
		{
			System.out.println("Duplicate array not present");
		}
			
		   boolean h=false;
		   */
		
		
		
		    boolean flag=false;
		    HashSet hs=new HashSet();
		    String s [] ={"vinod","priti","pravin","Akash"};
		   
		    for(String st:s)
		    {
		    boolean bt=  hs.add(st);
		    if(bt=false)
		    {
		    System.out.println("string is duplicate:"+hs );
		    flag=true;
		    }
		    if(flag=false)
		    {
		    System.out.println("string is not duplicate" );
		    
		    }
		    
		    
		    }
		}
		}
		