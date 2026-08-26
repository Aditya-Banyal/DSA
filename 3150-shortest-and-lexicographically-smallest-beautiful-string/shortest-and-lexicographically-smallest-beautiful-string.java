class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        StringBuilder ans=new StringBuilder();
        if(s.length()<k){
            return "";
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                list.add(i);
            }
        }
        if(list.size()<k){
            return "";
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=list.size()-k;i++){
            int start=list.get(i);
            int end=list.get(i+k-1);
            String temp=s.substring(start,end+1);
            if(end - start < min ||
              (end - start == min && temp.compareTo(ans.toString()) < 0)) {

                min = end - start;
                ans.setLength(0);
                ans.append(temp);
            }

        }
        return ans.toString();
    }
}