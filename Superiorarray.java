24-Aug-2021

Superior array element
Problem statement
In an array a superior element is one which is greater than all elements to its right. The rightmost element
will always be considered as a superior element.
You are given a function,
Int FindNumberOfSuperiorElements(int* arr, int n);
The function accepts an integer array ‘arr’ and its length ‘n’. Implement the function to find and return the
number of superior elements in array ‘arr’.

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int a=sc.nextInt();
      int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=sc.nextInt();
        
      }
      
      System.out.println(superior(a,arr));
  }
  public static int superior(int a,int arr[])
  {
    int sum=0;
    int j;
    for(int i=0;i<a;i++)
    
    {
      for(j=i+1;j<a;j++)
      {
        if(arr[i]<arr[j])
        {
          break;
        }
        
      }
      if(j==a)
        {
          sum+=1;
          
        }
    }return sum;
  }
    
}




6
1 20 45 9 8 7
Output:

4
