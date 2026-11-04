import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        //double result=;
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
         int result=a;   
        for(int j=0;j<n;j++){
            result = result + (int) Math.pow(2,j)*b;
            System.out.print( result + " ");
        }
        System.out.println();
        }
        //System.out.println("the series is:" + result);
        in.close();
    }
}
