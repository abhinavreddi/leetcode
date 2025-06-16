class Solution {
    public int maximumDifference(int[] nums) {
    //     int res =-1;
    //     for(int i =0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]<nums[j]){
    //                 res = Math.max(res,nums[j]-nums[i]);
    //             }
    //         }
    //     }
    //     return res;
    // }

    int i =0;
    int res =-1;

    for(int j =1;j<nums.length;j++){
        if(j>i && nums[j]> nums[i]){
            res=Math.max(res,nums[j]-nums[i]);
        }else{
            i=j;
        }
    }
    return res;
    }
}