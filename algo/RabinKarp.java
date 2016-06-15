import java.io.*;
import java.lang.Math;

class RabinKarp{
	RabinKarp(String line, String word){
		int c = 0 ;
		double hashValWord = hashfunc(word);
		double hashValLine = hashfunc(line.substring(0, word.length()));
		while(hashValWord!=hashValLine && c<line.length()-word.length()){
			hashValLine = hashfunc(hashValLine,word.length(),line.charAt(c),line.charAt(c+word.length()));
			c++;
		}
		if(c<=line.length()-word.length() && hashValWord==hashValLine){
			System.out.print(c);
		}
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
		RabinKarp nw = new RabinKarp("abcdefG","fG");
	}
} 