package typecasting;

public class Longtoint {

	public static void main(String[] args) {
		
		long l = 1209078;
		int i = (int) l;
	
		System.out.println(i);
		
		//int to double
		
		int i1 = 664;
		double d = i1;
		System.out.println(d);
		
		//int to double using valueof
		
		int i2 =55;
		double d1 = Double.valueOf(i2);
		System.out.println(d1);
	
		//int to double using obj
		
		int i3 = 64;
		double d3 = new Double(i3);
		System.out.println(d3);
	
	
		//double to int 
		
		double d4 = 56.6;
		int i4 = (int) d4;
	    System.out.println(i4);
	
	  //double to int using obj
	    
	    Double d6=new Double(10.65);  
	    int i6=d6.intValue();  
	    System.out.println(i6);  
	
	//boolean to string using valueof
	    
	    Boolean b1 = true;
	    Boolean b2 = false;
	    String s1 = String.valueOf(b1);
	    String s2 = String.valueOf(b2);
	    System.out.println(s1);
	    System.out.println(s2);
	
	   
	
	
	
	
	
	
	
	
	
	}

}
