class Solution {
    public int passThePillow(int n, int time) {
        if(time<n){
            return time+1;
        }
        int circle = time/(n-1);
        int rem = time%(n-1);

        if(circle%2==0){
            return rem+1;
        }

        return n-rem;
        

    }
}