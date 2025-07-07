class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i =0,res =0;
        int day=1;
        int n = events.length;
        while(i<n || !minHeap.isEmpty()){

            while(i<n && events[i][0]==day){
                minHeap.offer(events[i][1]);
                i++;
            }

            while(!minHeap.isEmpty() && minHeap.peek()<day){    
                minHeap.poll();
            }

            if(!minHeap.isEmpty()){
                minHeap.poll();
                res++;
            }
            day++;
        }

        return res;
    }
}