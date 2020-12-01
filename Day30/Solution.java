class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        List<List<Integer>> res = new ArrayList<>();
        for(int[] arr:buildings)
            pq.add(arr);
        int[] prev=null;
        while(pq.size()>0)
        {
            int[] curr=pq.poll();
            while(pq.size()>0 && pq.peek()[0]<curr[1]){
                int[] next=pq.poll();
            int s1=curr[0],s2=next[0],e1=curr[1],e2=next[1],h1=curr[2],h2=next[2];
                if(h1<=h2)
                {
                    if(e2<e1)
                        pq.add(new int[]{e2,e1,h1});
                    if(s1==s2)
                        curr=next;
                    else
                    {
                        curr = new int[]{s1, s2, h1};
                        pq.add(next);
                    }
                }
                else
                {
                    if(e1<e2)
                         pq.add(new int[]{e1,e2,h2});
                        
                }
                }
            
            if(prev==null)
                res.add(Arrays.asList(curr[0],curr[2]));
            else if(curr[0]>prev[1])
            {
                    res.add(Arrays.asList(prev[1], 0));
                res.add(Arrays.asList(curr[0], curr[2]));
            }
            else { // curr[0] == prev[1]
                if(curr[2] != prev[2])
                    res.add(Arrays.asList(curr[0], curr[2]));
            }
            prev = curr;
                
        }
         if(prev != null) {
            res.add(Arrays.asList(prev[1], 0));
        }
        
        return res;
    }
}