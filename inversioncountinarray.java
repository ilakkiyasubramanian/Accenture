Inversion count in array
Problem statement
Let j and k be two indices in an array A.
If j < K and A[j] > A[k], then the pair (j,k) is known as an “Inversion pair”.
You are required to implement the following function:
int InversionCount(int *A, int n);
The function accepts an array ‘A’ of ‘n’ unique integers as its argument. You are required to
calculate the number of ‘Inversion pair’ in an array A, and return.




import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      int a=sc.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<a-1;i++)
      {
        for(int j=i+1;j<a;j++)
        {
          if(arr[i]>arr[j])
          {
            sum+=1;
          }
        }
        
        
      }
      System.out.println(sum);
    
  }
}
