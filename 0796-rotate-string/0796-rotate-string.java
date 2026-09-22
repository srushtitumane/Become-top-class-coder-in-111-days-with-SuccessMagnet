class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        // else if(s.length()==1 && goal.length()==1)
        //     return s.contains(goal);
        // else
            return (s+s).contains(goal); 
        
    }
}