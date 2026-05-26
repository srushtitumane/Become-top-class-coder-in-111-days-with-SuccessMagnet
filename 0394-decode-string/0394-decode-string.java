class Solution {
    public String decodeString(String s) {
        Stack<Integer> stacknum=new Stack<>();
        Stack<String> stackstr=new Stack<>();
        String curr="";
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            char ic = s.charAt(i);
            if(Character.isDigit(ic))
                num = num * 10 + (ic - '0');
            else if(ic == '[')
            {
                stacknum.push(num);
                stackstr.push(curr);
                curr = "";
                num = 0;
        }
         else if(ic == ']')
            {
                String temp = "";
                int prevnum = stacknum.pop();
                String prevstr = stackstr.pop();
                for(int j=0; j<prevnum; j++)
                    temp += curr;
                curr = prevstr + temp;
            }
             else
                curr += ic;
        }
        return curr;
        
    }
}