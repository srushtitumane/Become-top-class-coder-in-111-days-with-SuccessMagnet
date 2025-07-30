class Solution {
    public static void utility(int a, int b, int opr) {
        // code here
        int result;
        if(opr==1)
        {
            result=a+b;
            System.out.print(result);
        }
        else if(opr==2)
        {
            result=a-b;
            System.out.print(result);
        }
        else if(opr==3)
        {
            result=a*b;
            System.out.print(result);
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}