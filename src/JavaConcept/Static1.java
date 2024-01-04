package JavaConcept;

public class Static1 {

	int a=10;
	static int b=40;
	static String j="pritam";
	
	
	Static1(int i,String str)
	{
	 
	a=i;
	j=str;
		
	}
	
	public void add ()
	{
		;
		String b="vinod";
		System.out.println(a);
	}
	
	public static void print()
	{
		
	System.out.println(j);
	

	}
	
	public static void main(String[] args) {
		
    print();
    
    Static1 st= new Static1(5, "vv");
    st.add();
	}

}
