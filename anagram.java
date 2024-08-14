To Check Anagram


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String 1");
	    
	    String s1=sc.nextLine();
	    System.out.println("Enter String 1");
	    String s2=sc.nextLine();
	    
	     s1=s1.toLowerCase();
	     s2=s2.toLowerCase();
	    
	    
	    if(s1.length()!=s2.length())
	    {
	       System.out.println("Not Anagram");
	       
	    }
	    else{
	        char[] a=s1.toCharArray();
	        char[] b=s2.toCharArray();
	        Arrays.sort(a);
	        Arrays.sort(b);
	        if(Arrays.equals(a,b))
	        {
	            System.out.println("Anagram");
	            
	        }
	        else
	        {
	            System.out.println("Not Anagram");
	        }
	    }
	    
		
	}
}
