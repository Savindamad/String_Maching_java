import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
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
		scanner n = new Scanner(Syastem.in);
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
		String word[0] = pnt.substring(0,a)+"A"+pnt.substring(a+1,ptn.length());
		String word[1] = pnt.substring(0,a)+"C"+pnt.substring(a+1,ptn.length());
		String word[2] = pnt.substring(0,a)+"G"+pnt.substring(a+1,ptn.length());
		String word[3] = pnt.substring(0,a)+"T"+pnt.substring(a+1,ptn.length());
		KnuthMorrisPratt kmp = new KnuthMorrisPratt(word);
		
		for(int k = 0; k<4; k++){
			int c = 0;
			while(c<line.length()-word.length()){
				int pos = kmp.posMatch(line.substring(c, line.length()), word[k]);
				if(pos==-1){
					break;
				}
				else{
					c++;				
				}
			}
			sum+=c;
			arry[k+1]=c;
		}
		System.out.println(sum);
		for(int l = 1; l<5;){
			System.out.println(arry[l]);
		}

    }
}