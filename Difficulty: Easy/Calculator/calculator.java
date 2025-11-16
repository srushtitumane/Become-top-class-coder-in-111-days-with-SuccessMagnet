class Solution {
    public void calculate(int a, int b, int operator) {

        int result;

        if (operator == 1) {
            result = a + b;
            System.out.println(result);
        }
        else if (operator == 2) {
            result = a - b;
            System.out.println(result);
        }
        else if (operator == 3) {
            result = a * b;
            System.out.println(result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
