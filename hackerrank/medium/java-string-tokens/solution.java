import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.length() == 0){
            System.out.print(0);
            //return;
        }
        if(s.trim().isEmpty()){
            System.out.print(0);
            //return;
        }
        else{
            String p = s.replaceAll("[^\\p{Alpha}]+"," ").trim();
            if(p.isEmpty()){
                System.out.print(0);
            }
            else{
                String[] strings = p.split("\\p{Space}+");
                System.out.println(strings.length);
        
                for(String i : strings){
                    System.out.println(i);
                }
            }
        
        }
        scan.close();
    }
}

