class Solution {
    public static int countSetBits(int n) {
        int count = 0;

        for (int i = 0; i < 32; i++) {
            long bitMask = 1L << i; // Use long to avoid overflow

            if (bitMask > n) break; // No need to check higher bits

            long fullCycles = (n + 1) / (bitMask * 2);
            count += fullCycles * bitMask;

            long remainder = (n + 1) % (bitMask * 2);
            if (remainder > bitMask) {
                count += remainder - bitMask;
            }
        }

        return count;
    }
}


