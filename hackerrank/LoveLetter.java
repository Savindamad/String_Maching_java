import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetter {

    public static void main(String[] args) {
       Scanner n = new Scanner(System.in);
        int a = Integer.parseInt(n.nextLine());
        for(int i = 0; i<a; i++){
            String str = n.nextLine();
            int c = 0;
            int j = 0;
            int k = str.length()-1;
            while(j<k){
                c+=Math.abs((int)str.charAt(j++)-(int)str.charAt(k--));
            }
            System.out.println(c);
        }
    }
}