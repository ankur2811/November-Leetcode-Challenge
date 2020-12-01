class Solution {
    public boolean search(int[] nums, int target) {
       int li=0,hi=nums.length-1;
        while(li<=hi)
        {
            int mid=(li+hi)/2;
            if(nums[mid]==target || nums[li]==target)
                return true;
            if(nums[li]<nums[mid])
            {
                if(nums[li]<=target && nums[mid]>=target)
                    hi=mid-1;
                else
                    li=mid+1;
            }
            else if(nums[mid]<nums[hi])
            {
              if(nums[hi]>=target && nums[mid]<=target)
                   li=mid+1;  
                else
                    hi=mid-1;
            }
            else 
                li++;
        }
        return false; 
    }
}