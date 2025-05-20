class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n+1];

        for(int[] query : queries){
            int start = query[0];
            int end = query[1];

            diff[start]-=1;
            if(end+1<n){
                diff[end+1]+=1;
            }
        } 

        int count = 0;
        for(int i =0;i<n;i++){
            count += diff[i];
            nums[i]+=count;
        } 

        for(int num: nums){
            if(num>0){
                return false;
            }
        }
        return true;
    }
}