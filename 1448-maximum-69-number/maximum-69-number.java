class Solution {
    public int maximum69Number (int num) {
      int temp = num;
        int res = 0;
        boolean changed = false;
        int pos = (int)Math.log10(num);

        while (pos >= 0) {
            int digit = (num / (int)Math.pow(10, pos)) % 10;
            if (digit == 6 && !changed) {
                res = res * 10 + 9;
                changed = true;
            } else {
                res = res * 10 + digit;
            }
            pos--;
        }
        return res;


        // int temp = num;
        // int index = -1;
        // int pos = 0;
        // while(temp>0){
        //     int digit = temp %10;
        //     if(digit == 6){
        //         index = pos;
        //     }
        //     temp = temp/10;
        //     pos++;
        // }

        // if(index == -1) return num;

        // return num+(int) Math.pow(10,index)*3;
    }
}