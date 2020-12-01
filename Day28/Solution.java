class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        int[] ans=new int[nums.length-k+1];
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
          while(dq.size() !=0 && dq.getFirst()<=i-k)
              dq.removeFirst();
            while(dq.size()!=0 && nums[dq.getLast()]<nums[i])
                dq.removeLast();
            
            dq.addLast(i);
            
            if(i>=k-1)
                ans[idx++]=nums[dq.getFirst()];
        }
      return ans;  
    }
}