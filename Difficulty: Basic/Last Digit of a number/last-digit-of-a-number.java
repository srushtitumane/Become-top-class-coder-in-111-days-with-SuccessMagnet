class Solution {
    public int lastDigit(int n) {
        // Code here
        int no;
        no=n%10;
        return Math.abs(no);
    }
}