class Solution {
    public int smallestRepunitDivByK(int k) {
        int num=1;
        int i=1;
        if(k%2==0 || k%5==0)
            return -1;
       
        while(num%k!=0)
        {
            num=(num*10+1)%k;
            i++;
        }
        return i;
    }
}