// User function Template for Java

class Solution {
    static int isDisarium(int N) {
        // code here
        int count=0;
        int sum=0;
        int num=N;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        num=N;
        for(int i=count;i>0;i--)
        {
                int rem=num%10;
                sum=sum+(int)Math.pow(rem,i);
                num=num/10;
            
        }
        if(sum==N)
        {
            return 1;
        }
        else{
            return 0;
        }
        
    }
};