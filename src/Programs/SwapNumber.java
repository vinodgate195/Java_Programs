package Programs;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//With using third variable
		int a=55;
		int b=40;
		int c;
		
		c=a;//c=55
		a=b;
		b=c;//b=55
		
		System.out.println(a);
		System.out.println(b);
	
	 //Without using third variable
	  int p=976;
	  int q=786;
		
	  p=p+q;
	  q=p-q;
	  p=p-q;
	  System.out.println("value of p:"+p);
	  System.out.println("value of q:"+q);
		
	}

}
