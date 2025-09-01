class Solution {
    public int reverse(int x) {
        int orginal = x;
        x = Math.abs(x);

        int res = 0;
        while(x!=0){
            int digit = x%10;
            if(res > (Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            res= res*10+digit;
            x/=10; 
        }

        return (orginal<0) ? (-res) : res;
    }
}