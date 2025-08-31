class Solution {
    public boolean isPowerOfTwo(int n) {
     
        return n>0 && ((n & (n-1)) == 0);

        // while(n>1){
        //     if(n%2==1)return false;
        //     n=n/2;
        // }
        // return true;
    }
}