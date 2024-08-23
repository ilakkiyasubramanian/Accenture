6-Sept-2021


It is Edward's birthday today. His friends have bought him a huge circular cake.
Edward wants to find out the maximum number of pieces he can get by making exactly N straight vertical
cuts on the cake.
Your task is to write a function that returns the maximum number of pieces that can be obtained by making
N number of cuts.
Note: Since the answer can be quite large, modulo it by 1000000007


public class NewClass1 {

  public String sayHelloFromNewClass(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sum(a);
    System.out.println(b);
  }
  
  public static int sum(int a)
  {
    int long M=1000000007;
    if(a==0)
    {
      return 1;
    }
    if(n==1)
    {
      return 2;
    }
  }return (n+sum(n-1)%M);

}
