class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans=new ArrayList<>();
        if(n==1)
        {
            ans.add(0);
            return ans;
        }
        List<Integer>[] graph = new ArrayList[n];
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
            indegree[edge[0]]++;
            indegree[edge[1]]++;
            
        }
        
        Queue<Integer> qu=new LinkedList<>();
        
        int rem=n;
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==1)
                qu.add(i);
        }
        while(qu.size()>0)
        {
            if(rem<=2)
                break;
            int size=qu.size();
            while(size-->0)
            {
            int ele=qu.poll();
              rem--;
                
                for(int e:graph[ele])
                {
                    indegree[e]--;
                    
                    if(indegree[e]==1)
                        qu.add(e);
                }
            }
            
        }
        ans.addAll(qu);
        return ans;
    }
}