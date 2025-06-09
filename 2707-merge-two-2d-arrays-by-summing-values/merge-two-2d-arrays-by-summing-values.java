class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int idx1 = 0;
        int idx2 = 0;
        List<int[]> res = new ArrayList<>();

        while(idx1<nums1.length && idx2<nums2.length){
            if(nums1[idx1][0] == nums2[idx2][0]){
                nums1[idx1][1] += nums2[idx2][1];
                res.add(nums1[idx1]);
                idx1++;
                idx2++;
            }else if(nums1[idx1][0] < nums2[idx2][0]){
                res.add(nums1[idx1]);
                idx1++;
            }else{
                res.add(nums2[idx2]);
                idx2++;
            }
        }

        while(idx1<nums1.length){
            res.add(nums1[idx1]);
            idx1++;
        }

        while(idx2<nums2.length){
            res.add(nums2[idx2]);
            idx2++;
        }

        return res.toArray(new int[res.size()][]);
    }
}