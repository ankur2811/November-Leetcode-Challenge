class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        boolean[] vis=new boolean[arr.length];
        
        return canReach(arr,start,vis);
    }
    
    public boolean canReach(int[] arr,int st,boolean[] vis)
    {
        if(arr[st]==0)
            return true;
       // vis[st]=true;
        boolean ans=false;
        
        if(st-arr[st]>=0 && vis[st-arr[st]]==false){
            vis[st-arr[st]]=true;
            ans=ans||canReach(arr,st-arr[st],vis);
               vis[st-arr[st]]=false;
            } 
        
        if(st+arr[st]<arr.length && vis[st+arr[st]]==false)
        {
              vis[st+arr[st]]=true;
            ans=ans||canReach(arr,st+arr[st],vis);
               vis[st+arr[st]]=false;
        }
        
        return ans;
    }
}