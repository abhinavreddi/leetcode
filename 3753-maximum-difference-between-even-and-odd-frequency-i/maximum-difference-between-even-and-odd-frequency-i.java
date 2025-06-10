class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int minEvenFreq = Integer.MAX_VALUE;
        int maxOddFreq = Integer.MIN_VALUE;

        for (int f : freq) {
            if (f > 0) {
                if (f % 2 == 0) {
                    minEvenFreq = Math.min(minEvenFreq, f);
                } else {
                    maxOddFreq = Math.max(maxOddFreq, f);
                }
            }
        }
        if (minEvenFreq == Integer.MAX_VALUE || maxOddFreq == Integer.MIN_VALUE) {
            return -1;
        }

        return maxOddFreq - minEvenFreq;
    }
}
