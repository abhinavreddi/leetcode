class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while(word.length()<k){
            StringBuilder temp = new StringBuilder();
            for(char ch : word.toString().toCharArray()){
                temp.append((char)((ch-'a'+1)%26+'a'));
            }
            word.append(temp);
        }
        return word.charAt(k-1);
    }
}