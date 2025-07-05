class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int res = -1;
        for(int ch: arr){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Integer,Integer> num : freq.entrySet()){
            if(num.getKey()==num.getValue()){
                res = Math.max(res,num.getKey());
            }
        }
        return res;
    }
}