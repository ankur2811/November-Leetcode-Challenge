class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n=A.length;
        int m=A[0].length;
        for(int i=0;i<n;i++)
        {
            int a=0,b=m-1;
            while(a<b)
            {
                int temp=A[i][a];
                A[i][a]=A[i][b];
                A[i][b]=temp;
               A[i][a]=A[i][a]==0?1:0;
                  A[i][b]=A[i][b]==0?1:0;
                
                a++;
                b--;
                
            }
            if(m%2!=0)
            {
                  A[i][a]=A[i][a]==0?1:0;
            }
        }
        
        return A;
        
    }
}