class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length();
        int n = s.length();
        if(m>n) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0 ; i < m ;i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1 ,freq2)) ans.add(0);
        for(int right = m ; right<n;right++){
            freq2[s.charAt(right)-'a']++;
            freq2[s.charAt(right-m)-'a']--;
            if(Arrays.equals(freq1 ,freq2)) ans.add(right-m+1);
        }
        return ans;
    }
}