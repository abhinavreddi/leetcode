class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        int count=1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]-min<=k){
                continue;
            }else{
                min=nums[i];
                count++;
            }
        }
        return count;
    }
}