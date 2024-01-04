package Programs;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="bv@#$%^234UI)(*.,";
		
	   String s1=	s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s1);
		
	}

}
