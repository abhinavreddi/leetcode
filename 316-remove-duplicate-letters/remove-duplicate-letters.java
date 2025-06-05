class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();
        int[] last = new int[26];
        boolean[] visited = new boolean[26];
        for(int i =0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(visited[ch-'a']==true){
                continue;
            }
            while(!stk.isEmpty() && stk.peek()>ch && last[stk.peek()-'a']>i){
                visited[stk.pop()-'a']=false;
            }
            stk.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder res = new StringBuilder();
        for(char ch : stk){
            res.append(ch);
        }

        return res.toString();
    }
}