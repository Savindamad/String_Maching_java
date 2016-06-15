import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = Integer.parseInt(n.nextLine());
        for(int i = 0; i<a; i++){
            int c = 0;
            String str = n.nextLine();
            for(int j = 0; j<str.length()-1;){
                if(str.charAt(j)==str.charAt(j+1)){
                    c++;
                }
                j++;
            }
            System.out.println(c);
        }
    }
}