class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        if (m > n) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency of s1 and first window of s2
        for (int i = 0; i < m; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        // Slide the window
        for (int right = m; right < n; right++) {

            // Add new character
            freq2[s2.charAt(right) - 'a']++;

            // Remove old character
            freq2[s2.charAt(right - m) - 'a']--;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}