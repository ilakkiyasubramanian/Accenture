6-Sept 2021



Problem statement
Mr. Professor is a great scientist, but he is not able to find a solution to one problem. There are N straight
lines that are not parallel, and no three lines go through the same point. The lines divide the plane into M
regions. Write a function to find out the maximum number of such regions he can get on the plane.
Input Specification:
input1: An integer N representing the number of straight lines (0 <=N<= 100)


import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sum(a);
      System.out.println(b);
        
      
    }
      
      
      public static int sum(int a)
      {
        int s=(a*(a+1)/2)+1;
        return s;
      }
      
}
