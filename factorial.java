/*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter:");
	    int a=sc.nextInt();
	    long fact=1;
	    for(int i=1;i<=a;i++)
	    {
	        fact*=i;
	    }
	    
		System.out.println(fact);
	}
}
/*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter:");
	    int a=sc.nextInt();
	    long fact=fact(a);
	    
	    
		System.out.println(fact);
	}
		public static  long fact(int a)
		{
		    if(a==0 || a==1){
		        return 1;
		    }
		    else {
		        return a*fact(a-1);
		        
		    }
		}
	
}
