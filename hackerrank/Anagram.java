import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = Integer.parseInt(n.nextLine());
        for(int i = 0; i<a; i++){
            int arry[] = new int[26];
            for(int k = 0; k<26; k++){
                arry[k]=0;
            }
            String str = n.nextLine();
            int c = 0;
            if(str.length()%2==0){
                int j;
                for(j=0; j<str.length()/2;){
                    arry[(int)str.charAt(j++)-97]+=1;
                }
                for(int k=j; k<str.length();){
                    arry[(int)str.charAt(k++)-97]-=1;
                }
                for(int l = 0; l < 26; ){
                    if(arry[l]>0){
                        c+=arry[l];
                    }
                    l++;
                }
                System.out.println(c);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}