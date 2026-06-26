class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int ps=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]+=ps;
            ps+=temp;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-k==0){
                count++;
            }
            if(mp.containsKey(arr[i]-k)){
                count+=mp.get(arr[i]-k);
            }
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
        }
        return count;
    }
}