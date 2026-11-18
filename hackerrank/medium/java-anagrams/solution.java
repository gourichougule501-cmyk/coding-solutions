import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        StringBuilder r =new StringBuilder(A);
        r.reverse();
         if(A.equals(r.toString())){System.out.println("Yes");}
         else{System.out.println("No");}
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



