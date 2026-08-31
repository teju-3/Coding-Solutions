
class Solution {
    static int closestNumber(int n, int m) {
        // Find quotient
        int q = n / m;

        // First possible closest number
        int n1 = m * q;

        // Second possible closest number
        int n2;
        if ((n > 0 && m > 0) || (n < 0 && m < 0)) {
            n2 = m * (q + 1);
        } else {
            n2 = m * (q - 1);
        }

        // Compare absolute differences
        int diff1 = Math.abs(n - n1);
        int diff2 = Math.abs(n - n2);

        if (diff1 < diff2) {
            return n1;
        } else if (diff2 < diff1) {
            return n2;
        } else {
            // If differences are equal, return the one with the maximum absolute value
            return Math.abs(n1) > Math.abs(n2) ? n1 : n2;
        }
    }
}