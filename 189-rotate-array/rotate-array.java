class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // int temp;
        // while(k>0){
        //     temp = nums[n-1];
        //     for(int i =n-1;i>0;i--){
        //         nums[i]=nums[i-1];
        //     }
        //     nums[0]=temp;
        //     k--;
        // }

        int n = nums.length;
        if(n==0)return;
        k=k%n;

        reverse(nums, n - k, n - 1);    
        reverse(nums, 0, n - k - 1);    
        reverse(nums, 0, n - 1);  

    }

    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            nums[start] = nums[start]^nums[end];
            nums[end] = nums[start]^nums[end];
            nums[start] = nums[start]^nums[end];
            start++;
            end--;
        }
    }
}