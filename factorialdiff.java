Input an Array: The user provides an array of integers.
Reverse the Array: Reverse the array.
Calculate the Sum of Odd and Even Position Elements:
Calculate the sum of elements at odd positions (1st, 3rd, 5th, etc.).
Calculate the sum of elements at even positions (2nd, 4th, 6th, etc.).
Calculate the Difference: Find the difference between the sum of odd-positioned elements and the sum of even-positioned elements.
Find the Factorial of the Difference: Calculate the factorial of the absolute value of the difference.
Output the Result: Print the factorial of the difference.


import java.util.*;

public class Main {
  public static void reversearray(int [] b)
  {
    int n=b.length;
    for(int j=0;j<n/2;j++)
      {
        int temp=b[j];
        b[j]=b[n-1-j];
        b[n-1-j]=temp;
      }
  }
  public static Long facts(int diff)
  {
    if(diff==0 || diff==1) return 1L;
  
  Long fact=1L;
  for(int i=2;i<=diff;i++)
  {
    fact*=i;
  }
  return fact;
  }
  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b[]=new int[a];
      for(int i=0;i<a;i++)
      {
        b[i]=sc.nextInt();
      }
      reversearray(b);
      
      int evs=0;
      int ods=0;
      for(int i=0;i<a;i++)
      {
        if(i%2==0)
        {
          evs+=b[i];
        }
        else{
          ods+=b[i];
        }
      }
      
      int  diff=Math.abs(evs-ods);
      Long result=facts(diff);
      System.out.println(result);
  }
}
