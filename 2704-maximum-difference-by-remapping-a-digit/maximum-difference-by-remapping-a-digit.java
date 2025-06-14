class Solution {
    public int minMaxDifference(int num) {
        int temp = num;

        int msd = 0;
        temp = num;
        while (temp >= 10) {
            temp /= 10;
        }
        msd = temp;

        temp = num;
        int maxReplace = -1;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 9) {
                maxReplace = digit;
            }
            n /= 10;
        }
        if (maxReplace == -1) maxReplace = msd;

        int maxnum = 0;
        int place = 1;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == maxReplace) {
                maxnum += 9 * place;
            } else {
                maxnum += digit * place;
            }
            temp /= 10;
            place *= 10;
        }

        temp = num;
        int minnum = 0;
        place = 1;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == msd) {
                minnum += 0 * place;
            } else {
                minnum += digit * place;
            }
            temp /= 10;
            place *= 10;
        }

        return maxnum - minnum;
    }
}
