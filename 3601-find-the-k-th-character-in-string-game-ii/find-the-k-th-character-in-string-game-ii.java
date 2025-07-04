class Solution {
    public char kthCharacter(long k, int[] operations) {
        // StringBuilder word = new StringBuilder("a");
        // int i =0;
        // while(word.length()<k  && i<operations.length){
        //     StringBuilder temp = new StringBuilder();
        //     if(operations[i]==0){
        //         temp = word;
        //     }else{
        //         for(char ch : word.toString().toCharArray()){
        //             temp.append((char)((ch-'a'+1)%26+'a'));
        //         }
        //     }
        //     word.append(temp);
        //     i++;
        // }
        // return word.charAt((int)k-1);


        int n = operations.length;
        long[] sizes = new long[operations.length + 1];
        sizes[0] = 1;
        int maxIdx = 0;
        for(int i =0;i<n;i++){
            sizes[i+1]=sizes[i]*2;
            maxIdx = i+1;
            if(sizes[i+1]>=k)break;
        }

        char ch ='a';
        for (int i = maxIdx; i > 0; i--) {
            long half = sizes[i - 1];
            if (k > half) {
                k -= half;
                if (operations[i - 1] == 1) {
                    ch = (char) ((ch - 'a' + 1) % 26 + 'a');
                }
            }
        }

        return ch;
    }
}