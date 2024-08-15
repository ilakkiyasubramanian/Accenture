****If a String contains Vowel or not****


import java.util.Scanner;
public class Main
{
    public static boolean contain(String a)
	    {
	        String l=a.toLowerCase();
	        for(char c:l.toCharArray()){
	            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	            {
	                return true;
	            }
	            
	        }
	        return false;
	        
	    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter String:");
	    String a=sc.nextLine();
	    boolean b=contain(a);
	    System.out.println("Does the string contain a vowel? " + b);
	    }
}
