class Solution {

    public double myPow(double x, int n) {
        long power = (long) n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return p_helper(x, power);
    }

    public double p_helper(double x, long n) {

        if (n == 0) {
            return 1;
        }

        double half = p_helper(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }
}