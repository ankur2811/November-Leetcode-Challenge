class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ans=new ArrayList<>();
        int ini=intervals[0][0];
        int fin=intervals[0][1];
        
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0]<=fin)
                fin=Math.max(fin,intervals[i][1]);
            else
            {
                ans.add(new int[]{ini,fin});
               ini=intervals[i][0];
                    fin=intervals[i][1];
             }
        }
          ans.add(new int[]{ini,fin});
        
        int[][] finalarr=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
            finalarr[i]=ans.get(i);
        
        return finalarr;
    }
}