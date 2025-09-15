class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] bletters = brokenLetters.toCharArray();
        int count=0;
        for(int i =0;i<words.length ;i++){
            for(int j =0;j<bletters.length ;j++){
                if(words[i].indexOf(bletters[j]) != -1){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}