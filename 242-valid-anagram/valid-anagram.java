class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
           
        }
        for(int i=0;i<s.length();i++){
            char ch=t.charAt(i);
    
            
                mp.put(ch,mp.getOrDefault(ch,0)-1);
            
        }
        for(int i:mp.values()){
            if(i!=0)return false;
        }
        return true;
    }
}