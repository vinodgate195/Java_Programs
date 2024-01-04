package JavaConcept;


public class Two_dimensional_array {

public static void main(String[] args) {
		
 // Array [][]ary =new Array();
		
		
  int ary [][]= new int [5][2];
  int a[][]= { {100,200},
		       {200,300},
		       {500,400} };  //{ [0,0] [0,1] [1,0] [1,1] [2,0] [2,1] }
 // System.out.println(a.length);
  System.out.println(a[0].length);
	
  for(int i=0;i<a.length;i++)
	
  {
  
  for (int j=0;j<a[0].length;j++)
	   
  {
	  
	 System.out.println(a[i][j]);   //100,200,
	  
  }
  }
  
  }
  
		
		
	}


