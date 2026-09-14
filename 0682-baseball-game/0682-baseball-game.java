class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String str:operations){
            if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(str.equals("+")){
                int last=stack.peek();
                int sec_last=stack.get(stack.size()-2);
                stack.push(last+sec_last);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        int total=0;
        while(!stack.isEmpty()){
            total+=stack.pop();
        }
        return total;
      
    }
}