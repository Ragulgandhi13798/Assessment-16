package typecasting;

public class countrepletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String s = "happy";
		 int count = 0 ;

		    for (int i = 0; i < s.length(); i++)
		    {

		        for (int j = 0; j < s.length(); j++)
		        {

		            if(s.charAt(i)==s.charAt(j))
		            {
		                count=count+1;

		            }
		            else
		            {
		            	count=0;
		            }
		        }   
		        
		    }
		    System.out.println(count);
	}
}

