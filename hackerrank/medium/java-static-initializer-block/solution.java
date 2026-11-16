import java.io.*;
import java.util.*;

public class Solution {
    static int B;
    static int H;
    /*static {
         int B;
         int H;
    }*/
    public void area(){
        if(B>0 && H>0){
        System.out.println((B*H));}
        else{
        System.out.println( "java.lang.Exception: Breadth and height must be positive");
        }
    }
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         B = sc.nextInt();
        //Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        Solution s = new Solution();
        s.area();
        
        //Solution.area();
        }
}
