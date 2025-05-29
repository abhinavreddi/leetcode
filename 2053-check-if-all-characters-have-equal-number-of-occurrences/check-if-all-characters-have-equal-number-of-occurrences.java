class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hp =  new HashMap<>();
        for(char c : s.toCharArray()){
            hp.put(c,hp.getOrDefault(c, 0) + 1);
        }
        int temp =-1;
       for (int val : hp.values()) {
        if(temp==-1){
            temp = val;
        }else if(val!=temp){
            return false;
        }
       }
       return true;
    }
}