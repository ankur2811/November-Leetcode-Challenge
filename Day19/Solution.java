class Solution {
    public String decodeString(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<String> st=new Stack<>();
        Stack<Integer> numst=new Stack<>();
        int i=0,num=0;;
        while(i<s.length())
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
             num= (num*10+s.charAt(i)-'0');
         else  if(s.charAt(i)==']')
           {
               StringBuilder temp=new StringBuilder();
               while(st.peek().charAt(0)!='[')
                   temp.append(st.pop());
               st.pop();
               int k=numst.pop();
               StringBuilder fl=new StringBuilder();
               for(int j=0;j<k;j++)
                   fl.append(temp);
               
               st.push(fl.toString());
               
           }
            else
                st.push(Character.toString(s.charAt(i)));
            
            if(s.charAt(i)=='[')
            {
                	numst.push(num);
				num=0;
            }
            
            i++;
        }
        
        while(st.size()>0)
        {
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
        
    }
}