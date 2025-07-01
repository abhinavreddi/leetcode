class Solution {
    public int possibleStringCount(String word) {
        int totalVariants = 1; 
        int i = 0;
        boolean usedTrim = false;

        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }

            int groupLen = j - i;

            if (groupLen > 1) {
                totalVariants += (groupLen - 1);
            }

            i = j;
        }

        return totalVariants;
    }
}
