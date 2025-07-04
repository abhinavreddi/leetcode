class Solution {
    public String shiftingLetters(String s, int[] shifts) {
       int n = shifts.length;
       int[] shiftsArr = new int[n];
       long sum =0;

       for(int i = n-1 ; i>=0;i--){
        sum = (sum+shifts[i])%26;
        shiftsArr[i]=(int)sum;
       }

       char[] res = new char[n];
       for(int i =0;i<n;i++){
        char word = s.charAt(i);
        int shifted = (word - 'a' + shiftsArr[i])%26;
        res[i] = (char) (shifted + 'a');
       }

       return new String(res);

    }
}