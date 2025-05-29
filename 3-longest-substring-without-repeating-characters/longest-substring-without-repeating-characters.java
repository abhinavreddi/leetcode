class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int j = 0;
        int max = 0;
        int i =0;
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max,i-j+1);
                i++;
            }else{
                set.remove(s.charAt(j));
                j++;
            }
        }
         return max;
    }
}