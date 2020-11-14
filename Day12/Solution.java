class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
    List<Integer> smallAns=new ArrayList<>();
    
    int n=nums.length;
    boolean[] vis=new boolean[n];

    Arrays.sort(nums);
    permuteUnique_(nums,0,vis,res,smallAns);
    return res;  
    }
    public void permuteUnique_(int[] nums,int count,boolean[] vis,List<List<Integer>> res,List<Integer> smallAns){
    if(count==nums.length){
        List<Integer> ans=new ArrayList<>(smallAns);
        res.add(ans);
        return;
    }
    
    HashSet<Integer> duplicate=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(!vis[i] && !duplicate.contains(nums[i])){
            
            vis[i]=true;
            smallAns.add(nums[i]);
            duplicate.add(nums[i]);
            
            permuteUnique_(nums,count+1,vis,res,smallAns);
            
            vis[i]=false;
            smallAns.remove(smallAns.size()-1);
        }
    }
}
}