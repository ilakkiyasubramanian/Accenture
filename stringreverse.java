


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String r="";
	    
	    for(int i=a.length()-1;i>=0;i--)
	    {
	        r += a.charAt(i);
	    }
	    System.out.println("Reversed:"+r);
	    
		
	}
}
