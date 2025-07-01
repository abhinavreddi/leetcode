class Solution {
    public int possibleStringCount(String word) {
        int res =0;
        char prev = word.charAt(0);

        for(int i =1;i<word.length();i++){
            if(word.charAt(i)== prev){
                res++;
            }else{
                prev = word.charAt(i);
            }
        }

        return res+1;
    }
}