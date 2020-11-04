class Solution {
    public int maxPower(String s) {
        if(s.length()==0)
            return 0;
        int ans=1;
        int currlen=1;
        char temp=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==temp)
            {
                currlen++;
                ans=Math.max(ans,currlen);
            }
            else
            {
                temp=s.charAt(i);
                currlen=1;
            }
        }
        
        return ans;
    }
}