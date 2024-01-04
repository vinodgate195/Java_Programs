package Programs;

public class FibnosisSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0,1,1,2,3,5
		int n1=0;
		int n2=1;
		int sum=0;
		
	for (int i=0;i<=5;i++)	
	{	
		sum=n1+n2; //1,2,3,
		System.out.println(sum);
		n1=n2;
		n2=sum;
	}	
	
	}

}


