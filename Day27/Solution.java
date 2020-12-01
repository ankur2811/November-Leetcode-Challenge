class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length==0)
            return false;
        int N=nums.length;
        int sum=0;
        for(int ele:nums)
            sum+=ele;
        if(sum%2!=0)
            return false;
         int tar=sum/2;
        boolean[][] dp=new boolean[N+1][tar+1];
        for(int n=0;n<=N;n++)
        {
            for(int Tar=0;Tar<=tar;Tar++)
            {
                if(n==0 || Tar==0)
                {
                    dp[n][Tar]=Tar==0?true:false;
                    continue;
                }
                if(Tar-nums[n-1]>=0)
                dp[n][Tar]=dp[n][Tar]||dp[n-1][Tar-nums[n-1]];
                   dp[n][Tar]=dp[n][Tar]||dp[n-1][Tar];
            }
            
        }
        return dp[N][tar];
    }
}