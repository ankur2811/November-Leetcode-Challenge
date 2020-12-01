class Solution {
    public int longestMountain(int[] A) {
        int ans=0;
        int count=1;
        int a=1,b=0;
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>A[i-1])
            {b=1;
                if(a==1)
                    count++;
                else{
                    a=1;
                    count=2;
                }
                    
            }
            else if(A[i]<A[i-1])
            {
             a=0;   
                if(b==1)
                    count++;
                
            }
            else {
                count=1;
                b=0;}
            
            
            if(a==0)
          ans=Math.max(ans,count);  
                
        }
        return ans>=3?ans:0;
    }
}