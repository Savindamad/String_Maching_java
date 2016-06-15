import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakeItAnangram {

    public static void main(String[] args) {
        int arry[] =new int[26];
        int c = 0;
        for(int i =0; i<26; i++){
            arry[i]=0;
        }
        Scanner n = new Scanner(System.in);
        String str1 = n.nextLine();
        String str2 = n.nextLine();
        for(int j = 0; j<str1.length();){
            arry[((int)str1.charAt(j)-97)]+=1;
            j++;
        }
        for(int j = 0; j<str2.length();){
            arry[((int)str2.charAt(j)-97)]-=1;
            j++;
        }
        for(int k = 0; k<26;){
            c+=Math.abs(arry[k++]);
        }
        System.out.println(c);
    }
}