class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         ArrayList<Integer>list=new ArrayList<>();
         int n=arr.length;
         for(int i=0;i<n;i++){
            int index=Math.abs(arr[i]);
            if(arr[index-1]>0) arr[index-1]*=-1;
        }
        for(int i=0;i<n;i++){
           if(arr[i]>0) list.add(i+1);
        }
        return list;
    }
}