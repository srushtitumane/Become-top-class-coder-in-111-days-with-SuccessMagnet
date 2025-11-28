class Solution {
    public static ArrayList<Integer> subsetXOR(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int X = 0;
        for(int i = 1; i <= n; i++){
            X ^= i;
        }
        
        // Case 1: XOR(1..n) already equals n → take all numbers
        if(X == n){
            for(int i = 1; i <= n; i++){
                result.add(i);
            }
            return result;
        }
        
        // Case 2: Remove one number to make XOR = n
        int remove = X ^ n;
        
        if(remove >= 1 && remove <= n){
            for(int i = 1; i <= n; i++){
                if(i != remove) result.add(i);
            }
        } 
        else {
            for(int i = 1; i <= n; i++){
                if(i != n) result.add(i);
            }
        }
        
        return result;
    }
}
