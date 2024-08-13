


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int []arr=new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		

		int max=Integer.MIN_VALUE;
		
		int max1=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
		   
		    if(arr[i]>max){
		    
		    max1=max;
		    max=arr[i];
		    }
		    else if(arr[i]>max1 && arr[i]!=max)
		    {
		        max1=arr[i];
		        
		    }
		    
		}
		
		System.out.print(max1);
		
	}
}
