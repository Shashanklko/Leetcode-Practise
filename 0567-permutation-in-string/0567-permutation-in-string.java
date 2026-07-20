class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m>n) return false;
        int[] target = new int[26];
        int[] window = new int[26];
        for(int i = 0 ; i<m;i++){
            target[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++; 
        }
        if(Arrays.equals(target , window)){
            return true;
        }
        for(int right = m ; right<n;right++){
            window[s2.charAt(right)-'a']++;
            window[s2.charAt(right-m)-'a']--;
            if(Arrays.equals(target , window)){
            return true;
            }
        }
        return false;
    }
}