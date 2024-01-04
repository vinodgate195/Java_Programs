package Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Using Algorithm
			int a =21;
        int rev=0;
        while (a!=0)
        {
           rev=rev*10+a%10;  //  2 .
           a=a/10;    //1
          
        }
        System.out.println(rev);
		
		
		
		   /*
		//Using string Buffer

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber");
		int num=sc.nextInt();
		StringBuffer bf=new StringBuffer(String.valueOf(num));
			
		System.out.println("Reversed number:"+ bf.reverse());
		
		
		//Using StrigBuilder
     	int a=40989;
		StringBuilder bd=new StringBuilder();
		StringBuilder bv=bd.append(a);

	System.out.println(	bv.reverse());
		
		*/
		
	}

}
