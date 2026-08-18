//Link/:https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
//Language: Java
//Difficuly: eassy
//Platform: Hacker rank
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >0){
        String s=sc.next();
        try{
        long n=Long.parseLong(s);
        System.out.println(s+ " can be fitted in:");
        if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE){
            System.out.println("* byte");
        }
        if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE){
            System.out.println("* short");
        }
          if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){
            System.out.println("* int");
        }
        System.out.println("* long");
      }
      catch(Exception e){
        System.out.println(s+ " can't be fitted anywhere.");
      }
      }
    }
    
}
