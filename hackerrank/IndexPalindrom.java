import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IndexPalindrom {

    public static void main(String[] args) {
        Scanner n  = new Scanner(System.in);
        int a = Integer.parseInt(n.nextLine());
        for(int i = 0; i<a;i++){
            String str = n.nextLine();
            int j = 0; int k= str.length()-1;
            int left = 0; int right = str.length()-1; int flag =0;
            while(j<k){
                if(str.charAt(j)!=str.charAt(k) && flag==0){
                    left=j; right=k; flag = 1;
                    k--;
                }
                else if (str.charAt(j)!=str.charAt(k) && flag==1){
                    flag = 2;
                    System.out.println(left);
                    break;
                }
                else{
                    j++; k--;
                }
            }
            if(flag == 0){
                System.out.println(-1);
            }
            else if(flag == 1){
                System.out.println(right);
            }
        }
    }
}