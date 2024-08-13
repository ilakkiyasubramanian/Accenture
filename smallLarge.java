a Java program that reads an array of integers from the user and prints the smallest and largest elements in the array



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
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<n;i++)
		{
		    if(arr[i]<arr[0]){
		    min=arr[i];
		    }
		    if(arr[i]>arr[0]){
		    max=arr[i];
		    }
		    
		}
		System.out.println(min);
		System.out.print(max);
		
	}
}
