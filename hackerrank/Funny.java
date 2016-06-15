import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Funny {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = Integer.parseInt(n.nextLine());
        for(int i = 0; i<a; i++){
            int flag = 0; 
            String str = n.nextLine();
            int j = 0;
            int k = str.length()-1;
            while(j<=k){
                if(Math.abs((int)str.charAt(j)-(int)str.charAt(j+1))!=Math.abs((int)str.charAt(k)-(int)str.charAt(k-1))){
                    flag = 1 ;
                    break;
                }
                j++;
                k--;
            }
            if(flag==1){
                System.out.println("Not Funny");
            }
            else{
                System.out.println("Funny");
            }
        }
    }
}