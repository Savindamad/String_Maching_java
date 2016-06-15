import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Parangram {

    public static void main(String[] args) {
        int arry[] = new int[26];
        int c = 0;
        for(int i =0; i<26;){
            c+=i + 1;
            arry[i++]=0;
        }
        Scanner n = new Scanner(System.in);
        String str = n.nextLine();
        for(int j = 0; j < str.length();){
            if((int)str.charAt(j)>96 && (int)str.charAt(j)<123){
				System.out.println("a " + ((int)str.charAt(j)-96));
                if(arry[(int)str.charAt(j)-97]==0){
                    arry[(int)str.charAt(j)-97]=1;
                    c=c-((int)str.charAt(j)-96);
                }
            }
            if((int)str.charAt(j)>64 && (int)str.charAt(j)<91){
				System.out.println("a " + ((int)str.charAt(j)-64));
                if(arry[(int)str.charAt(j)-65]==0){
                    arry[(int)str.charAt(j)-65]=1;
                    c=c-((int)str.charAt(j)-64);
                }
            }
            if(c==0){
                break;
            }
			j++;
        }
        if(c==0){
            System.out.print("pangram");
        }
        else{
            System.out.print("not pangram");
        }
    }
}