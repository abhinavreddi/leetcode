class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i =1;i<10;i++){
            if(i>n)break;
            dfs(i,n,res);
        }
        return res;
    }


    public void dfs(int curNum,int end,List<Integer> res){
        if(curNum>end){
            return;
        }
        res.add(curNum);
        for(int i =0;i<10;i++){
            if(curNum*10+i>end){
                break;
            }
            dfs(curNum*10+i,end,res);
        }
    }
}