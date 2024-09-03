Input the Interval: Get the start and end values of the interval from the user.
Find Prime Numbers: Identify all the prime numbers within the given interval.
Select Odd-Positioned Primes: From the list of prime numbers, select those that are in odd positions (1st, 3rd, 5th, etc.).
Calculate the Sum: Sum up the selected prime numbers.




import java.util.*;

public class Main {
  
  
  public static boolean isprime(int num)
  {
    if(num<=1) return false;
    if(num==2) return true;
    if(num%2==0) return false;
    for(int i=3;i<=Math.sqrt(num);i+=2)
    {
      if(num%i==0)
      return false;
    }
    return true;
  }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      ArrayList<Integer> prime=new ArrayList<>();
      for(int i=a;i<=b;i++)
      {
        if(isprime(i))
        {
          prime.add(i);
        }
      }
      int sum=0;
      for(int i=0;i<prime.size();i++)
      {
        if(i%2==0)
        {
          sum+=prime.get(i);
        }
      }
      System.out.println(sum);
  }
}
