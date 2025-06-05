class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> lastOcc = new HashMap<>();
        for(int i =0;i<s.length();i++){
            lastOcc.put(s.charAt(i),i);
        }

        Stack<Character> stk = new Stack<>();
        HashSet<Character> visited = new HashSet<>();
        for(int i =0;i<s.length();i++){
            if(visited.contains(s.charAt(i))){
                continue;
            }
            while(!stk.isEmpty() && s.charAt(i) < stk.peek() && i< lastOcc.getOrDefault(stk.peek(),-1)){
                visited.remove(stk.pop());
            }
            visited.add(s.charAt(i));
            stk.push(s.charAt(i));
        }
        
        StringBuilder res = new StringBuilder();
        for(char ch: stk){
            res.append(ch);
        }
        return res.toString();
        
    }
}