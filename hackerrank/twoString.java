public class twoString {

    public static void main(String[] args) {
        int flag=0;
        Scanner n = new Scanner(System.in);
        int a = Integer.parseInt(n.nextLine());
        int arry[]= new int[26];
        for(int i = 0; i<a;i++){
            for(int j = 0; j<26;){
                arry[j++]=0;
            }
            String str1 = n.nextLine();
            String str2 = n.nextLine();
            for(int k = 0; k<str1.length();){
                if(arry[(int)str1.charAt(k)-97]==0){
                    arry[(int)str1.charAt(k)-97]=1;
                }
                k++;
            }
            for(int l = 0; l<str2.length();){
                if(arry[(int)str2.charAt(l)-97]==1){
                    flag = 1;
                    break ;
                }
                l++;
            }
            if(flag==1){
                System.out.println("YES");
                flag=0;
            }
            else{
                System.out.println("NO");
            }
        }
    }
}