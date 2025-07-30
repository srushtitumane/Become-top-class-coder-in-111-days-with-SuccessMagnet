import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>100){
            System.out.print("Big");
        }
        else if(a<=100){
            System.out.print("Number");
        }
        System.out.println();
    }
}