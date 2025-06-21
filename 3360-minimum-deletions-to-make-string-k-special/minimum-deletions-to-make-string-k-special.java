import java.util.*;

class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        

        List<Integer> freqList = new ArrayList<>(freq.values());
        Collections.sort(freqList);
        
        int minDel = Integer.MAX_VALUE;
        
        for (int i = 0; i < freqList.size(); i++) {
            int deletions = 0;
            int target = freqList.get(i);
            
            for (int f : freqList) {
                if (f > target + k) {
                    deletions += f - (target + k);
                } else if (f < target) {
                    deletions += f;
                }
            }
            
            minDel = Math.min(minDel, deletions);
        }
        
        return minDel;
    }
}
