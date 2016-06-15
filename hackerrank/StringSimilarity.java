import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringSimilarity {
    /* Head ends here */
    static long stringSimilarity(String a) {
        long c = 0;
        int j;
        for(int i = 0; i<a.length();){
            String str = a.substring(i,a.length());
            i++;
            j = 0;
            while(a.charAt(j)==str.charAt(j)){
                c+=1;
				j++;
				if(j==str.length()){
					j=0;
					break;
				}
            }
        }
        return c;
    }
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res;

        int _t_cases = Integer.parseInt(in.nextLine());
        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
            String _a = in.nextLine();
            res = stringSimilarity(_a);
            System.out.println(res);
        }
    }
}