package Programs;

public class FindMaXandMiNArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10098,9,20,49,50,987};
	    
		int max=a[0];
		for(int i=1;i<a.length;i++)
		
		{
		if (max<a[i])
		{		
		max=a[i];
		}
		}
		
		System.out.println(max);
	}

}
//if (a[i]<max