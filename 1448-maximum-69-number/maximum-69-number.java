class Solution {
    public int maximum69Number (int num) {
        // int temp = num;
        // int res = 1;
        // boolean changed = false;
        // int pos = (int)Math.log10(num)+1;

        // while(temp>0){
        //     int digit = num % (int)Math.pow(10,pos);
        //     if(digit== 9){
        //         res=digit+res*(int)Math.pow(10,pos);
        //         pos=pos-1;
        //     }else{
        //         res = 9+res*(int)Math.pow(10,pos);
        //         pos=pos-1;
        //     }
        //     temp/=10;
            
        // }

        // return res;


        int temp = num;
        int index = -1;
        int pos = 0;
        while(temp>0){
            int digit = temp %10;
            if(digit == 6){
                index = pos;
            }
            temp = temp/10;
            pos++;
        }

        if(index == -1) return num;

        return num+(int) Math.pow(10,index)*3;
    }
}