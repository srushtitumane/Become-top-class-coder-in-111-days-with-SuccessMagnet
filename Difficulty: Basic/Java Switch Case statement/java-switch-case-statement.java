import java.util.List;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        switch(choice) {
            case 1:
                double R = arr.get(0);
                double areaCircle = Math.PI * R * R;
                return areaCircle;
            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                double areaRect = L * B;
                return areaRect;
            default:
                return 0;  // Optional, in case of invalid choice
        }
    }
}
