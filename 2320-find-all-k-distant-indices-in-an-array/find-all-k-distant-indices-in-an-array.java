import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int end= 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int start = Math.max(end, i - k);
                end = Math.min(nums.length - 1, i + k)+1;
                for (int j = start; j < end; j++) {
                    res.add(j);
                }
            }
        }
        return res;
    }
}
