import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

    public static void main(String[] args) {
        int c=0;
        int arry[]= new int[26];
        for(int i = 0; i<26;){
            arry[i++]=0;
        }
        Scanner n= new Scanner(System.in);
        int a = Integer.parseInt(n.nextLine());
        for(int j = 0; j<a;j++){
            int nwarry[]=new int[26];
            for(int k=0;k<26;){
                nwarry[k++]=0;
            }
            String str = n.nextLine();
            for(int k = 0; k<str.length();){
               if(nwarry[(int)str.charAt(k)-97]==0){
                   nwarry[(int)str.charAt(k)-97]=1;
                   arry[(int)str.charAt(k)-97]+=1; 
               } 
               k++;
            }
            
        }
        for(int l = 0; l<26;){
            if(arry[l++]==a){
                c++;
            }
        }
        System.out.println(c);
    }
}