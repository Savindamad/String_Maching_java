import java.io.*;
import java.util.*;
 
public class KnuthMorrisPratt
{
    private int[] failure;
    public KnuthMorrisPratt(String pat)
    {
        failure = new int[pat.length()];
        fail(pat);
        
    }
    private void fail(String pat)
    {
        int n = pat.length();
        failure[0] = -1;
        for (int j = 1; j < n; j++)
        {
            int i = failure[j - 1];
            while ((pat.charAt(j) != pat.charAt(i + 1)) && i >= 0)
                i = failure[i];
            if (pat.charAt(j) == pat.charAt(i + 1))
                failure[j] = i + 1;
            else
                failure[j] = -1;
        }
    }
    private int posMatch(String text, String pat)
    {
        int i = 0, j = 0;
        int lens = text.length();
        int lenp = pat.length();
        while (i < lens && j < lenp)
        {
            if (text.charAt(i) == pat.charAt(j))
            {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = failure[j - 1] + 1;
        }
        return ((j == lenp) ? (i - lenp) : -1);
    }
    public static void main(String[] args) throws IOException
    {
		int a = 0; 
		int sum = 0 ;
		int arry[] = new int[5];
		Scanner n = new Scanner(System.in);
		String line = n.nextLine();
		String ptn = n.nextLine();
		for(int i =0; i<ptn.length();){
            if(ptn.charAt(i)=='_'){
                a=i;
                break;
            }
            i++;
        }
		String word[]= new String[4];
		word[0] = ptn.substring(0,a)+"A"+ptn.substring(a+1,ptn.length());
		word[1] = ptn.substring(0,a)+"C"+ptn.substring(a+1,ptn.length());
		word[2] = ptn.substring(0,a)+"G"+ptn.substring(a+1,ptn.length());
		word[3] = ptn.substring(0,a)+"T"+ptn.substring(a+1,ptn.length());
		
		
		for(int k = 0; k<4; k++){
			KnuthMorrisPratt kmp = new KnuthMorrisPratt(word[k]);
			int c = 0; int t =0;
			while(c<line.length()-ptn.length()){
				int pos = kmp.posMatch(line.substring(c, line.length()), word[k]);
				if(pos==-1){
					break;
				}
				else{
					t++;
					c+=pos;
					c=c+ptn.length();				
				}
			}
			sum+=t;
			arry[k+1]=t;
		}
		System.out.println(sum);
		for(int l = 1; l<5;){
			System.out.println(arry[l]);
			l++;
		}

    }
}