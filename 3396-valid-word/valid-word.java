class Solution {
    public boolean isValid(String word) {
        if(word.length()>=3 && word.matches("[a-zA-Z0-9]+") && word.matches(".*[aeiouAEIOU].*") && word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*")){
            return true;
        }
        return false;
    }
}