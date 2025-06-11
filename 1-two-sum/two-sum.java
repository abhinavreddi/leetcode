class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        int res[] = {-1,-1};

        for(int i =0;i<nums.length;i++){
            int more = target-nums[i];

            if(hp.containsKey(more)){
                res[0]=i;
                res[1]=hp.get(more);
                return res;
            }
            hp.put(nums[i],i);
        }
        return res;
    }
}