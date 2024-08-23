Accenture Sept-2021


Sum of odd integers in array

Problem statement
"An odd number is an integer which is not a multiple of 2.
You are required to implement the following function:
Int SumOddIntegers(int arr[], int n);
The function accepts an integer array ‘arr’ of length ‘n’ as its argument. You are required to
calculate the sum of all odd integers in an array ‘an’ and return the same."

import java.util.*;
public class Main {
  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int []arr=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
      }
      
      int sum=odd(a,arr);
       System.out.println(sum);
  }
  public static int odd(int a,int arr[])
  {
    int s=0;
      for(int i:arr)
      {
        if(i%2!=0)
        {
          s+=i;
         
        }
      }
      return s;
  }
}
