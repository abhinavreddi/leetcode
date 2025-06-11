class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean freq[] = new boolean[26];

        for(char ch : sentence.toCharArray()){
            freq[ch-'a']=true;
        }
        for(int i =0;i<26;i++){
            if(freq[i]==false){
                return false;
            }
        }
        return true;
    }
}