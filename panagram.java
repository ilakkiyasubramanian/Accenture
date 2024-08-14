
 A "Panagram" is a sentence containing every letter in the English Alphabet.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    String s="The quick brown fox jumps over the lazy dog";
	    HashSet <Character> a=new HashSet<>();
	    for(char i:s.toCharArray())
	    {
	        if(i>='a' && i<='z')
	        {
	            a.add(i);
	        }
	    }
	    if(a.size()==26){
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
		
	}
}
