class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int res = -1; 
        while(low<=high){
            int mid = low+(high-low)/2;

            if(target == nums[mid]){
                res = mid;
                break;
            }
            if(nums[low]<=nums[mid]){
                if(target<nums[mid] && target >=nums[low]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return res; 
    }
}