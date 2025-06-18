class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 2 ; i<nums.length ; i+=3){
            if(nums[i]-nums[i-2]>k){
                return new int[0][];
            }
            List<Integer> subArr = new ArrayList<>();
            subArr.add(nums[i-2]);
            subArr.add(nums[i-1]);
            subArr.add(nums[i]);
            res.add(subArr);
        }
        int[][] result = new int[res.size()][3];
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = res.get(i).get(j);
            }
        }
        return result;
    }
}