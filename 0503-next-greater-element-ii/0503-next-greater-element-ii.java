class Solution {
    public int[] nextGreaterElements(int[] nums) {
       Stack<Integer> stack = new Stack<>();
       int[] res=new int[nums.length];
       for(int i=0;i<nums.length;i++)
         res[i]=-1;
        for(int i=2*nums.length-1;i>=0;i--){
            int rem=i%nums.length;
            while(!stack.isEmpty() && nums[rem]>=stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty() && i<nums.length){
                res[i]=stack.peek();
            }
            stack.push(nums[rem]);
        }
        return res;
         
    }
}