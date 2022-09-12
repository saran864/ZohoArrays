import java.util.Scanner;

public class GrandChildren {

	public static void main(String[] args) {
		int i,j,count=0;
	     Scanner sc=new Scanner(System.in);
	     String str=sc.next();
	     sc.close();
	     String a[][]= {{"luke","wayne"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
	     String s="";	 
	     for(i=0;i<a.length;i++)
	     {
	    	 for(j=0;j<a[i].length;j++)
	    	 {
	             if(a[i][1].equals(str))
	            	 s=a[i][0];
	            	 
	    	 }
	     }
	     
	    	 System.out.println(str+" son is "+s);
	    	 for(i=0;i<a.length;i++)
		     {
		    	 for(j=0;j<a[i].length;j++)
		    	 {
		    		if(a[i][1].equals(s))
		    		{
		    			count++;
		    			
		    		}
    			
		    		 
		    	 }
        			 
		     }
	    	 System.out.println(str+" Grand sons = "+count/2);
	}

}
