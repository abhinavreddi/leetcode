class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max1 = 0, max2 = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                max1 = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                max2 = n - 1 - i;
                break;
            }
        }

        return Math.max(max1, max2);
    }
}
