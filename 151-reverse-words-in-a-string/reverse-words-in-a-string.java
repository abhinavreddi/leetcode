class Solution {
    public String reverseWords(String s) {
        String[] s_arr = s.trim().split("\\s+");
        
        int start = 0;
        int end = s_arr.length - 1;

        while (start < end) {
            String temp = s_arr[start];
            s_arr[start] = s_arr[end];
            s_arr[end] = temp;
            start++;
            end--;
        }

        return String.join(" ", s_arr);
    }
}
