import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        //int N=2;
        //int N=0;
     /*for (int j=2;j<=20;j++){
         N=j;
        break;}*/
    if(N>=2 && N<=20){
     for(int i=1;i<=10;i++){
        int result = N*i;
        System.out.println(N+" "+"x"+" "+i+" "+"="+" "+result);
     }
    }

    

        
    }
}
