package Programs;

public class CountOccuranceOfchar {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

    String s="vinod gate vimmjvivlo";		
		int Totalcount=s.length();
		int TC=s.replace("i", "").length();
		
			int Fc=Totalcount-TC;
		System.out.println(Fc);
	}
}



