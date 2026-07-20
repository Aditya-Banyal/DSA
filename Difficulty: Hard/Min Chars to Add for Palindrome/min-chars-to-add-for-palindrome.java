class Solution {
    public int minChar(String s) {
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        s=s+"#"+rev;
        int[] lps=new int[s.length()];
        
        int i=1;
        int j=0;
        lps[0]=0;
        while(i<s.length()){
            char st=s.charAt(i);
            char en=s.charAt(j);
            if(st==en){
                lps[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
        }
        return n-lps[s.length()-1];
    }
}