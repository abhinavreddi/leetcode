class Solution {
    public int findClosestNumber(int[] nums) {
        int res = Integer.MAX_VALUE;
        int ans= Integer.MAX_VALUE;
        for(int num : nums){
            int diff = Math.abs(num);
            if(diff<res || (diff == res && num > ans) ){
                res=diff;
                ans = num;
            }
        }
        return ans;
    }
}