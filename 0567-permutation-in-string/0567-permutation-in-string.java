class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        char[] target = s1.toCharArray();
        Arrays.sort(target);

        for (int i = 0; i <= n - m; i++) {

            char[] window = s2.substring(i, i + m).toCharArray();
            Arrays.sort(window);

            if (Arrays.equals(target, window)) {
                return true;
            }
        }

        return false;
    }
}