//Platform: Hacker rank
//Language: Java
//Difficulty: Easy
//Link: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int sum=a;
        int po=1;
        for(int j=0;j<n;j++){
               sum=sum+po*b;
               System.out.print(sum+" ");
               po=po*2;
        }
        System.out.println();
    
}
}
}

