class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int si=1,ei=(int)1e8;
        
        while(si<ei)
        {
            int mid=(si+ei)/2;
            int sum=calsum(nums,mid);
            if(sum<=threshold)
            {
                ei=mid;
            }
            else if(sum>threshold)
                si=mid+1;
         
            
        }
        return ei;
        
    }
    
    public int calsum(int[] nums,int n)
    {
        int sum=0;
        for(int ele:nums)
        {
            sum+=ele/n;
            
            if(ele%n!=0)
                sum++;
        }
        return sum;
    }
}