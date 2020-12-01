class Solution {
    public int longestSubstring(String s, int k) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;
        
        int start=0,maxlen=0;
        boolean valid=true;
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']>0 && freq[s.charAt(i)-'a']<k)
            {
                maxlen=Math.max(maxlen,longestSubstring(s.substring(start,i),k));
                start=i+1;
                valid=false;
            }
        }
        if(valid)
            return s.length();
        return Math.max(maxlen,longestSubstring(s.substring(start),k));
    }
}