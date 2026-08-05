class Solution {
    public ArrayList<String> binstr(int n) {
        StringBuilder temp=new StringBuilder();
        ArrayList<String> list=new ArrayList<>(); 
        generate_binary(temp,0,n,list);
        return list;
    }
    public void generate_binary(StringBuilder temp,int i,int n,ArrayList<String> list){
        if(i==n){
            list.add(temp.toString());
            return;
        }
        temp.append('0');
        generate_binary(temp,i+1,n,list);
        temp.deleteCharAt(temp.length() - 1);
        temp.append('1');
        generate_binary(temp,i+1,n,list);
        temp.deleteCharAt(temp.length() - 1);
    }
}
