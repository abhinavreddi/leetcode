import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxLen = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while (nums[j] - nums[i] > 1) {
                i++;
            }
            if (nums[j] - nums[i] == 1) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
