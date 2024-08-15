Find the Missing Number in an Array: Given an array of consecutive integers
with one missing element, write a function to find the missing number

import java.util.*;

public class Main {
  
  public static int missingNumber(int [] arr){
    int n=arr.length+1;
    int actual=0;
    int eo=0;
    int min=arr[0];
    int max=min+n-1;
    
    for(int i:arr)
    {
      actual+=i;
      
    }
    eo=(max*(max+1))/2 -(min*(min-1)/2) ;
    return eo-actual;
  }
  
  public static void main(String[] args) {
   int [] arr={11,12,13,14,15,17};
   System.out.println("The missing number is: " + missingNumber(arr));
  }
}
