import java.util.*;
import java.io.*;

class DNA{
	void findMatching(String T,String P){
		int n = T.length();
		int m = P.length();
		int count = 0;
		for(int i=0;i<=(n-m);i++){
			if(T.substring(i,i+m).equals(P)){
				count++;
			}
		}System.out.println(P + " "+count);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<String> lst = new ArrayList<String>();
		int num = sc.nextInt();
		sc.nextLine();
		for(int j=0;j<num;j++){
			String str = sc.nextLine();
			lst.add(str);
			
		}
		
		String str2 = sc.nextLine();
		for(int k=0;k<lst.size();k++){
			String str3 = lst.get(k);
			DNA d = new DNA();
			d.findMatching(str2,str3);
		}
	}



}