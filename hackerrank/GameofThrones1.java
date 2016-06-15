import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameofThrones1 {

    public static void main(String[] args) {
        int flag=0;
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        int arry[]= new int[26];
        for(int i = 0; i<26;){
            arry[i++]=0;
        }
        for(int j = 0; j<inputString.length();){
            arry[(int)inputString.charAt(j++)-97]+=1;
        }
        if(inputString.length()%2==0){
            for(int k = 0; k<26;){
                if(arry[k++]%2==1){
					flag = 1;
                    System.out.println("NO");
                    break;
                }
                k++;
            }
            if(flag==0){
                System.out.println("YES");
            }
        }
        else{
            for(int k = 0; k<26;){
                if(arry[k++]%2==1 && flag==0){
                    flag = 1;
                }
                else if(arry[k++]%2==1 && flag==1){
                    System.out.println("NO");
                    flag = 2;
                    break;
                }
                k++;
            }
            if(flag<2){
                System.out.println("YES");
            }
        }
        myScan.close();
    }
}