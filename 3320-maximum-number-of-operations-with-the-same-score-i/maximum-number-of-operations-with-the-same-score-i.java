class Solution {
    public int maxOperations(int[] nums) {
        int count =0;
        if(nums.length<2)return 0;
        int sum = nums[0]+nums[1];
        
        for(int i =1;i<nums.length;i+=2){
            if(sum == nums[i]+nums[i-1]){
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}