Pallindrome

import java.util.*;

public class Main {
  
  public static boolean palin(String a) {
    String clean = a.replaceAll("\\s+", "").toLowerCase();
    int length = clean.length();
    
    for (int i = 0; i < length / 2; i++) {
      if (clean.charAt(i) != clean.charAt(length - 1 - i)) {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    String a = sc.nextLine();
    boolean b = palin(a);
    System.out.println("Pallindrome:-"+b);
  }
}
