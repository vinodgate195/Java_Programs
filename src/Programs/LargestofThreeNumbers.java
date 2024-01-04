package Programs;

import java.util.Scanner;

public class LargestofThreeNumbers {

public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner (System.in);
System.out.println("ENter 1st number");
int a=sc.nextInt();
		
System.out.println("ENter 2nd number");
int b=sc.nextInt();

System.out.println("ENter 3rd number");
int c=sc.nextInt();
/*if (a>b & a>c)			
		
{
System.out.println(a+": is the largest number");

}
else if(b>a &b>c )
{

	System.out.println(b+":is the largest number");
}

else
{
	System.out.println(c+" :is the largest number");
}
	*/


  int largest1 = a>b?a:b;
  int largest2=c>largest1?c:largest1;
System.out.println(largest2+"is the largest number");

	}

}
