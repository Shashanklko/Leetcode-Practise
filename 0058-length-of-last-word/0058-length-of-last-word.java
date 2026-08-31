class Solution {
    public int lengthOfLastWord(String s) {
      String[] word = s.split(" ");
      int n = word.length;
      return word[n-1].length();  
    }
}