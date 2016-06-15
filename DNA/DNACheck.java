import java.io.*;
import java.lang.Math;

class DNACheck{
	DNACheck(String line, String word, String ptn){
		int c = 0 ;
		String s = "";
		double hashValWord = hashfunc(word);
		double hashValLine = hashfunc(line.substring(0, word.length()));
		while(c<=line.length()-word.length()){
			if(hashValWord==hashValLine){
				System.out.println(c);
				if(c<(line.length()-word.length())){
					hashValLine = hashfunc(line.substring(c+word.length(),c+word.length()+word.length()));
				}
				s+=ptn;
				c+=word.length();
			}
			else{
				hashValLine = hashfunc(hashValLine,word.length(),line.charAt(c),line.charAt(c+word.length()));
				s +=line.charAt(c);
				c++;
			}
		}
		System.out.println(s);

	}
	public static double hashfunc(String word){
		double hashVal = 0;
		for(int i = 1; i<=word.length();i++){
			hashVal+=Math.pow(3, i)*((int)word.charAt(i-1));
		}
		return hashVal;
	}
	public static double hashfunc(double n,int l,char a,char c){
		return ((n-(((int)a)*3))/3)+Math.pow(3, l)*((int)c);
	}
	public static void main(String arg[]){
		DNACheck d = new DNACheck("aabaabaaababaabaaaab","aab","cba");
	}
}